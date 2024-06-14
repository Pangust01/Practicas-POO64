
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class App {
    public static void main(String[] args) throws Exception {
        Frame ventana1 = new Frame("Ventana de eventos");
        Panel panelPrincipal = new Panel(new BorderLayout());
        Button btn0 = new Button("Etiqueta de Boton");
        TextField txt0 = new TextField("Texto del campo");
        List lista = new List();
        lista.add("Opcion 1 de la lista");
        lista.add("Opcion 2 de la lista");
        lista.add("Opcion 3 de la lista");
        lista.add("Opcion 4 de la lista");
        panelPrincipal.add(btn0, BorderLayout.NORTH);
        panelPrincipal.add(txt0, BorderLayout.CENTER);
        panelPrincipal.add(lista, BorderLayout.SOUTH);
        ventana1.add(panelPrincipal);
        ventana1.setSize(400,300);
        ventana1.setLocationRelativeTo(null);
        btn0.addActionListener(new InterrupcionesDeAccion());
        txt0.addActionListener(new InterrupcionesDeAccion());
        lista.addActionListener(new InterrupcionesDeAccion());
        ventana1.setVisible(true);

    }
}
