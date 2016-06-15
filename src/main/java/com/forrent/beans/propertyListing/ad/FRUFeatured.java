package com.forrent.beans.propertyListing.ad;

public class FRUFeatured extends BaseAd
{
    private String collegeId;
    private String collegeName;

    public String getCollegeName()
    {
        return collegeName;
    }

    public void setCollegeName(String collegeName)
    {
        this.collegeName = collegeName;
    }

    public String getCollegeId()
    {
        return collegeId;
    }

    public void setCollegeId(String collegeId)
    {
        this.collegeId = collegeId;
    }
}
