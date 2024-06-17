package modelo;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Ejemplo1Internacionalizacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Locale locale01;
        ResourceBundle Bundle01;

        System.out.print("""
                Digame en que idioma quiere (Escoga del 1 al 2):
                    1.Ingles
                    2.Español
                :""");
        int option = teclado.nextInt();
        switch (option) {
            case 1 -> {
                locale01 = new Locale("en", "US");
                Bundle01 = ResourceBundle.getBundle("modelo.Traductor_en_US", locale01);
                System.out.println("Text in english-United States");
                System.out.println(Bundle01.getString("etiquetaSaludo"));
                System.out.println(Bundle01.getString("etiquetaDespedida"));
                System.out.println(Bundle01.getString("etiquetaNombre"));

            }
            case 2 -> {
                locale01 = new Locale("es", "EC");
                Bundle01 = ResourceBundle.getBundle("modelo.Traductor_es_EC", locale01);
                System.out.println("Texto en español-Ecuador");
                System.out.println(Bundle01.getString("etiquetaSaludo"));
                System.out.println(Bundle01.getString("etiquetaDespedida"));
                System.out.println(Bundle01.getString("etiquetaNombre"));

            }

            default -> {
                System.out.println("Accion invalida...\nEscoga del 1 al 2");
            }
        }
        teclado.close();
    }
}
