package com.forrent.pojo.listing;

public class Listing
{
    private Account account;
    private Geography geo;
    private String id;
    private Metadata metadata;
    private String name;

    public Account getAccount() {
        return this.account;
    }

    public Geography getGeo() {
        return this.geo;
    }

    public String getId()
    {
        return this.id;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }

    public void setGeo(final Geography geo) {
        this.geo = geo;
    }

    public Listing setId(final String id)
    {
        this.id = id;
        return this;
    }

    public void setMetadata(final Metadata metadata) {
        this.metadata = metadata;
    }

    public Listing setName(final String name)
    {
        this.name = name;
        return this;
    }
}
