package com.forrent.beans.geography.entity;

import java.util.ArrayList;
import java.util.List;

import com.forrent.beans.geography.GeoType;
import com.forrent.beans.geography.id.GeoId;

public class GeoEntity
{
    private List<String> aliases = new ArrayList<>();
    private Detail detail = new Detail();
    private String displayName;
    private GeoId id;
    private Point location = new Point();
    private String name;
    private List<Relationship> relationships = new ArrayList<>();
    private String state;
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

    public Point getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public List<Relationship> getRelationships() {
        return this.relationships;
    }

    public String getState() {
        return this.state;
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

    public void setLocation(final Point location) {
        this.location = location;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setRelationships(final List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setType(final GeoType type) {
        this.type = type;
    }
}
