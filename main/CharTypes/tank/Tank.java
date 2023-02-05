package main.CharTypes.tank;

import main.CharTypes.Base;
public class Tank extends Base{
    private double armor;
    private boolean stall;

    public Tank(double health, double AD, double AP, double mana, double armor, boolean alive) {
        super(health, AD, AP,mana, alive);
        this.armor = armor;
    }

    public void stallMove(){
        stall = true;
    }
    public void hit(double damage){
        if(!stall) {
            super.hit(damage);
        }
        stall = false;
    }
}