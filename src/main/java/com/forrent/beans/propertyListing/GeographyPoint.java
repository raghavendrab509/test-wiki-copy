package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class GeographyPoint implements Serializable
{
    private List<Double> coordinates = new ArrayList<Double>();
    private final String type = "Point";

    public List<Double> getCoordinates() {
        return this.coordinates;
    }

    public Double getCoordinates(final Integer index) {
        return this.coordinates.get(index);
    }

    public String getType() {
        return this.type;
    }

    public void setCoordinates(final List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
