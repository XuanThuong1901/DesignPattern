package com.designpattern.Factory;

import com.designpattern.Product.Cat;
import com.designpattern.Product.Dog;
import com.designpattern.Product.Duck;
import com.designpattern.Product.IAnimal;

import java.util.Random;

public class RandomAnimalFactory implements IAnimalFactory{

    @Override
    public IAnimal createAnimal(int type) {

        Random random = new Random();
        int typeRandom = random.nextInt(0,3);
        switch (typeRandom){
            case 0:
                return new Cat();

            case 1:
                return new Dog();

            default:
                return new Duck();
        }
    }
}
