package org.example.factory.simpleFactory.burgerFactory;

import org.example.factory.simpleFactory.burgers.SimpleBurger;
import org.example.factory.simpleFactory.burgers.SpecialBurger;
import org.example.factory.simpleFactory.client.Burger;

public class KingBurger implements BurgerFactory{
    @Override

    public Burger createBurger(String type)
    {
        if(type.equalsIgnoreCase("normal"))
        {
            return new SimpleBurger();
        }
        else {
            return new SpecialBurger();
        }

    }
}
