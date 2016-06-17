package com.forrent.beans.propertyListing.featuredListing;

public class FRUFeatured extends BaseFeaturedListing
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
