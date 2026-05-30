package org.example.factory.simpleFactory.burgers;

import org.example.factory.simpleFactory.burgerFactory.BurgerFactory;
import org.example.factory.simpleFactory.client.Burger;

public class WheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Singh Burger's Wheat Burger");
    }
}
