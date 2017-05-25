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
    private String id;

    /**
     * Human readable name of GeoEntity.
     */
    private String name;

    /**
     * GeoType of entity.
     */
    private GeoType type;

    public GeoEntityReference() {}

    public GeoEntityReference(final GeoId id, final String name)
    {
        this.id = id.toString();
        this.type = id.getGeoType();
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public GeoType getType() {
        return this.type;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setType(final GeoType type) {
        this.type = type;
    }
}
