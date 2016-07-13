package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class SiteText implements Serializable
{
    private List<String> en;
    private List<String> es;

    public List<String> getEn() {
        return en;
    }

    public void setEn(final List<String> en) {
        this.en = en;
    }

    public List<String> getEs() {
        return es;
    }

    public void setEs(final List<String> es) {
        this.es = es;
    }

}
