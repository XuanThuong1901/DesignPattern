package com.designpattern.Factory;

import com.designpattern.Product.Cat;
import com.designpattern.Product.IAnimal;

public class BasicAnimalFactory implements IAnimalFactory{

    @Override
    public IAnimal createAnimal(int type) {

        switch (type){
            case 0:
                return new Cat();
            case 1:
                return new Cat();
            default:
                return new Cat();
        }
    }
}
