package org.example.l_9_1_1_rest_template.service;

import org.example.l_9_1_1_rest_template.dto.model.CurrentWeatherModel;

public interface WeatherService {
    CurrentWeatherModel getCurrentWeather(double latitude, double longitude);
}
