package Colores;

import java.awt.Frame;

public class Ejemplo {
    public static void main(String[] args) {
        System.out.println("hola");
        Frame miVentana = new Frame();
        RGB colores = new RGB();
        miVentana.add(colores);
        miVentana.setSize(400, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setVisible(true);
    }
}
