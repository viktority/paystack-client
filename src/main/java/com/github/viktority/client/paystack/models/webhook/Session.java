package com.github.viktority.client.paystack.models.webhook;

public class Session{
    private String provider;
    private String id;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
