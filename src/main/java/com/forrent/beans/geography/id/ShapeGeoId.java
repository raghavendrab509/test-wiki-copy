package com.forrent.beans.geography.id;

import com.forrent.beans.geography.GeoType;
import com.forrent.beans.geography.ShapeType;

/**
 * Extension of GeoId to include a shape type (for example "city.12345-05.boundary").
 */
public class ShapeGeoId extends GeoId
{
    private final ShapeType shape;

    public ShapeGeoId(final GeoType geo, final String id, final ShapeType shape)
    {
        super(geo, id);
        this.shape = shape;
    }

    /**
     * Build from a string like "city.12345-05.boundary".
     */
    public ShapeGeoId(final String id)
    {
        super(id);

        final String[] parts = id.split("\\.");
        if (parts.length < 3) {
            throw new IllegalArgumentException(String.format("%s is not a valid geo shape id.", id));
        }

        this.shape = ShapeType.valueOf(parts[2].toUpperCase());
    }

    public ShapeType getShape()
    {
        return this.shape;
    }

    @Override
    public String toString()
    {
        return String.format("%s.%s", super.toString(), this.shape.toLowerCase());
    }
}

