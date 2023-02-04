package main;

import javax.swing.*;
import java.awt.*;

public class Images {

    private static Image Plob;
    private static Image Bochita;
    private static Image Suri;
    private static Image Naila;

    public Images(){
        initImages();
    }
    public static void initImages(){

        ImageIcon poop = new ImageIcon("images/IMG_2659.png");
        Plob = poop.getImage();

        ImageIcon bochi = new ImageIcon("images/BOCHITA.png");
        Bochita = bochi.getImage();

        ImageIcon sayang = new ImageIcon("images/suri.png");
        Suri = sayang.getImage();

        ImageIcon manisku = new ImageIcon("images/naila.png");
        Naila = manisku.getImage();

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
    public static Image naila() {return Naila;}
}
