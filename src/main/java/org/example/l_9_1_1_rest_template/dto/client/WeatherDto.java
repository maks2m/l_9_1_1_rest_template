package org.example.l_9_1_1_rest_template.dto.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeatherDto {
    private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private CurrentUnitsWeatherDto current_units;
    private CurrentWeatherDto current;
    private HourlyUnitsWeatherDto hourly_units;
    private HourlyWeatherDto hourly;
}

