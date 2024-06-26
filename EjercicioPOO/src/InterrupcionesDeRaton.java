
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class InterrupcionesDeRaton extends MouseAdapter{
    private final Frame v1;
    private final Panel p1;
    private final Panel p2;
    private final Button btnCerrar;
    private final Label mensaje;

    public InterrupcionesDeRaton(Label mensaje){
        this.mensaje=mensaje;
        v1 = new Frame();
        p1 = new Panel(new BorderLayout());
        p2 = new Panel();
        btnCerrar = new Button("Cerrar");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        // obtener el componente que genero el evento
        Component componente = (Component) e.getSource();
        // Obtiene el nombre del componente
        String nombre = componente.getName();
        // Obtiene los dos ultimos caracteres del nombre del componente
        String opcion = nombre.substring(nombre.length()-2, nombre.length());
        // Establece un mensaje en algun componente de interfaz grafica (supuestamente un Jlabel)
        mensaje.setText("Ejecutar la accion "+opcion);
        mensaje.setBackground(Color.LIGHT_GRAY);
        v1.setSize(200,100);
        v1.setLocationRelativeTo(null);
        v1.add(p1);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.add(mensaje, BorderLayout.NORTH);
        p1.add(p2, BorderLayout.CENTER);
        p2.add(btnCerrar);
        btnCerrar.addActionListener((ActionEvent)->{
            v1.dispose();
        });
        v1.setVisible(true);

    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        Component componente = (Component) e.getSource();
        componente.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Component componente = (Component) e.getSource();
        componente.setBackground(Color.orange);
    }

    
    
}
