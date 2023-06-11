package com.leo.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }

    @Override
    public String toString() {
        return "RockMusic{}";
    }
}
