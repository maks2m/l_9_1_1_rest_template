package org.example.l_9_1_1_rest_template.dto.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrentWeatherDto {
    private String time;
    private int interval;
    private double temperature_2m;
    private double wind_speed_10m;
}
