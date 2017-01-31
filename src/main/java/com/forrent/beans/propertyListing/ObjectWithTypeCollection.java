package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Data structure that stores objects in an ordered list but allows lookup of groups of objects
 * that belong to a type.
 */
public class ObjectWithTypeCollection<T extends IObjectWithType>
{
    private final List<T> content = new ArrayList<>();
    private final Map<String, ArrayList<Integer>> types = new HashMap<>();

    /**
     * Add object to collection.
     *
     * @param object Object
     */
    public void add(final T object)
    {
        if (object.getType() == null) {
            throw new NullPointerException("Type may not be null");
        }

        ArrayList<Integer> indicies = this.types.get(object.getType());

        if (indicies == null) {
            indicies = new ArrayList<>();
        }

        this.content.add(object);
        indicies.add(this.content.size() - 1);
        this.types.put(object.getType(), indicies);
    }

    public void add(final List<T> objects)
    {
        objects.stream().forEach(this::add);
    }

    /**
     * Get objects of given type.
     *
     * @param type Type
     * @return Optional&lt;List&lt;T&gt;&gt;
     */
    public Optional<List<T>> get(final String type)
    {
        final ArrayList<Integer> indicies = this.types.get(type);
        if(indicies == null) {
            return Optional.empty();
        }

        final List<T> objects = new ArrayList<>();
        for (final Integer index : indicies) {
            objects.add(this.content.get(index));
        }

        return Optional.of(objects);
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
     * Get map of types and indices.
     *
     * @return Map&lt;String, List&lt;Integer&gt;&gt;
     */
    public Map<String, List<Integer>> getTypes() {
        return Collections.unmodifiableMap(this.types);
    }

    /**
     * Get list of indices associated with type.
     *
     * @param type Type
     * @return List&lt;Integer&gt;
     */
    public List<Integer> indiciesOf(final String type)
    {
        return this.types.get(type);
    }

    /**
     * Don any objects of given type exist in this collection.
     *
     * @param type Type
     * @return Boolean
     */
    public Boolean contains(final String type)
    {
        return this.types.containsKey(type);
    }
}
