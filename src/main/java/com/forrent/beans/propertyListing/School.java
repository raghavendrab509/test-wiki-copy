package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class School implements Serializable
{
    private String schoolId;
    private String educationLevel;
    private String schoolName;

    public String getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(final String schoolId) {
        this.schoolId = schoolId;
    }

    public String getEducationLevel() {
        return this.educationLevel;
    }

    public void setEducationLevel(final String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(final String schoolName) {
        this.schoolName = schoolName;
    }
}
