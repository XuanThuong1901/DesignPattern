package com.designpattern.AbstractFactory;

import com.designpattern.Product.Cat;
import com.designpattern.Product.Dog;
import com.designpattern.Product.IAnimal;

import java.util.Random;

public class FourLegAnimalFactory implements IAbstractAnimalFactory{
    @Override
    public IAnimal create() {
        Random random = new Random();
        int type = random.nextInt(0,2);
        if (type == 0)
            return new Cat();
        return new Dog();
    }
}
