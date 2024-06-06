package com.designpattern.Entity;

public class Car {

    private int numberOfWheels;
    private String color;
    private Engine engine;
    private SeaBelt seaBelt;
    private Windscreen windscreen;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SeaBelt getSeaBelt() {
        return seaBelt;
    }

    public void setSeaBelt(SeaBelt seaBelt) {
        this.seaBelt = seaBelt;
    }

    public Windscreen getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }

    public Car(int numberOfWheels, String color, Engine engine, SeaBelt seaBelt, Windscreen windscreen) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engine = engine;
        this.seaBelt = seaBelt;
        this.windscreen = windscreen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", seaBelt=" + seaBelt +
                ", windscreen=" + windscreen +
                '}';
    }
}
