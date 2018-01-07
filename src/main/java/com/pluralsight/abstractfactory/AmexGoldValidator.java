package com.pluralsight.abstractfactory;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}
