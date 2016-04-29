package com.forrent.beans.listing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Listing implements Serializable
{
    private Account account;
    private Geography geo;
    private String id;

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }

    public Geography getGeo() {
        return this.geo;
    }

    public void setGeo(final Geography geo) {
        this.geo = geo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }
}
