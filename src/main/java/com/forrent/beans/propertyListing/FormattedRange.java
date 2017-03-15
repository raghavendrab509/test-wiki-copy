package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FormattedRange<T> extends Range<T> implements Serializable
{
    private String formatted;

    public FormattedRange(final T low, final T high, final String formatted) {
        super(low, high);
        this.formatted = formatted;
    }

    public FormattedRange() {
        super();
    }

    public String getFormatted() {
        return this.formatted;
    }

    public void setFormatted(final String formatted) {
        this.formatted = formatted;
    }
}
