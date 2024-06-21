package Colores;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;


public class RGB extends Panel{
    public RGB(){

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Crea nuevos colores
        g.setColor(new java.awt.Color(255, 0, 0));
        //dibuja un rectangulo
        g.fillRect(25, 25, 100, 20);
        g.drawString("Utiliza RGB: "+g.getColor(), 130, 40);

        //Crear un color a partir de flotantes
        g.setColor(new java.awt.Color(0.0F, 1.0F, 0.0F));
        g.fillRect(25, 50, 100, 20);
        g.drawString("Utiliza RGB: "+g.getColor(), 130, 65);

        //Crear un color por constantes
        g.setColor(Color.BLUE);
        g.fillRect(25, 75, 100, 20);
        g.drawString("Utiliza RGB: "+g.getColor(), 130, 90);

        //Muestra los colores individuales, segun color
        Color color = Color.magenta;
        g.setColor(color);
        g.fillRect(25, 100, 100, 20);
        g.drawString("Utiliza RGB: Rojo "+color.getRed()+" Verde "+color.getGreen()+" Azul "+g.getColor().getBlue(), 130, 120);

        g.setColor(new Color(200,0,0));
        g.fillRect(25, 125, 100, 20);
        g.drawString("Utiliza RGB: "+g.getColor(), 130, 140);


    }
}
