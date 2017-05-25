package com.forrent.beans.geography.entity;

public class Relationship
{
    private GeoEntityReference entity;
    private RelationshipType type;

    public Relationship() {}

    public Relationship(final RelationshipType type, final GeoEntityReference entity)
    {
        this.type = type;
        this.entity = entity;
    }

    public GeoEntityReference getEntity() {
        return this.entity;
    }

    public RelationshipType getType() {
        return this.type;
    }

    public void setEntity(final GeoEntityReference entity) {
        this.entity = entity;
    }

    public void setType(final RelationshipType type) {
        this.type = type;
    }
}
