package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PhoneNumber implements Serializable
{
    public static final String TYPE_APARTMENT_FAX = "AprtmntFax";
    public static final String TYPE_LOCAL = "LocPhnNum";
    public static final String TYPE_TOLLFREE_INTERNET = "TollFreeIn";
    public static final String TYPE_TOLLFREE_LOCAL = "LocTollFre";
    public static final String TYPE_TEXT_MESSAGE = "TxtMsg";
    public static final String TYPE_MARKETPLACE_NETWORK = "MplcNtwrk";
    public static final String TYPE_FB_CONNECT_1 = "FBCntct1";
    public static final String TYPE_FB_CONNECT_2 = "FBCntct2";
    public static final String TYPE_FRC_ES_UPGRADE_NUMBER = "FRC_ES_Upg";

    private String areaCode;
    private String description;
    private String extension;
    private String number;
    private Boolean tracked;
    private String type;

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(final String extension) {
        this.extension = extension;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }
    public Boolean getTracked() {
        return this.tracked;
    }

    public void setTracked(final Boolean tracked) {
        this.tracked = tracked;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
