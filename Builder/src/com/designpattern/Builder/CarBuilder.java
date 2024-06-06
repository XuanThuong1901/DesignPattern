package com.designpattern.Builder;

import com.designpattern.Entity.Car;
import com.designpattern.Entity.Engine;
import com.designpattern.Entity.SeaBelt;
import com.designpattern.Entity.Windscreen;

public class CarBuilder implements ICarBuilder {

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


    @Override
    public CarBuilder AddWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder AddColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder AddEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder AddSeaBelt(SeaBelt seaBelt) {
        this.seaBelt = seaBelt;
        return this;
    }

    @Override
    public CarBuilder AddWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
        return this;
    }

    @Override
    public Car Build() {
        return new Car(numberOfWheels, color, engine, seaBelt, windscreen);
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", seaBelt=" + seaBelt +
                ", windscreen=" + windscreen +
                '}';
    }
}
