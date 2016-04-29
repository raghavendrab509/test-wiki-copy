package com.forrent.beans.listing;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class GeographyPoint implements Serializable
{
    private List<Double> coordinates;
    private final String type = "Point";

    public GeographyPoint() {}

    public List<Double> getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(final List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return this.type;
    }
}
