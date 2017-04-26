package com.forrent.beans.propertyListing;

import com.forrent.beans.common.IObjectWithId;

public class PhoneNumber implements IObjectWithId
{
    public static final String TYPE_APARTMENT_FAX = "AprtmntFax";
    public static final String TYPE_FB_CONNECT_1 = "FBCntct1";
    public static final String TYPE_FB_CONNECT_2 = "FBCntct2";
    public static final String TYPE_FRC_ES_UPGRADE_NUMBER = "FRC_ES_Upg";
    public static final String TYPE_FRU_PHONE_NUMBER = "FR-U_Num";
    public static final String TYPE_LOCAL = "LocPhnNum";
    public static final String TYPE_MARKETPLACE_NETWORK = "MplcNtwrk";
    public static final String TYPE_MOBILE_NUMBER = "Mobile";
    public static final String TYPE_SEM_NUMBER = "SEMPhnNum";
    public static final String TYPE_TEXT_MESSAGE = "TxtMsg";
    public static final String TYPE_TOLLFREE_INTERNET = "TollFreeIn";
    public static final String TYPE_TOLLFREE_LOCAL = "LocTollFre";

    private String areaCode;
    private String description;
    private String extension;
    private String id;
    private String number;
    private Boolean tracked;

    public String getAreaCode() {
        return this.areaCode;
    }

    public String getDescription() {
        return this.description;
    }

    public String getExtension() {
        return this.extension;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getNumber() {
        return this.number;
    }

    public Boolean getTracked() {
        return this.tracked;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setExtension(final String extension) {
        this.extension = extension;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public void setTracked(final Boolean tracked) {
        this.tracked = tracked;
    }

    /**
     * Format as e.164 international number.
     */
    public String toInternational() {
        return "+1" + this.areaCode + this.number;
    }
}
