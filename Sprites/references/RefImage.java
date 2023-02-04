package Sprites.references;

import javax.swing.*;
import java.awt.*;

public class RefImage{

    private static Image AngryPlant;
    private static Image BeeWeasel;
    private static Image ForestSpirit;
    private static Image MushRoon;
    private static Image MutantRaven;
    private static Image MutantSpider;
    private static Image RolyPoly;
    private static Image SharkDoggy;
    private static Image TortiCat;

    public RefImage(){
        initImages();
    }
    public static void initImages(){

        ImageIcon q = new ImageIcon("Sprites/references/AngryPlant.jpg");
        AngryPlant = q.getImage();

        ImageIcon w = new ImageIcon("Sprites/references/BeeWeasel.jpg");
        BeeWeasel = w.getImage();

        ImageIcon e = new ImageIcon("Sprites/references/ForestSpirit.jpg");
        ForestSpirit = e.getImage();

        ImageIcon r = new ImageIcon("Sprites/references/MushRoon.jpg");
        MushRoon = r.getImage();

        ImageIcon t = new ImageIcon("Sprites/references/MutantRaven.jpg");
        MutantRaven = t.getImage();

        ImageIcon y = new ImageIcon("Sprites/references/MutantSpider.jpg");
        MutantSpider = y.getImage();

        ImageIcon u = new ImageIcon("Sprites/references/RolyPoly.jpg");
        RolyPoly = u.getImage();

        ImageIcon i = new ImageIcon("Sprites/references/SharkDoggy.jpg");
        SharkDoggy = i.getImage();

        ImageIcon o = new ImageIcon("Sprites/references/TortiCat.jpg");
        TortiCat = o.getImage();


    }

    public static Image angryPlant() {return AngryPlant;}
    public static Image beeWeasel() {return BeeWeasel;}
    public static Image forestSpirit() {return ForestSpirit;}
    public static Image mushRoon() {return MushRoon;}
    public static Image mutantRaven() {return MutantRaven;}
    public static Image mutantSpider() {return MutantSpider;}
    public static Image rolyPoly() {return RolyPoly;}
    public static Image sharkDoggy() {return SharkDoggy;}
    public static Image tortiCat() {return TortiCat;}

}
