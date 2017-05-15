package com.forrent.beans.geography.entity;

import com.forrent.beans.common.Context;
import com.forrent.beans.common.Locale;

public class ListingCount
{
    private Context context;
    private Locale locale;
    private Integer count;

    public Locale getLocale() {
        return this.locale;
    }

    public void setLocale(final Locale locale) {
        this.locale = locale;
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(final Context context) {
        this.context = context;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }
}
