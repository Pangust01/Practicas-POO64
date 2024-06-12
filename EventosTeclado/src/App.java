
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class App {
    public static void main(String[] args) throws Exception {
        Frame ventanaInicial = new Frame();
        Panel ventanaPrincipal = new Panel(new BorderLayout());
        Panel panelBotones = new Panel();
        Panel panelPantalla = new Panel();
        Panel panelLBL = new Panel();
        Button btnSilencio = new Button("Silencio");
        Button btnEscribir = new Button("Maquina de Escribir");
        Button btnLimpiar = new Button("Limpiar");
        Label lblSalir = new Label("Presione * para salir");
        Label lblPantalla = new Label();
        TextArea txtPantalla = new TextArea();
        txtPantalla.setEditable(false);
        ventanaPrincipal.setBackground(Color.CYAN);
        ventanaInicial.setSize(500, 300);
        ventanaInicial.setResizable(false);
        ventanaInicial.setLocationRelativeTo(null);
        ventanaInicial.add(ventanaPrincipal);
        ventanaPrincipal.add(panelBotones, BorderLayout.NORTH);
        ventanaPrincipal.add(panelPantalla, BorderLayout.CENTER);
        ventanaPrincipal.add(panelLBL, BorderLayout.SOUTH);
        panelBotones.add(btnSilencio);
        panelBotones.add(btnEscribir);
        panelBotones.add(btnLimpiar);
        panelPantalla.add(txtPantalla);
        panelLBL.add(lblSalir);
        btnEscribir.addKeyListener(new MetodosTeclado(lblPantalla, txtPantalla));
        btnLimpiar.addActionListener((ActionEvent)->{
            txtPantalla.setText("");
            lblPantalla.setText("");
        });
        
        ventanaInicial.setVisible(true);


    }
}
