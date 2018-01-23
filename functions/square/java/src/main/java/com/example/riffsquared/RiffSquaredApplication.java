package com.example.riffsquared;

import java.util.function.Function;

public class RiffSquaredApplication implements Function<Double, String> {

    public String apply(Double value) {
        return value + " squared is " + Math.pow(value, 2) + "\n";
    }

}
