
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterrupcionesDeAccion implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Component componente = (Component) e.getSource();
        String accionHecha = e.getActionCommand();
        System.out.println("Componente: "+componente.getName());
        System.out.println("Suceso: "+accionHecha);
        System.out.println();
    }

}
