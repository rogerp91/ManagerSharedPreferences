package com.github.rogerp91.pref;

/**
 * Created by roger on 15/11/16.
 */

public class Utils {

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    public static void checkNotEmtry(String key) {
        if (key.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

}