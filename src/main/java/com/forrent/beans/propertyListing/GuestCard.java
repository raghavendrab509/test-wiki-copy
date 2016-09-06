package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class GuestCard implements Serializable{

    private List<Recipient> recipients = new ArrayList<Recipient>();
    private GuestCardText text;
    private String emailFormat;
    private final List<String> requiredFields = new ArrayList<String>();
    private List<OptIns> optIns = new ArrayList<OptIns>();

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

    public List<String> getRequiredFields() {
        return this.requiredFields;
    }

    public List<OptIns> getOptIns() {
        return this.optIns;
    }

    public void setOptIns(final List<OptIns> optIns) {
       this.optIns = optIns;
    }

    public void addRecipient(final Recipient recipient){
        this.recipients.add(recipient);
    }

    public void addRequiredField(final String requiredField){
        this.requiredFields.add(requiredField);
    }

    public void addOptIns(final OptIns optIns){
        this.optIns.add(optIns);
    }

}
