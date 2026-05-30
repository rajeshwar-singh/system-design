package org.example.strategy.featuresImp;

import org.example.strategy.features.Talkable;

public class SpecialTalk implements Talkable {

    @Override
    public void talk() {
        System.out.println("Special talk");
    }
}
