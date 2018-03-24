package com.example.demo;

import lombok.Value;

@Value(staticConstructor = "of")
public class Test {
    private String displayId;
}