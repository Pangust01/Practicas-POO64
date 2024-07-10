package vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import modelo.GuardarArchivoBinario;


public final class InterfazGrafica extends Frame{
    private Locale locale;
    private ResourceBundle bundle;
    public InterfazGrafica(){
        this.setSize(280,200);
        this.setLocationRelativeTo(null);
        panelInicial();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void panelInicial(){
        Panel panel = new Panel(new BorderLayout());
        Panel panel2 = new Panel();
        Label lblTitutlo = new Label("Bienvenido, escoga el idioma que quiere usar");
        List lista = new List();
        Button btnAceptar = new Button("Aceptar");
        panel.setBackground(Color.CYAN);
        panel2.setBackground(Color.CYAN);
        lista.add("Ingles");
        lista.add("Español");
        panel.add(lblTitutlo, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(btnAceptar, BorderLayout.SOUTH);
        panel2.add(lista);
        this.add(panel);

        btnAceptar.addActionListener((ActionEvent)->{
            if (lista.getSelectedIndex()==0) {
                locale = new Locale("en", "US");
                bundle = ResourceBundle.getBundle("vista.Traductor_en_US", locale);
                this.setVisible(false);
                panelprincipal();
            }else{
                locale = new Locale("es", "EC");
                bundle = ResourceBundle.getBundle("vista.Traductor_es_EC", locale);
                this.setVisible(false);
                panelprincipal();
            }
        });
    }

    public void panelprincipal(){
        Frame ventanaPrincipal = new Frame("Crear Archivos Binarios");
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Button btnAceptar = new Button(bundle.getString("Aceptar"));
        Button btnSalir = new Button(bundle.getString("Salir"));
        Label lblTitulo = new Label(bundle.getString("Bienvenida"));
        Label lblCodigo = new Label(bundle.getString("Codigo"));
        Label lblEdad = new Label(bundle.getString("Edad"));
        Label lblNombre = new Label(bundle.getString("Nombre"));
        Label lblVCT = new Label(bundle.getString("ValorCompra"));
        Label lblVDT = new Label(bundle.getString("ValorDeuda"));
        TextField txtCodigo = new TextField(20);
        TextField txtEdad = new TextField(20);
        TextField txtNombre = new TextField(20);
        TextField txtVCT = new TextField(20);
        TextField txtVDT = new TextField(20);
        ventanaPrincipal.setSize(330, 400);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setLayout(new BorderLayout());
        panel1.add(lblTitulo);
        panel2.add(lblNombre);
        panel2.add(txtNombre);
        panel2.add(lblEdad);
        panel2.add(txtEdad);
        panel2.add(lblCodigo);
        panel2.add(txtCodigo);
        panel2.add(lblVCT);
        panel2.add(txtVCT);
        panel2.add(lblVDT);
        panel2.add(txtVDT);
        panel3.add(btnAceptar);
        panel3.add(btnSalir);
        panel1.setBackground(Color.GRAY);
        panel2.setBackground(Color.GRAY);
        panel3.setBackground(Color.GRAY);
        btnAceptar.addActionListener((ActionEvent)->{
            new GuardarArchivoBinario(Integer.parseInt(txtCodigo.getText()), Integer.parseInt(txtEdad.getText()), Double.valueOf(txtVCT.getText()), Float.valueOf(txtVDT.getText()), txtNombre.getText());
        });
        btnSalir.addActionListener((ActionEvent)->{
            System.exit(0);
        });
        ventanaPrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ventanaPrincipal.add(panel1, BorderLayout.NORTH);
        ventanaPrincipal.add(panel2, BorderLayout.CENTER);
        ventanaPrincipal.add(panel3, BorderLayout.SOUTH);
        ventanaPrincipal.setVisible(true);
    }
}
