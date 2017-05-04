package com.forrent.beans.pmc;

import com.forrent.beans.common.Listing;
import com.forrent.beans.common.ListingType;

@SuppressWarnings("serial")
public class PropertyManagementCommunityListing extends Listing
{
    private PMCDetail detail = new PMCDetail();

    public PropertyManagementCommunityListing()
    {
        this.listingType = ListingType.PMC;
    }

    public PMCDetail getDetail()
    {
        return this.detail;
    }

    public void setDetail(final PMCDetail detail)
    {
        this.detail = detail;
    }

}
