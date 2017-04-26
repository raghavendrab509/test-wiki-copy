package com.forrent.beans.geography.id;

import com.forrent.beans.geography.GeoType;

/**
 * Primary key of geo entity.
 *
 * A combination of the entity type and a unique key (for example "city.12345-05").
 */
public class GeoId
{
    private final GeoType geoType;
    private final String key;

    public GeoId(final GeoType geoType, final String key)
    {
        this.geoType = geoType;
        this.key = key;
    }

    /**
     * Build from a string like "city.12345-05" or "city.12345-05.boundary".
     */
    public GeoId(final String id)
    {
        final String[] parts = id.split("\\.");
        if (parts.length < 2) {
            throw new IllegalArgumentException(String.format("%s is not a valid geo id.", id));
        }

        this.geoType = GeoType.valueOf(parts[0].toUpperCase());
        this.key = parts[1];
    }

    protected GeoId(final String geoType, final String key)
    {
        this.geoType = GeoType.valueOf(geoType);
        this.key = key;
    }

    public GeoType getGeoType()
    {
        return this.geoType;
    }

    public String getKey()
    {
        return this.key;
    }

    @Override
    public String toString()
    {
        return String.format("%s.%s", this.geoType.toLowerCase(), this.key);
    }
}
