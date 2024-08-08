package org.example.l_9_1_1_rest_template.dto.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrentWeatherModel {
    private double latitude;
    private double longitude;
    private double temperature;
    private double windSpeed;
}
