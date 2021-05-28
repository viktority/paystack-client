package com.github.viktority.client;

public class Paystack {
    public static final int DEFAULT_CONNECT_TIMEOUT = 30000;
    public static final int DEFAULT_READ_TIMEOUT = 80000;
    public static final String LIVE_API_BASE = "https://api.paystack.co";
    public static final String VERSION = "20.41.0";
    public static volatile String apiKey;
    public static volatile String clientId;
    public static volatile boolean enableTelemetry = true;
    public static volatile String partnerId;
    private static volatile int connectTimeout = -1;
    private static volatile int readTimeout = -1;
    private static volatile int maxNetworkRetries = 0;

    public static int getDefaultConnectTimeout() {
        return DEFAULT_CONNECT_TIMEOUT;
    }

    public static int getDefaultReadTimeout() {
        return DEFAULT_READ_TIMEOUT;
    }

    public static String getLiveApiBase() {
        return LIVE_API_BASE;
    }

    public static String getVERSION() {
        return VERSION;
    }

    public static String getApiKey() {
        return apiKey;
    }

    public static void setApiKey(String apiKey) {
        Paystack.apiKey = apiKey;
    }

    public static String getClientId() {
        return clientId;
    }

    public static void setClientId(String clientId) {
        Paystack.clientId = clientId;
    }

    public static boolean isEnableTelemetry() {
        return enableTelemetry;
    }

    public static void setEnableTelemetry(boolean enableTelemetry) {
        Paystack.enableTelemetry = enableTelemetry;
    }

    public static String getPartnerId() {
        return partnerId;
    }

    public static void setPartnerId(String partnerId) {
        Paystack.partnerId = partnerId;
    }

    public static int getConnectTimeout() {
        return connectTimeout;
    }

    public static void setConnectTimeout(int connectTimeout) {
        Paystack.connectTimeout = connectTimeout;
    }

    public static int getReadTimeout() {
        return readTimeout;
    }

    public static void setReadTimeout(int readTimeout) {
        Paystack.readTimeout = readTimeout;
    }

    public static int getMaxNetworkRetries() {
        return maxNetworkRetries;
    }

    public static void setMaxNetworkRetries(int maxNetworkRetries) {
        Paystack.maxNetworkRetries = maxNetworkRetries;
    }
}
