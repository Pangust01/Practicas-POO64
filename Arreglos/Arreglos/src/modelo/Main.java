package modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Digite el tamaño del arreglo:");
        int tamanio=teclado.nextInt();
        int[] num = new int[tamanio];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite el numero para la posicion: "+i);
            int datos=teclado.nextInt();
            num[i]=datos;
        }

        String salida="[";
        for (int i : num) {
            if (i<num.length) {
                salida+=i+"-";
            } else {
                salida+=i;
            }
            
        }
        System.out.println("Su arreglo es: \n"+salida+"]");
        */
        
        Automovil carro = new Automovil();
        carro.setPrecio(1000000.0);
        System.out.println("El precio del carro es: "+carro.getPrecio());
        teclado.close();

    }
}
