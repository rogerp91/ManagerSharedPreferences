package com.github.rogerp91.pref;

import android.support.annotation.NonNull;

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

    public static void checkNotEmtry(@NonNull String key) {
        if (key.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
//    public static <T> T checkNotNull(T reference, String ex) {
//        if (reference == null) {
//            throw new NullPointerException();
//        }
//        return reference;
//    }
//
//    public static void checkNotEmtry(@NonNull String key, String ex) {
//        IllegalArgumentException exception =  new IllegalArgumentException();
//
//        if (key.isEmpty()) {
//            throw new IllegalArgumentException();
//        }
//    }
}