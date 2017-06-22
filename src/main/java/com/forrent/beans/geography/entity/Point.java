package com.forrent.beans.geography.entity;

public class Point
{
    private Double lat;
    private Double lon;

    public Point() {}

    public Point(final Double lon, final Double lat)
    {
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLat() {
        return this.lat;
    }

    public void setLat(final Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return this.lon;
    }

    public void setLon(final Double lon) {
        this.lon = lon;
    }
}