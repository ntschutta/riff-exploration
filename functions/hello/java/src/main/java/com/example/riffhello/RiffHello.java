package com.example.riffhello;

import java.util.function.Function;

public class RiffHello implements Function<String, String> {

    public String apply(String value) {
        return "Hello " + value + "\n";
    }

}
