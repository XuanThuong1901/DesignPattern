package com.designpattern;

import com.designpattern.Factory.BasicAnimalFactory;
import com.designpattern.Factory.IAnimalFactory;
import com.designpattern.Factory.RandomAnimalFactory;

import java.util.Random;

public class Main {

    final static int CAT = 1;
    final static int DOG = 2;
    final static int DUCK = 3;

    public static void main(String[] args) {
	// write your code here
        IAnimalFactory factory;
        Random random = new Random();
        int typeRandom = random.nextInt(0,2);

        if (typeRandom == 0)
                factory = new RandomAnimalFactory();
        else
                factory = new BasicAnimalFactory();

        for (int i=0; i<5; i++){
            System.out.println(factory.createAnimal(CAT).create());
        }

    }
}
