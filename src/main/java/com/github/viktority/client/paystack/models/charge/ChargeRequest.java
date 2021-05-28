package com.github.viktority.client.paystack.models.charge;

public class ChargeRequest {
    private String authorization_code;
    private String email;
    private String amount;

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public ChargeRequest(String authorization_code, String email, String amount) {
        this.authorization_code = authorization_code;
        this.email = email;
        this.amount = amount;
    }

    public ChargeRequest() {
    }
}
