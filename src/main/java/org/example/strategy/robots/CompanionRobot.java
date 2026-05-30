package org.example.strategy.robots;

import org.example.strategy.client.Robot;
import org.example.strategy.features.Flyable;
import org.example.strategy.features.Talkable;
import org.example.strategy.features.Walkable;

public class CompanionRobot extends Robot {

    public CompanionRobot(Talkable talkable, Walkable walkable, Flyable flyable)
    {
        super(talkable, walkable,flyable);
    }
}
