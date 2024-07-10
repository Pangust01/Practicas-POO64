package modelo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class GuardarArchivoBinario implements Serializable{
    public GuardarArchivoBinario(int codigo, int edad, Double VCT, Float VDT, String nombre){
        try (RandomAccessFile archivoBinario = new RandomAccessFile("C:\\Users\\ESTUDIANTE\\Documents\\DATOS.DAT","rw");){
            archivoBinario.write(codigo);
            archivoBinario.write(edad);
            archivoBinario.writeDouble(VCT);
            archivoBinario.writeFloat(VDT);
            archivoBinario.writeChars(nombre);
            archivoBinario.close();
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
            e.getStackTrace();
        }catch (Exception e){
            System.out.println("Error general: "+e.getMessage());
        }
        
    }
}
