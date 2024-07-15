package vista;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.FileArchivo;

public final class Ventana extends Frame{
    FileArchivo archivo;
    public Ventana(){
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ventanaPrincipal();
        this.setVisible(true);
    }
    public void ventanaPrincipal(){
        Panel panel1 = new Panel();
        Panel panel2 = new Panel(new GridLayout(5,1));
        Panel panel3 = new Panel();
        Panel panel4 = new Panel(new BorderLayout());
        Panel panel5 = new Panel();
        Panel panel6 = new Panel();
        Label lblTitulo = new Label("Bienvenido al sistema para leer y guardar alchivos .txt");
        Label lblArchivo = new Label("Digame con que nombre quiere que se guarde:");
        Label lblDirectorio = new Label("Digame donde quiere que se guarde:");
        TextField txtArchivo = new TextField();
        TextField txtDirectorio = new TextField();
        TextArea txtPantalla = new TextArea("Digame que quiere que contenga el archivo |.txt|");
        Button btnGuardar = new Button("Guardar");
        Button btnBorrar = new Button("Borrar");
        Button btnSeleccionar = new Button("Seleccionar");
        Button btnCarpetas = new Button("Cambiar a crear/borrar carpetas");
        Button btnLeer = new Button("Leer archivos");
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel5,BorderLayout.CENTER);
        this.add(panel4,BorderLayout.SOUTH);
        panel1.setBackground(Color.gray);
        panel2.setBackground(Color.gray);
        panel3.setBackground(Color.gray);
        panel4.setBackground(Color.gray);
        panel5.setBackground(Color.gray);
        panel6.setBackground(Color.gray);
        panel5.add(panel2);
        panel5.add(panel3);
        panel1.add(lblTitulo);
        panel2.add(lblArchivo);
        panel2.add(txtArchivo);
        panel2.add(lblDirectorio);
        panel2.add(txtDirectorio);
        panel2.add(btnSeleccionar);
        panel3.add(btnGuardar);
        panel3.add(btnBorrar);
        panel3.add(btnLeer);
        panel4.add(txtPantalla,BorderLayout.CENTER);
        panel4.add(panel6,BorderLayout.SOUTH);
        panel6.add(btnCarpetas);
        archivo = new FileArchivo();
        btnSeleccionar.addActionListener((ActionEvent)->{
            archivo.escogerDirectorio(txtDirectorio);
        });
        btnGuardar.addActionListener((ActionEvent)->{
            archivo.GuardarArchivo(txtArchivo.getText(),txtPantalla);
        });
        btnBorrar.addActionListener((ActionEvent)->{
            archivo.BorrarArchivo(this);
        });
        btnLeer.addActionListener((ActionEvent)->{
            archivo.LeerArchivo(txtPantalla);
        });
    }

    // public void ventanaCarpetas(){
    //     Panel panel1 = new Panel();
    //     Panel panel2 = new Panel(new GridLayout(5,1));
    //     Panel panel3 = new Panel();
    //     Panel panel4 = new Panel(new BorderLayout());
    //     Panel panel5 = new Panel();
    //     Panel panel6 = new Panel();
    //     Label lblTitulo = new Label("Bienvenido al sistema para crear y borrar carpetas");
    //     Label lblDirectorio = new Label("Seleccione una carpeta:");
    //     TextField txtDirectorio = new TextField();
    //     TextArea txtPantalla = new TextArea("Aqui... Estara lo que contenga algun archivo seleccionado");
    //     Button btnGuardar = new Button("Guardar");
    //     Button btnBorrar = new Button("Borrar");
    //     Button btnSeleccionar = new Button("Seleccionar");
    //     Button btnCarpetas = new Button("Cambiar a crear/borrar carpetas");
    //     this.add(panel1,BorderLayout.NORTH);
    //     this.add(panel5,BorderLayout.CENTER);
    //     this.add(panel4,BorderLayout.SOUTH);
    //     panel1.setBackground(Color.gray);
    //     panel2.setBackground(Color.gray);
    //     panel3.setBackground(Color.gray);
    //     panel4.setBackground(Color.gray);
    //     panel5.setBackground(Color.gray);
    //     panel6.setBackground(Color.gray);
    //     panel5.add(panel2);
    //     panel5.add(panel3);
    //     panel1.add(lblTitulo);
    //     panel2.add(lblDirectorio);
    //     panel2.add(txtDirectorio);
    //     panel2.add(btnSeleccionar);
    //     panel3.add(btnGuardar);
    //     panel3.add(btnBorrar);
    //     panel4.add(txtPantalla,BorderLayout.CENTER);
    //     panel4.add(panel6,BorderLayout.SOUTH);
    //     panel6.add(btnCarpetas);
    //     archivo = new FileArchivo();
    //     btnSeleccionar.addActionListener((ActionEvent)->{
    //         archivo.escogerDirectorio(txtDirectorio);
    //     });
    //     btnGuardar.addActionListener((ActionEvent)->{
           
    //     });
    //     btnBorrar.addActionListener((ActionEvent)->{
    //         archivo.BorrarArchivo(this);
    //     });
    // }
}
