package com.leo.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private void init() {
        System.out.println("ClassicalMusic bean initialization.");
    }

    private void destroy() {
        System.out.println("Classical music bean destruction.");
    }

    @Override
    public String getSong() {
        return "Classical";
    }

    @Override
    public String toString() {
        return "ClassicalMusic{}";
    }
}
