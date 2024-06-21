package Cara;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class CaraFeliz extends Panel{
    public CaraFeliz(){

    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 100, 100);
    }

}
