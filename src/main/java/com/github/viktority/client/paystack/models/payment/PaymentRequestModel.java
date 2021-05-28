package com.github.viktority.client.paystack.models.payment;

import java.util.List;

public class PaymentRequestModel {
    private String currency;
    private String source;
    private List<Transfer> transfers;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
}

