package org.example.factory.simpleFactory.burgers;

import org.example.factory.simpleFactory.client.Burger;

public class SpecialBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Special Burger");
    }
}
