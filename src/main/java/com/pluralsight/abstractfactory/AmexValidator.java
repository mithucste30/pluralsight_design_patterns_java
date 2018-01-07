package com.pluralsight.abstractfactory;

public class AmexValidator implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}
