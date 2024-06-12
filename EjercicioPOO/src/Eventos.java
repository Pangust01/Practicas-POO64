
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Eventos {
    public static void main(String[] args) throws Exception {
        int botones = 12;
        Frame miVentana = new Frame("Ventana de eventos del raton");
        Label mensaje = new Label("Mensaje asociado al boton pulsado");
        Label mensaje2 = new Label("Pulsa un boton");
        Panel panelPrincipal = new Panel(new GridLayout(botones + 1, 1));
        InterrupcionesDeRaton saberaton= new InterrupcionesDeRaton(mensaje);
        Button[] botons = new Button[botones];
        mensaje.setBackground(Color.CYAN);
        panelPrincipal.add(mensaje2);
        for (int i = 0; i < botones; i++) {
            botons[i] = new Button("Boton No " + (i+1));
            botons[i].setBackground(Color.lightGray);
            panelPrincipal.add(botons[i]);
            botons[i].addMouseListener(saberaton);
        }
        miVentana.setSize(400, 600);
        miVentana.setLocationRelativeTo(null);
        miVentana.add(panelPrincipal);
        miVentana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        miVentana.setVisible(true);
    }

}
