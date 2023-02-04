package main;


import Sprites.Images;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class Board extends JPanel {

    private Image bardejov;

    private Image poop;

    public Board() {

        initBoard();
    }

    private void initBoard() {
        Images img = new Images();

        bardejov = img.bochita();
        poop = img.suri();

        setPreferredSize(new Dimension(300, 300));
    }


    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(bardejov, 0, 0, null);
        g.drawImage(poop, 50, 50, null);
    }
}