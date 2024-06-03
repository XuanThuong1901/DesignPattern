package com.designpattern;

import com.designpattern.AbstractFactory.FourLegAnimalFactory;
import com.designpattern.AbstractFactory.IAbstractAnimalFactory;
import com.designpattern.AbstractFactory.TwoLegAnimalFactory;
import com.designpattern.Product.IAnimal;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IAbstractAnimalFactory factory;

        Random random = new Random();
        int type = random.nextInt(0,2);

        if(type == 0)
            factory = new FourLegAnimalFactory();
        else
            factory = new TwoLegAnimalFactory();

        for (int i = 0; i< 5; i++){
            System.out.println(factory.create().getName());
        }

    }
}
