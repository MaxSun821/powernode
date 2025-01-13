package com.max.exception01;

import com.max.exception01.exception.IllegalAgeException;
import com.max.exception01.exception.IllegalNameException;

public class User {

    public void register(String name, int age) throws IllegalNameException, IllegalAgeException {
        if (name.length() < 6 || name.length() > 12) {
            throw new IllegalNameException();
        }
        if (age < 18) {
            throw new IllegalAgeException();
        }
    }
}
