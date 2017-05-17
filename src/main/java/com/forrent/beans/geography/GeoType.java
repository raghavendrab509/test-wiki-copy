package com.forrent.beans.geography;

/**
 * Levels of the geography hierarchy.
 */
public enum GeoType
{
    AREA,
    CITY,
    COUNTRY,
    METRO,
    SCHOOL,
    STATE,
    ZIP,
    NEIGHBORHOOD,
    INSTITUTION;

    public String toLowerCase()
    {
        return this.toString().toLowerCase();
    }
}
