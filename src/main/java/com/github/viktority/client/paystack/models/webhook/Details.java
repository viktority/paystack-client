package com.github.viktority.client.paystack.models.webhook;


public class Details{
    private String account_number;
    private Object account_name;
    private String bank_code;
    private String bank_name;
    private Object authorization_code;

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public Object getAccount_name() {
        return account_name;
    }

    public void setAccount_name(Object account_name) {
        this.account_name = account_name;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public Object getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(Object authorization_code) {
        this.authorization_code = authorization_code;
    }
}
