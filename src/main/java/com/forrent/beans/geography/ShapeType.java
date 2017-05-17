package com.forrent.beans.geography;

/**
 * Types of 2d geography shapes available.
 */
public enum ShapeType
{
    BOUNDARY,
    CENTER;

    public String toLowerCase()
    {
        return this.toString().toLowerCase();
    }
}
