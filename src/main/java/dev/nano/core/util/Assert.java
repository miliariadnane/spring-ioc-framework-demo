package dev.nano.core.util;

public class Assert {
    public static boolean isEmpty(Object[] objects) {
        return objects == null || objects.length == 0;
    }

    public static void notEmpty(Object[] objects, String message) {
        if (isEmpty(objects))
            throw new IllegalArgumentException(message);
    }
}
