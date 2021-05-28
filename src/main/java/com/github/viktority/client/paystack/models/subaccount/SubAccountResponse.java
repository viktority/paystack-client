package com.github.viktority.client.paystack.models.subaccount;

public class SubAccountResponse {

    private boolean status;
    private String message;
    private SubAccountResponseData data;

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

    public SubAccountResponseData getData() {
        return data;
    }

    public void setData(SubAccountResponseData data) {
        this.data = data;
    }
}
