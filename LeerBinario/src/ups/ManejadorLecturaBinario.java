package ups;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class ManejadorLecturaBinario {
    public ManejadorLecturaBinario() {
        mostrarAleatorio();
    }

    public void mostrarAleatorio() {
        Long posicion;
        int num;
        Double numDouble;
        String texto;

        try (RandomAccessFile leerArchivo = new RandomAccessFile("C:\\Users\\ESTUDIANTE\\Downloads\\archivoRandomico.dat", "r")) {
            posicion = leerArchivo.length();
            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            num = leerArchivo.readInt();
            System.out.println("Entero: " + num+ " y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();
            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            numDouble = leerArchivo.readDouble();
            System.out.println("Decimal: " + numDouble+ " y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            numDouble = leerArchivo.readDouble();
            System.out.println("Decimal: " + numDouble+ " y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            num = leerArchivo.readInt();
            System.out.println("Entero: " + num+ " y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            texto = leerArchivo.readUTF();
            System.out.println(texto+" y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            texto = leerArchivo.readUTF();
            System.out.println(texto+" y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            texto = leerArchivo.readUTF();
            System.out.println(texto+" y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            texto = leerArchivo.readUTF();
            System.out.println(texto+" y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            texto = leerArchivo.readUTF();
            System.out.println(texto+" y termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Pisicion del puntero: " + leerArchivo.getFilePointer() + " y lee:");
            num = leerArchivo.readInt();
            System.out.println("Entero: " + num+ "Termina en la posicion: "+(leerArchivo.getFilePointer()-1));
            System.out.println();

            System.out.println("Posicion final: " + posicion);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error I/O");
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}
