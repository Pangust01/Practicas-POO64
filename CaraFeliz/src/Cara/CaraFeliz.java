package Cara;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class CaraFeliz extends Panel{
    public CaraFeliz(){
        this.setBackground(Color.cyan);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        //Cara
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 300, 300);
        //Ojos
        g.setColor(Color.black);
        g.fillOval(110, 120, 70, 70);
        g.setColor(Color.black);
        g.fillOval(220, 120, 70, 70);
        //destellos
        g.setColor(Color.white);
        g.fillOval(110, 130, 30, 30);
        g.fillOval(220, 130, 30, 30);
        g.fillOval(250, 150, 20, 20);
        g.fillOval(140, 150, 20, 20);

        //boca
        g.setColor(Color.DARK_GRAY);
        g.fillOval(115, 200, 180, 100);
        g.setColor(Color.yellow);
        g.fillOval(115, 200, 180, 80);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(90, 236, 50, 20, 180, 180);
        g.fillArc(270, 236, 50, 20, 180, 180);
        //contorno
        g.setColor(Color.black);
        g.drawOval(50, 50, 300, 300);

        

    }

}
