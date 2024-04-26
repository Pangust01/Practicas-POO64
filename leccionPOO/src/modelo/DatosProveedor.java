package modelo;

import java.util.Scanner;

public class DatosProveedor extends Factura {
    private int identificador;
    private String nombre;
    private ClienteMoroso cliente_moroso;
    // contructor vacio
    public DatosProveedor() {
    }
    // constructor con parametros
    public DatosProveedor(int identificador, java.lang.String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    // getters and setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Crear un metodo apra imprimir datos con un scaner
    public String toString() {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado4 = new Scanner(System.in);
        cliente_moroso = new ClienteMoroso();
        System.out.println("Datos del proveedor...");
        System.out.println("Digite su identificador del proveedor: ");
        setIdentificador(teclado.nextInt());
        System.out.println("Digite su nombre del proveedor: ");
        setNombre(teclado4.nextLine());
        return "\nSu identificador del proveedor es: " + getIdentificador() + "\n" +
                "Nombre del proveedor es: " + getNombre() + "\n" +
                cliente_moroso.toString();
    }

}
