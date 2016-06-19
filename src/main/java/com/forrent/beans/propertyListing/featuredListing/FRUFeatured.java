package com.forrent.beans.propertyListing.featuredListing;

@SuppressWarnings("serial")
public class FRUFeatured extends BaseFeaturedListing
{
    private String collegeId;
    private String collegeName;

    public String getCollegeName()
    {
        return this.collegeName;
    }

    public void setCollegeName(final String collegeName)
    {
        this.collegeName = collegeName;
    }

    public String getCollegeId()
    {
        return this.collegeId;
    }

    public void setCollegeId(final String collegeId)
    {
        this.collegeId = collegeId;
    }
}
