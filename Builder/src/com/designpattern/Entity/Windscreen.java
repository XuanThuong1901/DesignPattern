package com.designpattern.Entity;

public class Windscreen {
    private String windscreen;

    public String getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(String windscreen) {
        this.windscreen = windscreen;
    }

    public Windscreen(String windscreen) {
        this.windscreen = windscreen;
    }

    @Override
    public String toString() {
        return "Windscreen{" +
                "windscreen='" + windscreen + '\'' +
                '}';
    }
}
