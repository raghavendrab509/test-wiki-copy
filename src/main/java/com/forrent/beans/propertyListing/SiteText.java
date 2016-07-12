package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SiteText implements Serializable
{
    private String[] en;
    private String[] es;

    public String[] getEn() {
        return en;
    }

    public void setEn(final String[] en) {
        this.en = en;
    }

    public String[] getEs() {
        return es;
    }

    public void setEs(final String[] es) {
        this.es = es;
    }

}
