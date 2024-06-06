package com.designpattern;

import com.designpattern.Builder.CarBuilder;
import com.designpattern.Entity.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car(5,
                "Red",
                new Engine("TT"),
                new SeaBelt( "AA"),
                new Windscreen("Why"));


        CarBuilder carBuilder = new CarBuilder()
                .AddWheels(4)
                .AddColor("Green")
                .AddEngine(new Engine("GG"))
                .AddSeaBelt(new SeaBelt("QQ"));

        System.out.println("-------------------");
        System.out.println(carBuilder.toString());
        System.out.println("-------------------");
        Windscreen windscreen = new Windscreen("Low key");
//        carBuilder.AddWindscreen(windscreen)
//                .Build();

        Car car2 = carBuilder.Build();
        System.out.println(car.toString());
        System.out.println("------------------");
        System.out.println(carBuilder.toString());
        System.out.println("------------------");
        System.out.println(car2.toString());

//        Person.Builder person = new Person.Builder()
//                .firstName("Nguyen")
//                .lastName("Thuong")
//                .age(12);
//        person.address("123");
//        person.Build();
        Person person = new Person.Builder()
                .firstName("Nguyen")
                .lastName("Thuong")
                .age(12)
                .address("123")
                .Build();




        System.out.println("------------------");
        System.out.println(person.toString());
    }
}
