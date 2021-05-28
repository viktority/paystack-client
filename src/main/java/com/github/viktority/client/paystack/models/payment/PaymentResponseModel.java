package com.github.viktority.client.paystack.models.payment;

import java.util.List;

public class PaymentResponseModel {
    private boolean status;
    private String message;
    private List<Datum> data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }
}


