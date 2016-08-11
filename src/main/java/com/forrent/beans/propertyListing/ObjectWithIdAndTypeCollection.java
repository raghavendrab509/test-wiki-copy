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
public class ObjectWithIdAndTypeCollection<T extends IObjectWithId & IObjectWithType>
{
    private final List<T> content = new ArrayList<T>();
    private final Map<String, Integer> ids = new HashMap<String, Integer>();
    private final Map<String, ArrayList<Integer>> types = new HashMap<String, ArrayList<Integer>>();

    /**
     * Does object with given id exist in this collection.
     */
    public Boolean contains(final String id)
    {
        return this.ids.containsKey(id);
    }

    /**
     * Get ordered list of objects.
     */
    public List<T> getContent()
    {
        return Collections.unmodifiableList(this.content);
    }

    /**
     * Get object by id.
     */
    public Optional<T> getId(final String id)
    {
        final Integer index = this.ids.get(id);
        if(index == null) {
            return Optional.empty();
        }

        return Optional.of(this.content.get(index));
    }

    /**
     * Get map of ids and indices.
     */
    public Map<String, Integer> getIds() {
        return Collections.unmodifiableMap(this.ids);
    }

    /**
     * Get objects of given type.
     */
    public Optional<List<T>> getType(final String type)
    {
        final ArrayList<Integer> indicies = this.types.get(type);
        if(indicies == null) {
            return Optional.empty();
        }

        final List<T> objects = new ArrayList<T>();
        for (final Integer index : indicies) {
            objects.add(this.content.get(index));
        }

        return Optional.of(objects);
    }

    /**
     * Get map of types and indices.
     */
    public Map<String, List<Integer>> getTypes()
    {
        return Collections.unmodifiableMap(this.types);
    }

    /**
     * Get index of a given id.
     */
    public Integer indexOf(final String id)
    {
        return this.ids.get(id);
    }

    /**
     * Add object or update if already present.
     * @param object
     */
    public void put(final T object)
    {
        if (object.getId() == null) {
            throw new NullPointerException("Id may not be null.");
        }

        if (object.getType() == null) {
            throw new NullPointerException("Type may not be null.");
        }

        final Integer index = this.ids.get(object.getId());

        if (index == null) {
            this.content.add(object);

            this.ids.put(object.getId(), this.content.size() - 1);

            ArrayList<Integer> indicies = this.types.get(object.getType());
            if (indicies == null) {
                indicies = new ArrayList<Integer>();
            }
            indicies.add(this.content.size() - 1);
            this.types.put(object.getType(), indicies);

        } else {
            this.content.set(index, object);
        }
    }
}
