package main.CharTypes;
public class Base {
    private double health;
    private double AD;
    private double AP;
    private double armor;
    private boolean alive;

    public Base(){
        this.health = 100;
        this.AD = 5;
        this.AP = 15;
        this.armor = 20;
        this.alive = true;
    }
    public Base(double health, double AD, double AP, double armor, boolean alive){
        this.health = health;
        this.AD = AD;
        this.AP = AP;
        this.armor = armor;
        this.alive = alive;
    }

    //accessor methods
    public double getHealth(){
        return health;
    }
    public double getAP(){
        return AP;
    }
    public double getAD(){
        return AD;
    }
    public double getArmor(){
        return armor;
    }
    public boolean getAlive(){
        return alive;
    }

    //mutator methods


    public void hit(double damage){
        health -= damage*(1-(armor/100));
    }
    public void die(){
        alive = false;
    }

    public void basicAttack( Base other){
        other.hit(this.AD);
    }




}
