package com.forrent.beans.pmc;

import com.forrent.beans.common.PropertyListingEntity;
import com.forrent.beans.common.PropertyListingEntityType;

@SuppressWarnings("serial")
public class PMC extends PropertyListingEntity
{
    private PMCDetail pmcDetail = new PMCDetail();

    public PMC()
    {
        this.entityType = PropertyListingEntityType.PMC;
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
