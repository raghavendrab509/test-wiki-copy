package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GuestCardText implements Serializable {

    private String greeting;
    private String promo;
    private String customResponse;

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

    public String getCustomResponse() {
        return this.customResponse;
    }

    public void setCustomResponse(final String customResponse) {
        this.customResponse = customResponse;
    }
}
