package com.forrent.beans.listing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FloorplanSummary implements Serializable
{
    private FormattedRange bathrooms;
    private FormattedRange bedrooms;
    private FormattedRange price;
    private FormattedRange squareFeet;

    public FormattedRange getBathrooms() {
        return this.bathrooms;
    }

    public FormattedRange getBedrooms() {
        return this.bedrooms;
    }

    public FormattedRange getPrice() {
        return this.price;
    }

    public FormattedRange getSquareFeet() {
        return this.squareFeet;
    }

    public void setBathrooms(final FormattedRange bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setBedrooms(final FormattedRange bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setPrice(final FormattedRange price) {
        this.price = price;
    }

    public void setSquareFeet(final FormattedRange squareFeet) {
        this.squareFeet = squareFeet;
    }
}
