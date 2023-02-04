package main;


import java.awt.*;
import javax.swing.*;

public class Application extends JFrame {

    Images img = new Images();
    private Image PLOBB;

    public Application() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setSize(250, 250);

        setIconImage(img.plob());
        setTitle("PLOB?!?!??!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}