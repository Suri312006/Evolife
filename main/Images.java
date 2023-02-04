package main;

import javax.swing.*;
import java.awt.*;

public class Images {

    private static Image Plob;
    private static Image Bochita;
    private static Image Suri;

    public Images(){
        initImages();
    }
    public static void initImages(){

        ImageIcon poop = new ImageIcon("learning/images/IMG_2659.png");
        Plob = poop.getImage();

        ImageIcon bochi = new ImageIcon("learning/images/BOCHITA.png");
        Bochita = bochi.getImage();

        ImageIcon sayang = new ImageIcon("learning/images/suri.png");
        Suri = sayang.getImage();


    }

    public static Image plob(){
        return Plob;
    }

    public static Image bochita(){
        return Bochita;
    }
    public static Image suri(){
        return Suri;
    }
}
