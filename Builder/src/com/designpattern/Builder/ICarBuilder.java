package com.designpattern.Builder;

import com.designpattern.Entity.Car;
import com.designpattern.Entity.Engine;
import com.designpattern.Entity.SeaBelt;
import com.designpattern.Entity.Windscreen;

public interface ICarBuilder {
    CarBuilder AddWheels(int numberOfWheels);
    CarBuilder AddColor(String color);
    CarBuilder AddEngine(Engine engine);
    CarBuilder AddSeaBelt(SeaBelt seaBelt);
    CarBuilder AddWindscreen(Windscreen windscreen);

    Car Build();
}
