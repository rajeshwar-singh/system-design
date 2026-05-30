package org.example.factory.simpleFactory.burgerFactory;

import org.example.factory.simpleFactory.burgers.WheatBurger;
import org.example.factory.simpleFactory.client.Burger;

public class SinghBurger implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {
        return new WheatBurger();
    }
}
