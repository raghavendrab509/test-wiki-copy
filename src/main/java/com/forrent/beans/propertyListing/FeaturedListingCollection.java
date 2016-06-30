package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.forrent.beans.propertyListing.featuredListing.FRCFeatured;
import com.forrent.beans.propertyListing.featuredListing.FRUFeatured;
import com.forrent.beans.propertyListing.featuredListing.HeroVideo;
import com.forrent.beans.propertyListing.featuredListing.Marquee;
import com.forrent.beans.propertyListing.featuredListing.MobileExclusive;
import com.forrent.beans.propertyListing.featuredListing.MobileSelect;
import com.forrent.beans.propertyListing.featuredListing.Preferred;

@SuppressWarnings("serial")
public class FeaturedListingCollection implements Serializable
{
    private List<FRCFeatured> frcFeatured = new ArrayList<FRCFeatured>();
    private List<FRUFeatured> fruFeatured = new ArrayList<FRUFeatured>();
    private List<Preferred> preferred  = new ArrayList<Preferred>();
    private List<MobileSelect> mobileSelect  = new ArrayList<MobileSelect>();
    private List<MobileExclusive> mobileExclusive = new ArrayList<MobileExclusive>();
    private List<HeroVideo> heroVideo = new ArrayList<HeroVideo>();
    private List<Marquee> marquee  = new ArrayList<Marquee>();

    public List<FRCFeatured> getFrcFeatured()
    {
        return this.frcFeatured;
    }

    public void setFrcFeatured(final List<FRCFeatured> frcFeatured)
    {
        this.frcFeatured = frcFeatured;
    }

    public List<FRUFeatured> getFruFeatured()
    {
        return this.fruFeatured;
    }

    public void setFruFeatured(final List<FRUFeatured> fruFeatured)
    {
        this.fruFeatured = fruFeatured;
    }

    public List<Preferred> getPreferred()
    {
        return this.preferred;
    }

    public void setPreferred(final List<Preferred> preferred)
    {
        this.preferred = preferred;
    }

    public List<MobileSelect> getMobileSelect()
    {
        return this.mobileSelect;
    }

    public void setMobileSelect(final List<MobileSelect> mobileSelect)
    {
        this.mobileSelect = mobileSelect;
    }

    public List<MobileExclusive> getMobileExclusive()
    {
        return this.mobileExclusive;
    }

    public void setMobileExclusive(final List<MobileExclusive> mobileExclusive)
    {
        this.mobileExclusive = mobileExclusive;
    }

    public List<HeroVideo> getHeroVideo()
    {
        return this.heroVideo;
    }

    public void setHeroVideo(final List<HeroVideo> heroVideo)
    {
        this.heroVideo = heroVideo;
    }

    public List<Marquee> getMarquee()
    {
        return this.marquee;
    }

    public void setMarquee(final List<Marquee> marquee)
    {
        this.marquee = marquee;
    }
}
