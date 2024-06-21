package Controlador;

import java.awt.Color;
import java.awt.Frame;

public class Ejemplo {
    public static void main(String[] args) {
        Frame ventana = new Frame();
        Primitivas prim = new Primitivas();
        ventana.add(prim);
        prim.setBackground(Color.GRAY);
        ventana.setSize(400,400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
