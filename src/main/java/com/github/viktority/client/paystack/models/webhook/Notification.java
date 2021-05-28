package com.github.viktority.client.paystack.models.webhook;

import java.util.Date;

public class Notification{
    private Date sent_at;
    private String channel;

    public Date getSent_at() {
        return sent_at;
    }

    public void setSent_at(Date sent_at) {
        this.sent_at = sent_at;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
