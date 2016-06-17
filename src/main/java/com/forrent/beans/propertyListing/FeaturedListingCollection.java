package com.forrent.beans.propertyListing;

import com.forrent.beans.propertyListing.ad.*;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class FeaturedListingCollection implements Serializable
{
    private List<FRCFeatured> frcFeatured;
    private List<FRUFeatured> fruFeatured;
    private List<Preferred> preferred;
    private List<MobileSelect> mobileSelect;
    private List<MobileExclusive> mobileExclusive;
    private List<HeroVideo> heroVideo;
    private List<Marquee> marquee;

    public List<FRCFeatured> getFrcFeatured()
    {
        return frcFeatured;
    }

    public void setFrcFeatured(List<FRCFeatured> frcFeatured)
    {
        this.frcFeatured = frcFeatured;
    }

    public List<FRUFeatured> getFruFeatured()
    {
        return fruFeatured;
    }

    public void setFruFeatured(List<FRUFeatured> fruFeatured)
    {
        this.fruFeatured = fruFeatured;
    }

    public List<Preferred> getPreferred()
    {
        return preferred;
    }

    public void setPreferred(List<Preferred> preferred)
    {
        this.preferred = preferred;
    }

    public List<MobileSelect> getMobileSelect()
    {
        return mobileSelect;
    }

    public void setMobileSelect(List<MobileSelect> mobileSelect)
    {
        this.mobileSelect = mobileSelect;
    }

    public List<MobileExclusive> getMobileExclusive()
    {
        return mobileExclusive;
    }

    public void setMobileExclusive(List<MobileExclusive> mobileExclusive)
    {
        this.mobileExclusive = mobileExclusive;
    }

    public List<HeroVideo> getHeroVideo()
    {
        return heroVideo;
    }

    public void setHeroVideo(List<HeroVideo> heroVideo)
    {
        this.heroVideo = heroVideo;
    }

    public List<Marquee> getMarquee()
    {
        return marquee;
    }

    public void setMarquee(List<Marquee> marquee)
    {
        this.marquee = marquee;
    }
}
