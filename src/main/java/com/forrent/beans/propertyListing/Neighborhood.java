package com.forrent.beans.propertyListing;

public class Neighborhood implements IObjectWithId
{
    private String id;
    private String name;

    @Override
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
