package com.harishkannarao.cucumber.service;

public class CustomService {

    public String getMessage(String name) {
        return (name != null) ? "Hello " + name + "!!!" : null;
    }
}
