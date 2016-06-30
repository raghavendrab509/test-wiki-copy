package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Neighborhood implements Serializable
{
    private String neighborhoodId;
    private String name;

    public String getNeighborhoodId() {
        return this.neighborhoodId;
    }

    public void setNeighborhoodId(final String neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
