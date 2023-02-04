package main.CharTypes.damage.assassin;

import main.CharTypes.Base;
import main.CharTypes.damage.Damage;

public class Assasin extends Damage {
    public Assasin(double health, double AD, double AP,double mana, double armor, boolean alive) {
        super(health, AD, AP,mana, armor, alive);
    }

    public void execute(Base other){
        other.die();
    }


}
