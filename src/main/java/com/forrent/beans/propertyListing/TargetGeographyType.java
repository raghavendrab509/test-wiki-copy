package com.forrent.beans.propertyListing;

public enum TargetGeographyType
{
    CITY,
    INSTITUTION,
    METRO,
    SUPER_CITY;

    /**
     * Create from DB key.
     */
    public static TargetGeographyType fromKey(final String key)
            throws Exception
    {
        if (key == null) {
            throw new Exception("Key may not be null.");
        }

        switch (key.toLowerCase())
        {
            case "city":
                return CITY;

            case "institution":
                return INSTITUTION;

            case "metro":
                return METRO;

            case "super city":
                return SUPER_CITY;

            default:
                throw new Exception("Could not create enum TargetGeographyType key: " + key);
        }
    }
}
