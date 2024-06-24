package Cara;


import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class App {
    public static void main(String[] args) throws Exception {
        Frame ventanaInicial = new Frame();
        CaraFeliz cara = new CaraFeliz();
        ventanaInicial.add(cara);
        ventanaInicial.setSize(400, 400);
        ventanaInicial.setLocationRelativeTo(null);
        ventanaInicial.setVisible(true);

        ventanaInicial.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
