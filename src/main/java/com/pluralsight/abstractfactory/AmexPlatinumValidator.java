package com.pluralsight.abstractfactory;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}
