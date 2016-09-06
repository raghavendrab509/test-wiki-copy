package com.forrent.beans.propertyListing;

public class GuestCardRequiredFieldData {

    private String greeting;
    private String promo;
    private String gcEmail1;
    private String gcEmail2;
    private String gcEmail3;
    private String customGuestCardResponse;
    private String emailFormat;
    private Boolean reqBaths;
    private Boolean reqBeds;
    private Boolean reqComments;
    private Boolean reqMoveDate;
    private Boolean reqPhone;

    public String getGreeting() {
        return this.greeting;
    }

    public void setGreeting(final String greeting) {
        this.greeting = greeting;
    }

    public String getPromo() {
        return this.promo;
    }

    public void setPromo(final String promo) {
        this.promo = promo;
    }

    public String getGcEmail1() {
        return this.gcEmail1;
    }

    public void setGcEmail1(final String gcEmail1) {
        this.gcEmail1 = gcEmail1;
    }

    public String getGcEmail2() {
        return this.gcEmail2;
    }

    public void setGcEmail2(final String gcEmail2) {
        this.gcEmail2 = gcEmail2;
    }

    public String getGcEmail3() {
        return this.gcEmail3;
    }

    public void setGcEmail3(final String gcEmail3) {
        this.gcEmail3 = gcEmail3;
    }

    public String getCustomGuestCardResponse() {
        return this.customGuestCardResponse;
    }

    public void setCustomGuestCardResponse(final String customGuestCardResponse) {
        this.customGuestCardResponse = customGuestCardResponse;
    }

    public String getEmailFormat() {
        return this.emailFormat;
    }

    public void setEmailFormat(final String emailFormat) {
        this.emailFormat = emailFormat;
    }

    public Boolean getReqBaths() {
        return this.reqBaths;
    }

    public void setReqBaths(final Boolean reqBaths) {
        this.reqBaths = reqBaths;
    }

    public Boolean getReqBeds() {
        return this.reqBeds;
    }

    public void setReqBeds(final Boolean reqBeds) {
        this.reqBeds = reqBeds;
    }

    public Boolean getReqComments() {
        return this.reqComments;
    }

    public void setReqComments(final Boolean reqComments) {
        this.reqComments = reqComments;
    }

    public Boolean getReqMoveDate() {
        return this.reqMoveDate;
    }

    public void setReqMoveDate(final Boolean reqMoveDate) {
        this.reqMoveDate = reqMoveDate;
    }

    public Boolean getReqPhone() {
        return this.reqPhone;
    }

    public void setReqPhone(final Boolean reqPhone) {
        this.reqPhone = reqPhone;
    }
}
