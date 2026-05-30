package org.example.strategy.client;

import org.example.strategy.features.Flyable;
import org.example.strategy.features.Talkable;
import org.example.strategy.features.Walkable;

public class Robot {
    private Talkable talkable;
    private Walkable walkable;
    private Flyable flyable;

    public Robot(Talkable talkable, Walkable walkable, Flyable flyable)
    {
        this.talkable = talkable;
        this.walkable = walkable;
        this.flyable = flyable;
    }

    //delegator method
    public void walk()
    {
        walkable.walk();
    }
    public void talk()
    {
        talkable.talk();
    }
    public void fly()
    {
        flyable.fly();
    }
}
