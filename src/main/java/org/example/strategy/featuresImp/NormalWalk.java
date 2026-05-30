package org.example.strategy.featuresImp;

import org.example.strategy.features.Walkable;

public class NormalWalk implements Walkable  {
    @Override
    public void walk() {
        System.out.println("Normal walk");

    }
}
