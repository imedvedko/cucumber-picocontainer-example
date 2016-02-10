package net.thumbtack.cucumber.picocontainer.example.util;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<Field, Object> context = new HashMap<Field, Object>();

    public <Value> Context setValue(final Field<Value> field, final Value value) {
        context.put(field, value);

        return this;
    }

    @SuppressWarnings("unchecked")
    public <Value> Value getValue(final Field<Value> field) {
        return (Value) context.get(field);
    }
}
