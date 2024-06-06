package com.designpattern.Entity;


public class Engine {
    private String engine;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public Engine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
