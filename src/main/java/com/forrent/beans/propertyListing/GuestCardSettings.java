package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class GuestCardSettings implements Serializable{

    private List<Recipient> recipients = new ArrayList<>();
    private GuestCardText text;
    private String emailFormat;
    private List<GuestCardField> requiredFields = new ArrayList<>();
    private List<OptIns> optIns = new ArrayList<>();

    public List<Recipient> getRecipients() {
        return this.recipients;
    }

    public void setRecipients(final List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public GuestCardText getText() {
        return this.text;
    }

    public void setText(final GuestCardText text) {
        this.text = text;
    }

    public String getEmailFormat() {
        return this.emailFormat;
    }

    public void setEmailFormat(final String emailFormat) {
        this.emailFormat = emailFormat;
    }

    public List<GuestCardField> getRequiredFields() {
        return this.requiredFields;
    }

    public List<OptIns> getOptIns() {
        return this.optIns;
    }

    public void setOptIns(final List<OptIns> optIns) {
       this.optIns = optIns;
    }

    public void addRecipient(final Recipient recipient) {
        this.recipients.add(recipient);
    }

    public void setRequiredFields(final List<GuestCardField> requiredFields) {
        this.requiredFields = requiredFields;
    }

    public void addOptIns(final OptIns optIns) {
        this.optIns.add(optIns);
    }

}
