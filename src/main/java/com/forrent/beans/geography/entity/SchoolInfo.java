package com.forrent.beans.geography.entity;

public class SchoolInfo
{
    private String educationLevel;
    private String id;
    private String sector;
    private String type;

    public String getEducationLevel() {
        return this.educationLevel;
    }

    public String getId() {
        return this.id;
    }

    public String getSector() {
        return this.sector;
    }

    public String getType() {
        return this.type;
    }

    public void setEducationLevel(final String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setSector(final String sector) {
        this.sector = sector;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
