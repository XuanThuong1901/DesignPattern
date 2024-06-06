package com.designpattern.Entity;

public class SeaBelt {
    private String seaBelt;

    public String getSeaBelt() {
        return seaBelt;
    }

    public void setSeaBelt(String seaBelt) {
        this.seaBelt = seaBelt;
    }

    public SeaBelt(String seaBelt) {
        this.seaBelt = seaBelt;
    }

    @Override
    public String toString() {
        return "SeaBelt{" +
                "seaBelt='" + seaBelt + '\'' +
                '}';
    }
}
