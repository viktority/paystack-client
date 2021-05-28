package com.github.viktority.client.paystack.models.payment;

public class Transfer {
    private int amount;
    private String reason;
    private String recipient;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Transfer() {
    }

    public Transfer(int amount, String reason, String recipient) {
        this.amount = amount;
        this.reason = reason;
        this.recipient = recipient;
    }
}
