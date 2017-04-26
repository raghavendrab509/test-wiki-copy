package com.forrent.beans.geography.entity;

import com.forrent.beans.geography.GeoType;
import com.forrent.beans.geography.id.GeoId;

class GeoEntityReference
{
    private final GeoId id;
    private final String name;

    public GeoEntityReference(final GeoId id, final String name) {
        this.id = id;
        this.name = name;
    }

    public GeoId getId() {
        return this.id;
    }

    public GeoType getGeoType() {
        return this.id.getGeoType();
    }

    public String getKey() {
        return this.id.getKey();
    }

    public String getName() {
        return this.name;
    }
}
