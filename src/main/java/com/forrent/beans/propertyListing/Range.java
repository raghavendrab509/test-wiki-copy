package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Range<T> implements Serializable
{
    private T high;
    private T low;

    public Range(final T low, final T high) {
        this.low = low;
        this.high = high;
    }

    public Range() {
        this.high = null;
        this.low = null;
    }

    public T getHigh() {
        return this.high;
    }

    public void setHigh(final T high) {
        this.high = high;
    }

    public T getLow() {
        return this.low;
    }

    public void setLow(final T low) {
        this.low = low;
    }
}