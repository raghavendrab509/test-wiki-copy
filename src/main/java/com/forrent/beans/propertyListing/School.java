package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class School implements IObjectWithId, Serializable
{
    private String educationLevel;
    private String id;
    private String name;

    public String getEducationLevel() {
        return this.educationLevel;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setEducationLevel(final String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setId(final String schoolId) {
        this.id = schoolId;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
