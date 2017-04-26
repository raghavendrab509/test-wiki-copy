package com.forrent.beans.geography.entity;

import java.util.ArrayList;
import java.util.List;

import com.forrent.beans.geography.GeoType;
import com.forrent.beans.geography.id.GeoId;

public class GeoEntity
{
    private List<String> aliases = new ArrayList<>();
    private Detail detail;
    private String displayName;
    private GeoId id;
    private Point point = new Point();
    private RelationshipCollection related = new RelationshipCollection();
    private GeoType type;

    public List<String> getAliases() {
        return this.aliases;
    }

    public Detail getDetail() {
        return this.detail;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GeoId getId() {
        return this.id;
    }

    public Point getPoint() {
        return this.point;
    }

    public RelationshipCollection getRelated() {
        return this.related;
    }

    public GeoType getType() {
        return this.type;
    }

    public void setAliases(final List<String> aliases) {
        this.aliases = aliases;
    }

    public void setDetail(final Detail detail) {
        this.detail = detail;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public void setGeoType(final GeoType type) {
        this.type = type;
    }

    public void setId(final GeoId id) {
        this.id = id;
    }

    public void setPoint(final Point point) {
        this.point = point;
    }

    public void setRelated(final RelationshipCollection related) {
        this.related = related;
    }

    public void setType(final GeoType type) {
        this.type = type;
    }
}
