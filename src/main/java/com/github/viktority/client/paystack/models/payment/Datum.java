package com.github.viktority.client.paystack.models.payment;

public class Datum {
    private String recipient;
    private int amount;
    private String transfer_code;
    private String currency;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransfer_code() {
        return transfer_code;
    }

    public void setTransfer_code(String transfer_code) {
        this.transfer_code = transfer_code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
