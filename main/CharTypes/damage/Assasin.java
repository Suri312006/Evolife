package main.CharTypes.damage;

import main.CharTypes.Base;

public class Assasin extends Damage{
    public Assasin(double health, double AD, double AP, double armor, boolean alive) {
        super(health, AD, AP, armor, alive);
    }

    public void execute(Base other){
        other.die();
    }


}
