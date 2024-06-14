package VentanaInterrupciones;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InterrupcionesDeVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana "+e.getWindow().getName()+" abierta");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Si pulsas aqui cierras la ventana "+e.getWindow().getName());
        e.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana "+e.getWindow().getName()+" cerrada");   
    }
    
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana "+e.getWindow().getName()+" activa(en uso)");
        e.getWindow().setBackground(Color.CYAN);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana "+e.getWindow().getName()+" desactivada(en desuso)");
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Se Minimizo la ventana "+e.getWindow().getName());
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Se maximizo la ventana "+e.getWindow().getName());
        
    }



}
