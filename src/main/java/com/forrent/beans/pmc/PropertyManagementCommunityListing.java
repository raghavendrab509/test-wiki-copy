package com.forrent.beans.pmc;

import com.forrent.beans.common.Listing;
import com.forrent.beans.common.ListingType;

@SuppressWarnings("serial")
public class PropertyManagementCommunityListing extends Listing
{
    private PMCDetail pmcDetail = new PMCDetail();

    public PropertyManagementCommunityListing()
    {
        this.listingType = ListingType.PMC;
    }

    public PMCDetail getPmcDetail()
    {
        return this.pmcDetail;
    }

    public void setPmcDetail(final PMCDetail detail)
    {
        this.pmcDetail = detail;
    }

}
