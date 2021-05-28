package com.github.viktority.client.paystack.models.subaccount;

import java.util.Date;

public class SubAccountResponseData {
    private String business_name;
    private String account_number;
    private double percentage_charge;
    private String settlement_bank;
    private int integration;
    private String domain;
    private String subaccount_code;
    private boolean is_verified;
    private String settlement_schedule;
    private boolean active;
    private boolean migrate;
    private int id;
    private Date createdAt;
    private Date updatedAt;
    private String description;
    private String primary_contact_name;
    private String primary_contact_email;
    private String primary_contact_phone;
    private String metadata;

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
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

    public String getSettlement_bank() {
        return settlement_bank;
    }

    public void setSettlement_bank(String settlement_bank) {
        this.settlement_bank = settlement_bank;
    }

    public int getIntegration() {
        return integration;
    }

    public void setIntegration(int integration) {
        this.integration = integration;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSubaccount_code() {
        return subaccount_code;
    }

    public void setSubaccount_code(String subaccount_code) {
        this.subaccount_code = subaccount_code;
    }

    public boolean isIs_verified() {
        return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public String getSettlement_schedule() {
        return settlement_schedule;
    }

    public void setSettlement_schedule(String settlement_schedule) {
        this.settlement_schedule = settlement_schedule;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isMigrate() {
        return migrate;
    }

    public void setMigrate(boolean migrate) {
        this.migrate = migrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrimary_contact_name() {
        return primary_contact_name;
    }

    public void setPrimary_contact_name(String primary_contact_name) {
        this.primary_contact_name = primary_contact_name;
    }

    public String getPrimary_contact_email() {
        return primary_contact_email;
    }

    public void setPrimary_contact_email(String primary_contact_email) {
        this.primary_contact_email = primary_contact_email;
    }

    public String getPrimary_contact_phone() {
        return primary_contact_phone;
    }

    public void setPrimary_contact_phone(String primary_contact_phone) {
        this.primary_contact_phone = primary_contact_phone;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
