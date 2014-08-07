package com.flipkart.hackaphone.app;

/**
 * Created by vinay.varma on 8/7/14.
 */
public class AppConfig {
    private static final String API_KEY="AIzaSyD8yQt-0RTZbhVG6jDbByJaAVHDi5YyyH8";
    private static final String MAP_HOST="https://maps.googleapis.com/maps/api/geocode/json";

    public static String getApiKey() {
        return API_KEY;
    }

    public static String getMapHost() {
        return MAP_HOST;
    }
}
