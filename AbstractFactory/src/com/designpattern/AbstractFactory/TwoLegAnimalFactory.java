package com.designpattern.AbstractFactory;

import com.designpattern.Product.Chicken;
import com.designpattern.Product.Duck;
import com.designpattern.Product.IAnimal;

import java.util.Random;

public class TwoLegAnimalFactory implements IAbstractAnimalFactory {

    @Override
    public IAnimal create() {
        Random random = new Random();
        int type = random.nextInt(0,2);
        if(type == 0)
            return new Duck();

        return new Chicken();
    }
}
