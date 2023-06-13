package com.leo.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    private void init() {
        System.out.println("ClassicalMusic bean initialization.");
    }

    @PreDestroy
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
