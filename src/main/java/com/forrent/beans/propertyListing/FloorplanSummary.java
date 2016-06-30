package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FloorplanSummary implements Serializable
{
    private Range<Double> bathrooms = new Range<Double>();
    private Range<Integer> bedrooms = new Range<Integer>();
    private Range<Integer> price = new Range<Integer>();
    private Range<Integer> squareFeet = new Range<Integer>();

    public Range<Double> getBathrooms() {
        return this.bathrooms;
    }

    public Range<Integer> getBedrooms() {
        return this.bedrooms;
    }

    public Range<Integer> getPrice() {
        return this.price;
    }

    public Range<Integer> getSquareFeet() {
        return this.squareFeet;
    }

    public void setBathrooms(final Range<Double> bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setBedrooms(final Range<Integer> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setPrice(final Range<Integer> price) {
        this.price = price;
    }

    public void setSquareFeet(final Range<Integer> squareFeet) {
        this.squareFeet = squareFeet;
    }
}
