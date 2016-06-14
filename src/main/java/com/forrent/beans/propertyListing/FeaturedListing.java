package com.forrent.beans.propertyListing;


import com.forrent.beans.propertyListing.ad.*;

import java.util.List;

public class FeaturedListing
{
    private List<FRCFeatured> frcFeatured;
    private FRUFeatured fruFeatured;
    private Preferred preferred;
    private MobileSelect mobileSelect;
    private MobileExclusive mobileExclusive;
    private HeroVideo heroVideo;
    private Marquee marquee;

    public List<FRCFeatured> getFrcFeatured()
    {
        return frcFeatured;
    }

    public void setFrcFeatured(List<FRCFeatured> frcFeatured)
    {
        this.frcFeatured = frcFeatured;
    }

    public FRUFeatured getFruFeatured()
    {
        return fruFeatured;
    }

    public void setFruFeatured(FRUFeatured fruFeatured)
    {
        this.fruFeatured = fruFeatured;
    }

    public Preferred getPreferred()
    {
        return preferred;
    }

    public void setPreferred(Preferred preferred)
    {
        this.preferred = preferred;
    }

    public MobileSelect getMobileSelect()
    {
        return mobileSelect;
    }

    public void setMobileSelect(MobileSelect mobileSelect)
    {
        this.mobileSelect = mobileSelect;
    }

    public MobileExclusive getMobileExclusive()
    {
        return mobileExclusive;
    }

    public void setMobileExclusive(MobileExclusive mobileExclusive)
    {
        this.mobileExclusive = mobileExclusive;
    }

    public HeroVideo getHeroVideo()
    {
        return heroVideo;
    }

    public void setHeroVideo(HeroVideo heroVideo)
    {
        this.heroVideo = heroVideo;
    }

    public Marquee getMarquee()
    {
        return marquee;
    }

    public void setMarquee(Marquee marquee)
    {
        this.marquee = marquee;
    }
}
