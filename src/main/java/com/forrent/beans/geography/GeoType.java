package com.forrent.beans.geography;

/**
 * Levels of the geography hierarchy.
 */
public enum GeoType
{
    AREA,
    CITY,
    METRO,
    STATE,
    ZIP,
    NEIGHBORHOOD,
    INSTITUTION;

    public String toLowerCase()
    {
        return this.toString().toLowerCase();
    }
}
