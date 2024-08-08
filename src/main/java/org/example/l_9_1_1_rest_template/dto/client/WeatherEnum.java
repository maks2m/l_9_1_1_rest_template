package org.example.l_9_1_1_rest_template.dto.client;

public enum WeatherEnum {
    TEMPERATURE_2M("temperature_2m"),
    RELATIVE_HUMIDITY_2M("relative_humidity_2m"),
    WIND_SPEED_10M("wind_speed_10m");

    private final String value;

    WeatherEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
