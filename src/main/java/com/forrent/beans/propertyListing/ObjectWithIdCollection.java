package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Data structure that stores objects in an ordered list but allows lookups via a map
 * that stores the index of an object.
 */
public class ObjectWithIdCollection<T extends IObjectWithId>
{
    private final List<T> content = new ArrayList<T>();
    private final Map<String, Integer> ids = new HashMap<String, Integer>();

    /**
     * Add object or update if already present.
     * @param object
     */
    public void put(final T object)
    {
        final Integer index = this.ids.get(object.getId());

        if (index == null) {
            this.content.add(object);
            this.ids.put(object.getId(), this.content.size() - 1);
        } else {
            this.content.set(index, object);
        }
    }

    /**
     * Get object by id.
     */
    public Optional<T> get(final String id)
    {
        final Integer index = this.ids.get(id);
        if(index == null) {
            return Optional.empty();
        }

        return Optional.of(this.content.get(index));
    }

    /**
     * Get ordered list of objects.
     */
    public List<T> getContent()
    {
        return Collections.unmodifiableList(this.content);
    }

    /**
     * Get map of ids and indices.
     */
    public Map<String, Integer> getIds() {
        return Collections.unmodifiableMap(this.ids);
    }

    /**
     * Get index of a given id.
     */
    public Integer indexOf(final String id)
    {
        return this.ids.get(id);
    }

    /**
     * Does object with given id exist in this collection.
     */
    public Boolean contains(final String id)
    {
        return this.ids.containsKey(id);
    }
}
