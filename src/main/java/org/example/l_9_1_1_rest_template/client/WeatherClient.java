package org.example.l_9_1_1_rest_template.client;

import org.example.l_9_1_1_rest_template.dto.client.WeatherDto;
import org.example.l_9_1_1_rest_template.dto.client.WeatherEnum;

import java.util.List;

public interface WeatherClient {

    WeatherDto getWeather(double latitude, double longitude, List<WeatherEnum> current, List<WeatherEnum> hourly);

}
