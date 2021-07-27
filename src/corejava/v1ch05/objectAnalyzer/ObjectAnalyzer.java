/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectAnalyzer {
    private final ArrayList<Object> visited = new ArrayList<>();

    /**
     * Converts an object to a string representation that lists all fields.
     *
     * @param obj
     * @return
     */
    public String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (visited.contains(obj)) {
            return "...";
        }
        visited.add(obj);
        Class c1 = obj.getClass();
        if (c1 == String.class) {
            return (String) obj;
        }
        if (c1.isArray()) {
            StringBuilder r = new StringBuilder(c1.getComponentType() + "[]{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {
                    r.append(",");
                }
                Object val = Array.get(obj, i);
                if (c1.getComponentType().isPrimitive()) {
                    r.append(val);
                } else {
                    r.append(toString(val));
                }
            }
            return r.append("}").toString();
        }

        StringBuilder r = new StringBuilder(c1.getName());
        // inspect the fields of this class and all superclasses
        do {
            r.append("[");
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            // get the names and values of all fields
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.toString().endsWith("[")) {
                        r.append(",");
                    }
                    r.append(f.getName()).append("=");
                    try {
                        Class t = f.getType();
                        Object val = f.get(obj);
                        if (t.isPrimitive()) {
                            r.append(val);
                        } else {
                            r.append(toString(val));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r.append("]");
            c1 = c1.getSuperclass();
        } while (c1 != null);

        return r.toString();
    }
}
