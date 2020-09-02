package com.zied.ziedvalidator;

public class StringTools {

    public static boolean isEmpty(String value) {
        if (value == null) return true;
        return value.trim().length() == 0;
    }
}
