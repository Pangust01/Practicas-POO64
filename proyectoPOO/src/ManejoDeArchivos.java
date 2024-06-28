
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManejoDeArchivos extends Frame implements ActionListener{ 
    private final TextArea txtPantalla;
    private final Button btnAbrir, btnGuardar;
    private FileDialog archivoPlano;
    public ManejoDeArchivos(){
        this.setSize(650,500);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        //crear componentes
        txtPantalla = new TextArea();
        btnAbrir = new Button("Abrir");
        btnGuardar = new Button("Guardar");

        //Configurar el area de texto

        txtPantalla.setFont(new Font("Monospaced", Font.PLAIN, 12));

        //crear panel

        Panel panel = new Panel();
        panel.add(btnAbrir);
        panel.add(btnGuardar);

        this.add(txtPantalla, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);

        btnAbrir.addActionListener(this);
        btnGuardar.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String commando = e.getActionCommand();
        if (commando.equals("Abrir")) {
            abrirArchivo();
        } else {
            guardarArchivo();
        }

    }

    private void abrirArchivo(){
        archivoPlano = new FileDialog(this, "Abrir Archivo Personal", FileDialog.LOAD);
        /*
         * FileDialog.LOAD: es una constante que indica que el cuadro de dialogo es para abrir
         * un archivo. Para guardar un archivo, se usa el FileDialog.SAVE
         */
        archivoPlano.setVisible(true);

        String carpeta = archivoPlano.getDirectory();
        String nombreArchivo = archivoPlano.getFile();
        if (nombreArchivo!=null) {
            File archivo = new File(carpeta, nombreArchivo);
            try (Scanner teclado = new Scanner(archivo)){
                txtPantalla.setText("");
                while (teclado.hasNextLine()) {
                    txtPantalla.append(teclado.nextLine()+"\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void guardarArchivo(){
        archivoPlano = new FileDialog(this, "Guardar Archivo Personal", FileDialog.SAVE);
        archivoPlano.setVisible(true);
        String carpeta = archivoPlano.getDirectory();
        String nombreArchivo = archivoPlano.getFile();
        if (nombreArchivo!=null) {
            File archivo = new File(carpeta, nombreArchivo);
            try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))){
                writer.print(txtPantalla.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
