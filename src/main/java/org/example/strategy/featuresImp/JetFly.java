package org.example.strategy.featuresImp;

import org.example.strategy.features.Flyable;

public class JetFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Fly with jet");
    }
}
