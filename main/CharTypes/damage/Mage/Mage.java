package main.CharTypes.damage.Mage;

import main.CharTypes.Base;
import main.CharTypes.damage.Damage;

public class Mage extends Damage {

    public Mage(double health, double AD, double AP, double mana, double armor, boolean alive) {
        super(health, AD, AP, mana, armor, alive);
    }

    public void basicAttack(Base other){
       other.hit( super.getAP()*0.5 + super.getAD() *0.5);
    }
}
