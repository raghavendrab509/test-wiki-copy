package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FormattedRange implements Serializable
{
    private String formatted;
    private Integer high;
    private Integer low;

    public String getFormatted() {
        return this.formatted;
    }

    public Integer getHigh() {
        return this.high;
    }

    public Integer getLow() {
        return this.low;
    }

    public void setFormatted(final String formatted) {
        this.formatted = formatted;
    }

    public void setHigh(final Integer high) {
        this.high = high;
    }

    public void setLow(final Integer low) {
        this.low = low;
    }
}
