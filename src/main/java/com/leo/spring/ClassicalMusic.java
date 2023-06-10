package com.leo.spring;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical";
    }

    @Override
    public String toString() {
        return "ClassicalMusic{}";
    }
}
