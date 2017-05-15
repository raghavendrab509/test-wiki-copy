package com.forrent.beans.geography.entity;

import com.forrent.beans.geography.GeoType;
import com.forrent.beans.geography.id.GeoId;

public class GeoEntityReference
{
    private GeoId id;
    private String name;
    private GeoType type;

    public GeoEntityReference(final GeoId id, final String name) {
        this.id = id;
        this.name = name;
        this.type = id.getGeoType();
    }

    public GeoType getGeoType() {
        return this.id.getGeoType();
    }

    public GeoId getId() {
        return this.id;
    }

    public String getKey() {
        return this.id.getKey();
    }

    public String getName() {
        return this.name;
    }

    public GeoType getType() {
        return this.type;
    }

    public void setId(final GeoId id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setType(final GeoType type) {
        this.type = type;
    }
}
