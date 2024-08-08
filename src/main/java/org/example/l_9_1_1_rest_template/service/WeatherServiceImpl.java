package org.example.l_9_1_1_rest_template.service;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_1_rest_template.client.WeatherClient;
import org.example.l_9_1_1_rest_template.dto.client.WeatherDto;
import org.example.l_9_1_1_rest_template.dto.client.WeatherEnum;
import org.example.l_9_1_1_rest_template.dto.model.CurrentWeatherModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherClient weatherClient;

    @Override
    public CurrentWeatherModel getCurrentWeather(double latitude, double longitude) {
        List<WeatherEnum> current = List.of(WeatherEnum.TEMPERATURE_2M, WeatherEnum.WIND_SPEED_10M);
        List<WeatherEnum> hourly = List.of(WeatherEnum.TEMPERATURE_2M, WeatherEnum.RELATIVE_HUMIDITY_2M, WeatherEnum.WIND_SPEED_10M);
        WeatherDto weather = weatherClient.getWeather(latitude, longitude, current, hourly);
        return CurrentWeatherModel.builder()
                .latitude(weather.getLatitude())
                .longitude(weather.getLongitude())
                .temperature(weather.getCurrent().getTemperature_2m())
                .windSpeed(weather.getCurrent().getWind_speed_10m())
                .build();
    }
}
