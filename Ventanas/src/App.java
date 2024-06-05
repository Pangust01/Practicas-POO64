import java.awt.Button;
import java.awt.Color;
public class App {
    public static void main(String[] args) throws Exception {
        VentanaNueva v1 = new VentanaNueva();
        VentanaNueva v2 = new VentanaNueva("Ventana 2");
        VentanaNueva v3 = new VentanaNueva("Ventana 3", 600, 400);
        VentanaNueva v4 = new VentanaNueva("Ventana 4", 400, 200, 400, 100);
        Button btnCerrar = new Button("Cerrar");
        Button btnSalir = new Button("Salir");
        btnCerrar.setBounds(100, 100, 70, 30);
        btnSalir.setBounds(200,100,70,30);
        v1.setBackground(Color.GRAY);
        v2.setBackground(Color.green);
        v3.setBackground(Color.BLUE);
        v4.setBackground(Color.GRAY);
        v4.setLayout(null);
        v4.add(btnCerrar);
        v4.add(btnSalir);
        btnCerrar.addActionListener((ActionEvent) -> {
            v4.dispose();
        });
        btnSalir.addActionListener((ActionEvent)->{
            System.exit(0);
        });
        

    }
}
