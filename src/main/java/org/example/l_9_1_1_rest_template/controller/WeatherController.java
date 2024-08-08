package org.example.l_9_1_1_rest_template.controller;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_1_rest_template.dto.model.CurrentWeatherModel;
import org.example.l_9_1_1_rest_template.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/current")
    public ResponseEntity<CurrentWeatherModel> getCurrentWeather(
            @RequestParam double latitude,
            @RequestParam double longitude
    ) {
        return ResponseEntity.ok(weatherService.getCurrentWeather(latitude, longitude));
    }


}
