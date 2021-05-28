package com.github.viktority.client.paystack.models.webhook;

public class WebhookModel {
    private String event;
    private Data data;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

