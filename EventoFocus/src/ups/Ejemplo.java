package ups;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
/**​
 * @author Ing. Maria de Lourdes Loaiza, MSc.​
 * Ejemplo de FocusListener​
*/
public class Ejemplo {

	public static void main(String[] args) {
		Frame miVentana = new Frame("Prueba eventos de enfoque");
        Panel miPanel = new Panel();
        Button btnComponente1 = new Button("Componente 1");
        Button btnComponente2 = new Button("Componente 2");
        
        miPanel.add(btnComponente1);
        miPanel.add(btnComponente2);
        
        miVentana.add(miPanel);
        miVentana.setSize(300, 200);
        miVentana.setVisible(true);
        
        btnComponente2.addFocusListener(new InterrupcionesDeEnfoque());
	}

}
