package com.forrent.pojo.listing;

import java.util.ArrayList;
import java.util.List;

public class GeographyPoint
{
    private List<Double> coordinates;
    private final String type = "Point";

    public List<Double> getCoordinates()
    {
        return this.coordinates;
    }

    public String getType()
    {
        return this.type;
    }

    public void setCoordinates(final Double lon, final Double lat)
    {
        this.coordinates = new ArrayList<Double>();
        this.coordinates.add(lon);
        this.coordinates.add(lat);
    }
}
