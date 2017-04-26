package com.forrent.beans.common;

public enum TargetGeographyType
{
    CITY,
    INSTITUTION,
    METRO,
    SUPER_CITY;

    /**
     * Create from DB key.
     *
     * @param key Key
     * @return TargetGeographyType
     * @throws Exception Throws java.lang.Exception
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
