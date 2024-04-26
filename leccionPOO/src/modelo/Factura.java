/*
 * 
 * 
 * @DanielGuanga
 * @AlexGuaman
 */

package modelo;

import java.util.Scanner;

public class Factura {
    private int identificador;
    private int importe;
    protected String fecha;
    private DatosProveedor datos_proveedor;
    private DatosCliente datos_cliente;

    // contructor vacio
    public Factura() {

    }

    // constructor con parametros

    public Factura(int identificador, int importe, String fecha, DatosProveedor datos_proveedor,
            DatosCliente datos_cliente) {
        this.identificador = identificador;
        this.importe = importe;
        this.fecha = fecha;
        this.datos_proveedor = datos_proveedor;
        this.datos_cliente = datos_cliente;
    }

    // getters and setters

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public DatosProveedor getDatos_proveedor() {
        return datos_proveedor;
    }

    public void setDatos_proveedor(DatosProveedor datos_proveedor) {
        this.datos_proveedor = datos_proveedor;
    }

    public DatosCliente getDatos_cliente() {
        return datos_cliente;
    }

    public void setDatos_cliente(DatosCliente datos_cliente) {
        this.datos_cliente = datos_cliente;
    }

    // Crear un metodo apra imprimir datos con un scaner
    public String toString() {
        Scanner teclado3 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        datos_cliente = new DatosCliente();
        datos_proveedor = new DatosProveedor();
        System.out.println("Digite su identificador de la factura: ");
        setIdentificador(teclado3.nextInt());
        System.out.println("Digite su importe: ");
        setImporte(teclado3.nextInt());
        System.out.println("Digite la fecha: ");
        setFecha(teclado2.nextLine());

        return "Los datos de la factura son:\n" +
                "Su identificador: " + getIdentificador() + "\n" +
                "Su importe fue de: " + getImporte() + "\n" +
                "Su fecha de la factura es: " + getFecha() + "\n" +
                "Los datos del cliente son: \n" + datos_cliente.toString()+"\n"+
                "Los datos del proveedor son: "+ datos_proveedor.toString()+"\n";
    }

    public void borrado(Factura f1,ClienteMoroso cm1) {
        System.out.println("Borrando datos...");
    }

}
