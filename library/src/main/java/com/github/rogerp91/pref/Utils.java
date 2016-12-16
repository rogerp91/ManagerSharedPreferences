package com.github.rogerp91.pref;

import android.content.ContextWrapper;
import android.support.annotation.NonNull;

/**
 * Created by roger on 15/11/16.
 */

public class Utils {

    //    public static <T> T checkNotNull(T reference) {
//        if (reference == null) {
//            throw new NullPointerException();
//        }
//        return reference;
//    }
//
//    public static void checkNotEmtry(@NonNull String key) {
//        if (key.isEmpty()) {
//            throw new IllegalArgumentException();
//        }
//    }
    public static <T> T checkNotNull(T reference, String e) {
        if (reference == null) {
            if (e.isEmpty()) {
                throw new NullPointerException();
            } else {
                throw new NullPointerException(e);
            }
        }
        return reference;
    }

    public static void checkNotEmtry(@NonNull String key, String e) {
        if (key.isEmpty()) {
            if (e.isEmpty()) {
                throw new IllegalArgumentException();
            } else {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static void checkModePreference(int mode) {
        if ((mode != ContextWrapper.MODE_PRIVATE) || (mode != ContextWrapper.MODE_WORLD_READABLE) || (mode != ContextWrapper.MODE_WORLD_WRITEABLE) || (mode != ContextWrapper.MODE_MULTI_PROCESS)) {
            throw new RuntimeException("The mode in the sharedpreference can only be set too ContextWrapper.MODE_PRIVATE, ContextWrapper.MODE_WORLD_READABLE, ContextWrapper.MODE_WORLD_WRITEABLE or ContextWrapper.MODE_MULTI_PROCESS");
        }
    }
}