package org.example.factory.simpleFactory.burgerFactory;

import org.example.factory.simpleFactory.client.Burger;

public interface BurgerFactory {

    Burger createBurger(String type);
}
