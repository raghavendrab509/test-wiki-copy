package com.forrent.beans.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Data structure that stores objects in an ordered list.
 */
public class ObjectCollection<T>
{
    private final List<T> content = new ArrayList<T>();

    /**
     * Add object .
     * @param object Object
     */
    public void add(final T object)
    {
        this.content.add(object);
    }

    public void addAll(final List<T> objects)
    {
        this.content.addAll(objects);
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

}
