package Cara;

import java.awt.Frame;

public class App {
    public static void main(String[] args) throws Exception {
        Frame ventanaInicial = new Frame();
        CaraFeliz cara = new CaraFeliz();
        
        ventanaInicial.add(cara);
        ventanaInicial.setSize(400, 400);
        ventanaInicial.setLocationRelativeTo(null);
        ventanaInicial.setVisible(true);
    }
}
