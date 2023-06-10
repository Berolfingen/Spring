package com.leo.spring;

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
