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
    private final List<T> content = new ArrayList<>();
    private final Map<String, Integer> ids = new HashMap<>();

    /**
     * Add object or update if already present.
     *
     * @param object Object
     */
    public void put(final T object)
    {
        if (object.getId() == null) {
            throw new NullPointerException("Id may not be null.");
        }

        final Integer index = this.ids.get(object.getId());

        if (index == null) {
            this.content.add(object);
            this.ids.put(object.getId(), this.content.size() - 1);
        } else {
            this.content.set(index, object);
        }
    }

    public void putAll(final List<T> objects)
    {
        for(final T object : objects) {
            this.put(object);
        }
    }

    /**
     * Get object by id.
     *
     *@param id Id
     * @return Optional&lt;T&gt;
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
     *
     * @return List&lt;T&gt;
     */
    public List<T> getContent()
    {
        return Collections.unmodifiableList(this.content);
    }

    /**
     * Get map of ids and indices.
     *
     * @return Map&lt;String, Integer&gt;
     */
    public Map<String, Integer> getIds() {
        return Collections.unmodifiableMap(this.ids);
    }

    /**
     * Get index of a given id.
     *
     * @param id Id
     * @return Integer
     */
    public Integer indexOf(final String id)
    {
        return this.ids.get(id);
    }

    /**
     * Does object with given id exist in this collection.
     *
     * @param id Id
     * @return Boolean
     */
    public Boolean contains(final String id)
    {
        return this.ids.containsKey(id);
    }
}
