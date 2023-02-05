package main.CharTypes.fighter;

import main.CharTypes.Base;

public class Fighter extends Base {

    //AD inversely scales with HP?

    public Fighter(double health, double AD, double AP, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
    }

    //bite method that does percentage HP damage
}
