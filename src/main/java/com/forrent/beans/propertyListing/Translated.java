package com.forrent.beans.propertyListing;

import com.forrent.beans.common.Locale;

public class Translated<T>
{
    private T en;
    private T es;

    public T getEn() {
        return this.en;
    }

    public T getEs() {
        return this.es;
    }

    public void setEn(final T en) {
        this.en = en;
    }

    public void setEs(final T es) {
        this.es = es;
    }

    public void set(final T value, final String locale)
    {
        this.set(value, Locale.valueOf(locale));
    }

    public void set(final T value, final Locale locale)
    {
        if (locale == Locale.EN) {
            this.en = value;
        } else if (locale == Locale.ES) {
            this.es = value;
        }
    }

    public T get(final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            return this.en;
        } else if (Locale.valueOf(locale) == Locale.ES) {
            return this.es;
        }

        return null;
    }
}
