package com.forrent.beans.geography.entity;

class RelationshipCollection
{
    private GeoEntityReference area;
    private GeoEntityReference city;
    private GeoEntityReference country;
    private GeoEntityReference metro;
    private GeoEntityReference state;

    public GeoEntityReference getArea() {
        return this.area;
    }

    public GeoEntityReference getCity() {
        return this.city;
    }

    public GeoEntityReference getCountry() {
        return this.country;
    }

    public GeoEntityReference getMetro() {
        return this.metro;
    }

    public GeoEntityReference getState() {
        return this.state;
    }

    public void setArea(final GeoEntityReference area) {
        this.area = area;
    }

    public void setCity(final GeoEntityReference city) {
        this.city = city;
    }

    public void setCountry(final GeoEntityReference country) {
        this.country = country;
    }

    public void setMetro(final GeoEntityReference metro) {
        this.metro = metro;
    }

    public void setState(final GeoEntityReference state) {
        this.state = state;
    }
}
