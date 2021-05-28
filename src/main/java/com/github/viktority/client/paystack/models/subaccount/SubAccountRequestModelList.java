package com.github.viktority.client.paystack.models.subaccount;

import java.util.List;

public class SubAccountRequestModelList {
    private boolean status;
    private String message;
    private List<SubAccountResponseData> data;
    private Meta meta;

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

    public List<SubAccountResponseData> getData() {
        return data;
    }

    public void setData(List<SubAccountResponseData> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}