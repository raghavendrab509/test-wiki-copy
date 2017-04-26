package com.forrent.beans.common;

public class TargetGeography
{
    private String id;
    private String name;
    private TargetGeographyType type;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public TargetGeographyType getType() {
        return this.type;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setType(final TargetGeographyType type) {
        this.type = type;
    }
}