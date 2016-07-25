package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ObjectWithTypeCollection<T extends IObjectWithType>
{
    private final List<T> content = new ArrayList<T>();
    private final Map<String, ArrayList<Integer>> types = new HashMap<String, ArrayList<Integer>>();

    public void add(final T object)
    {
        ArrayList<Integer> indicies = this.types.get(object.getType());

        if (indicies == null) {
            indicies = new ArrayList<Integer>();
        }

        this.content.add(object);
        indicies.add(this.content.size() - 1);
        this.types.put(object.getType(), indicies);
    }

    public Optional<List<T>> get(final String type)
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

    public List<T> getContent()
    {
        return Collections.unmodifiableList(this.content);
    }

    public Map<String, ArrayList<Integer>> getTypes() {
        return Collections.unmodifiableMap(this.types);
    }

    public ArrayList<Integer> indiciesOf(final String type)
    {
        return this.types.get(type);
    }

    public Boolean contains(final String type)
    {
        return this.types.containsKey(type);
    }
}
