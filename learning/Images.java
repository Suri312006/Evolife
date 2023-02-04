package learning;

import javax.swing.*;
import java.awt.*;

public class Images {

    private static Image Plob;

    public Images(){
        initImages();
    }
    public static void initImages(){

        ImageIcon ii = new ImageIcon("learning/images/IMG_2659.png");
        Plob = ii.getImage();
    }

    public static Image plob(){
        return Plob;
    }
}
