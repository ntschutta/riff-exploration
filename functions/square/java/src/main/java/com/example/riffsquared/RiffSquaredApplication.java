package com.example.riffsquared;

import java.util.function.Function;

public class RiffSquaredApplication implements Function<Double, String> {

    public String apply(Double value) {
        return Math.pow(value, 2) + "\n";
    }

}
