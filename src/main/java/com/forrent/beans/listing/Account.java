package com.forrent.beans.listing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Account implements Serializable
{
    private String package_name;

    public String getPackage_name()
    {
        return this.package_name;
    }

    public void setPackage_name(final String package_name)
    {
        this.package_name = package_name;
    }
}
