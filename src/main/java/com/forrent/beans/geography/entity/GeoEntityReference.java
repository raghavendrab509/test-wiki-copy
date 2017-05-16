package com.forrent.beans.geography.entity;

import com.forrent.beans.geography.GeoType;
import com.forrent.beans.geography.id.GeoId;

/**
 * This class is meant to serve as a simple placeholder to represent a Geographical Entity.
 * It contains an id for uniquely identifying the entity and a name for human readability.
 */
public class GeoEntityReference
{
    /**
     * Id unique to Geographical Entity.
     */
    protected GeoId id;

    /**
     * Human readable name of GeoEntity.
     */
    protected String name;

    public GeoEntityReference() {
    }

    public GeoEntityReference(final GeoId id, final String name) {
        this.id = id;
        this.name = name;
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
        return this.getId().getGeoType();
    }

    public void setId(final GeoId id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
