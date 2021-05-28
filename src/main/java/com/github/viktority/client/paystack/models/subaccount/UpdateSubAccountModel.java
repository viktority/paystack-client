package com.github.viktority.client.paystack.models.subaccount;

public class UpdateSubAccountModel {
    private String primary_contact_email;
    private double percentage_charge;

    public String getPrimary_contact_email() {
        return primary_contact_email;
    }

    public void setPrimary_contact_email(String primary_contact_email) {
        this.primary_contact_email = primary_contact_email;
    }

    public double getPercentage_charge() {
        return percentage_charge;
    }

    public void setPercentage_charge(double percentage_charge) {
        this.percentage_charge = percentage_charge;
    }
}
