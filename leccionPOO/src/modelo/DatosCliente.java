package modelo;


import java.util.Scanner;

public class DatosCliente extends Factura {

    private int identificador;
    private String nombre;
    private int fiabilidad_pago;
    // contructor vacio
    public DatosCliente() {

    }
    // constructor con parametros
    public DatosCliente(int identificador, String nombre, int fiabilidad_pago) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fiabilidad_pago = fiabilidad_pago;
    }
    // getters and setters
    public int identificador() {
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

    public int getFiabilidad_pago() {
        return fiabilidad_pago;
    }

    public void setFiabilidad_pago(int fiabilidad_pago) {
        this.fiabilidad_pago = fiabilidad_pago;
    }
    // Crear un metodo apra imprimir datos con un scaner
    public String toString() {
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Datos del cliente...");
        System.out.println("Digame su identificador del cliente: ");
        setIdentificador(teclado2.nextInt());
        System.out.println("Digame el nombre del cliente: ");
        setNombre(teclado.nextLine());
        System.out.println("Digame su fiabilidad del pago: ");
        setFiabilidad_pago(teclado2.nextInt());

        return "Su identificador del cliente es: " + identificador() + "\n" +
                "Su nombre es: " + getNombre() + "\n" +
                "Su fiabilidad de pago es: " + getFiabilidad_pago();

    }

}
