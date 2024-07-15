package modelo;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class FileArchivo implements Serializable{
    JFileChooser jf;
    File archivo;
    
    public FileArchivo(){
        jf = new JFileChooser();
    }

    public void escogerDirectorio(TextField txtDirectorio,TextArea txtPantalla){
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jf.showDialog(null, "Seleccionar");
        txtDirectorio.setText(jf.getSelectedFile().toString());
        txtPantalla.setText("Se seleccionado un directorio correctamente...");
    }

    public void GuardarArchivo(String nomArchivo,TextArea txtPantalla){
        archivo = new File(jf.getSelectedFile(),nomArchivo+".txt");
        try (PrintWriter escribirArchivo = new PrintWriter(archivo)){
            escribirArchivo.write(txtPantalla.getText());
            escribirArchivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void BorrarArchivo(Frame ventana){
        jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jf.showOpenDialog(ventana);
        archivo = jf.getSelectedFile();
        System.out.println(jf.getSelectedFile());
        if (archivo.getAbsolutePath()!=null) {
            archivo.delete();
        }
    }
    public void LeerArchivo(TextArea txtPantalla, TextField txtDirectorio){
        jf.showOpenDialog(null);
        archivo = jf.getSelectedFile();
        txtDirectorio.setText(jf.getSelectedFile().toString());
        try (Scanner teclado = new Scanner(archivo)){
            txtPantalla.setText("");
            while (teclado.hasNextLine()) {
                txtPantalla.append(teclado.nextLine()+"\n");
            }
        } catch (Exception e) {
        }
    }
}
