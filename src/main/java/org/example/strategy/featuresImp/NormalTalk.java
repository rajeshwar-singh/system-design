package org.example.strategy.featuresImp;

import org.example.strategy.features.Talkable;

public class NormalTalk implements Talkable {
    @Override
    public void talk() {
        System.out.println("Normal talk");
    }
}
