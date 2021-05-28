package com.github.viktority.client.paystack.models.subaccount;

public class SubAccountRequestModel {
    private String business_name;
    private String settlement_bank;
    private String account_number;
    private double percentage_charge;

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getSettlement_bank() {
        return settlement_bank;
    }

    public void setSettlement_bank(String settlement_bank) {
        this.settlement_bank = settlement_bank;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getPercentage_charge() {
        return percentage_charge;
    }

    public void setPercentage_charge(double percentage_charge) {
        this.percentage_charge = percentage_charge;
    }
}
