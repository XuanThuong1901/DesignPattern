package com.designpattern.Factory;

import com.designpattern.Product.IAnimal;

public interface IAnimalFactory {

    IAnimal createAnimal(int type);
}
