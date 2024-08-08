package org.example.l_9_1_1_rest_template.dto.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HourlyUnitsWeatherDto {
    private String time;
    private String temperature_2m;
    private String relative_humidity_2m;
    private String wind_speed_10m;
}
