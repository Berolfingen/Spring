package com.leo.spring;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz";
    }

    @Override
    public String toString() {
        return "JazzMusic{}";
    }
}
