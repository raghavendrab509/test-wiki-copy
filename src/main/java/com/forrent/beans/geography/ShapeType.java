package com.forrent.beans.geography;

/**
 * Types of 2d geography shapes available.
 */
public enum ShapeType
{
    BOUNDARY,
    CENTER,
    NEARBY;

    public String toLowerCase()
    {
        return this.toString().toLowerCase();
    }
}
