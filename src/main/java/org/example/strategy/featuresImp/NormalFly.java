package org.example.strategy.featuresImp;

import org.example.strategy.features.Flyable;

public class NormalFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Normal fly");
    }
}
