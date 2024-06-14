package VentanaInterrupciones;

import java.awt.Frame;

public class App {
    public static void main(String[] args) throws Exception {
        Frame ventana1 = new Frame("Ventana 1");
        Frame ventana2 = new Frame("Ventana 2");
        ventana1.setSize(300,200);
        ventana2.setSize(200,400);
        ventana2.setLocation(1300, 400);
        ventana1.setLocationRelativeTo(null);
        ventana1.addWindowListener(new InterrupcionesDeVentana());
        ventana2.addWindowListener(new InterrupcionesDeVentana());
        ventana1.setVisible(true);
        ventana2.setVisible(true);
    }
}
