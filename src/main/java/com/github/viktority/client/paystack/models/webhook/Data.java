package com.github.viktority.client.paystack.models.webhook;

import java.util.Date;
import java.util.List;

public class Data {
    private int id;
    private String domain;
    private int amount;
    private String currency;
    private Object due_date;
    private boolean has_invoice;
    private Object invoice_number;
    private String description;
    private Object pdf_url;
    private List<Object> line_items;
    private List<Object> tax;
    private String request_code;
    private String status;
    private boolean paid;
    private Date paid_at;
    private Object metadata;
    private List<Notification> notifications;
    private String offline_reference;
    private Customer customer;
    private Date created_at;

    private String reference;
    private Object message;
    private String gateway_response;

    private String ip_address;
    private Log log;
    private Object fees;
    private Authorization authorization;
    private Plan plan;
    private String source;
    private Object source_details;
    private String reason;
    private Recipient recipient;
    private String transfer_code;
    private Object transferred_at;
    private Object failures;
    private Integration integration;
    private Object titan_code;
    private Session session;
    private Date updated_at;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getDue_date() {
        return due_date;
    }

    public void setDue_date(Object due_date) {
        this.due_date = due_date;
    }

    public boolean isHas_invoice() {
        return has_invoice;
    }

    public void setHas_invoice(boolean has_invoice) {
        this.has_invoice = has_invoice;
    }

    public Object getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(Object invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getPdf_url() {
        return pdf_url;
    }

    public void setPdf_url(Object pdf_url) {
        this.pdf_url = pdf_url;
    }

    public List<Object> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<Object> line_items) {
        this.line_items = line_items;
    }

    public List<Object> getTax() {
        return tax;
    }

    public void setTax(List<Object> tax) {
        this.tax = tax;
    }

    public String getRequest_code() {
        return request_code;
    }

    public void setRequest_code(String request_code) {
        this.request_code = request_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getPaid_at() {
        return paid_at;
    }

    public void setPaid_at(Date paid_at) {
        this.paid_at = paid_at;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public String getOffline_reference() {
        return offline_reference;
    }

    public void setOffline_reference(String offline_reference) {
        this.offline_reference = offline_reference;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getGateway_response() {
        return gateway_response;
    }

    public void setGateway_response(String gateway_response) {
        this.gateway_response = gateway_response;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Object getFees() {
        return fees;
    }

    public void setFees(Object fees) {
        this.fees = fees;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getSource_details() {
        return source_details;
    }

    public void setSource_details(Object source_details) {
        this.source_details = source_details;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public String getTransfer_code() {
        return transfer_code;
    }

    public void setTransfer_code(String transfer_code) {
        this.transfer_code = transfer_code;
    }

    public Object getTransferred_at() {
        return transferred_at;
    }

    public void setTransferred_at(Object transferred_at) {
        this.transferred_at = transferred_at;
    }

    public Object getFailures() {
        return failures;
    }

    public void setFailures(Object failures) {
        this.failures = failures;
    }

    public Integration getIntegration() {
        return integration;
    }

    public void setIntegration(Integration integration) {
        this.integration = integration;
    }

    public Object getTitan_code() {
        return titan_code;
    }

    public void setTitan_code(Object titan_code) {
        this.titan_code = titan_code;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
