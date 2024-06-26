package ups;

import java.util.Scanner;

public class DividirConsola {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seguir = 1;
        System.out.println("Iniciando el programa...");
        VentanaPrincipal v1 = new VentanaPrincipal();
        v1.panelInicial();

        System.out.println("Se cerro el programa...");
    }
}
