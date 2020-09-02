package com.zied.ziedvalidator;

public class EmptyZvalidator implements ZValidator {

    @Override
    public boolean validate(Object... values) {
        return !StringTools.isEmpty((String) values[0]);
    }
}
