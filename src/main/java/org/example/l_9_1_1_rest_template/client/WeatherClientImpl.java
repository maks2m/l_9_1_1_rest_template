package org.example.l_9_1_1_rest_template.client;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_1_rest_template.dto.client.WeatherDto;
import org.example.l_9_1_1_rest_template.dto.client.WeatherEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class WeatherClientImpl implements WeatherClient {

    private final RestTemplate restTemplate;

    @Override
    public WeatherDto getWeather(double latitude, double longitude, List<WeatherEnum> current, List<WeatherEnum> hourly) {

        String url = "/v1/forecast?latitude={latitude}&longitude={longitude}&current={currentString}&hourly={hourlyString}";

        String currentString = current.stream()
                .map(WeatherEnum::getValue)
                .reduce((s, s2) -> String.join(",", s, s2))
                .orElse(null);
        String hourlyString = hourly.stream()
                .map(WeatherEnum::getValue)
                .reduce((s, s2) -> String.join(",", s, s2))
                .orElse(null);

        Map<String, String> map = new LinkedHashMap<>();
        map.put("latitude", String.valueOf(latitude));
        map.put("longitude", String.valueOf(longitude));
        map.put("currentString", currentString);
        map.put("hourlyString", hourlyString);
        ResponseEntity<WeatherDto> response = restTemplate.getForEntity(url, WeatherDto.class, map);

        return response.getBody();
    }
}
