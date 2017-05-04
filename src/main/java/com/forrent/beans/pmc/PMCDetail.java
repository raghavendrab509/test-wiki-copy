package com.forrent.beans.pmc;

public class PMCDetail
{
    private String email;
    private String url;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String fax;
    private Boolean isActive;
    private Integer listingCount;
    private String discountNotes;
    private Boolean displayProfileLink;
    private Integer externalMappingId;

    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(final String email)
    {
        this.email = email;
    }
    public String getUrl()
    {
        return this.url;
    }
    public void setUrl(final String url)
    {
        this.url = url;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(final String address)
    {
        this.address = address;
    }
    public String getCity()
    {
        return this.city;
    }
    public void setCity(final String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return this.state;
    }
    public void setState(final String state)
    {
        this.state = state;
    }
    public String getZip()
    {
        return this.zip;
    }
    public void setZip(final String zip)
    {
        this.zip = zip;
    }
    public String getPhone()
    {
        return this.phone;
    }
    public void setPhone(final String phone)
    {
        this.phone = phone;
    }
    public String getFax()
    {
        return this.fax;
    }
    public void setFax(final String fax)
    {
        this.fax = fax;
    }
    public String getDiscountNotes()
    {
        return this.discountNotes;
    }
    public void setDiscountNotes(final String discountNotes)
    {
        this.discountNotes = discountNotes;
    }
    public Boolean getDisplayProfileLink()
    {
        return this.displayProfileLink;
    }
    public void setDisplayProfileLink(final Boolean displayProfileLink)
    {
        this.displayProfileLink = displayProfileLink;
    }
    public Integer getExternalMappingId()
    {
        return this.externalMappingId;
    }
    public void setExternalMappingId(final Integer externalMappingId)
    {
        this.externalMappingId = externalMappingId;
    }
    public Integer getListingCount()
    {
        return this.listingCount;
    }
    public void setListingCount(final Integer listingCount)
    {
        this.listingCount = listingCount;
    }
    public Boolean getIsActive()
    {
        return this.isActive;
    }
    public void setIsActive(final Boolean isActive)
    {
        this.isActive = isActive;
    }

}
