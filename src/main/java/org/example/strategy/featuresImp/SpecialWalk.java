package org.example.strategy.featuresImp;

import org.example.strategy.features.Walkable;

public class SpecialWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("Special walk");
    }
}
