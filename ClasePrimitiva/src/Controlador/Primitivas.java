package Controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class Primitivas extends Panel{
    public Primitivas(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Setea el color a usarse
        g.setColor(Color.red);
        g.drawLine(50, 50, 350, 50);

        g.setColor(Color.blue);
        g.drawRect(5, 60, 90, 55);
        g.fillRect(100, 60, 90, 55);

        g.setColor(Color.CYAN);
        g.fillRoundRect(195, 60, 90, 55, 50, 50);
        g.drawRoundRect(290, 60, 90, 55, 20, 20);

        g.setColor(Color.YELLOW);
        g.draw3DRect(5, 120, 90, 55, true);
        g.draw3DRect(100, 120, 90, 55, false);

        g.setColor(Color.GREEN);
        g.drawOval(195, 120, 90, 55);
        g.fillOval(290, 120, 90, 55);

        g.setColor(Color.ORANGE);
        g.drawOval(5, 190,90,90);
        g.setColor(Color.red);
        g.fillOval(5, 190,90,90);


    }
}
