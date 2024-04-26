package modelo;

import java.util.Scanner;

public class ClienteMoroso extends DatosCliente {
    private double deuda;
    // contructor vacio
    public ClienteMoroso() {

    }
    // constructor con parametros
    public ClienteMoroso(double deuda) {
        this.deuda = deuda;
    }
    // getters and setters
    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    // Crear un metodo apra imprimir datos con un scaner
    public String toString() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la deuda a pagar del cliente moroso:");
        setDeuda(teclado.nextInt());
        return "Su deuda es de: " + getDeuda();
    }

}
