package modelo;

import java.util.Scanner;

public class sentencias {
    public boolean esPrimo(int num){
        if (num<=1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public String saberPrimo(int num){
        String primo = (esPrimo(num)) ? "si es numero primo" : "no es un numero primo";
        return primo;
    }
    public void sentenciasIfsTernario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero para saber si es primo:");
        int num = teclado.nextInt();
        String primo= (esPrimo(num)) ? num+" si es numero primo": num+" no es numero primo";
        System.out.println(primo);
        teclado.close();
    }
    public void sentenciaSwitlif(){
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Cuantos años tienes? ");
        int edad=teclado2.nextInt();
        if (edad < 13) {
            System.out.println("Usted aun es un niño");
        }else if (edad <= 17) {
            System.out.println("Usted ya es Preadolecente");
        }else if (edad >= 18 && edad <27) {
            System.out.println("Usted ya es mayor de edad");
        }else if (edad < 60) {
            System.out.println("Usted ya es un adulto");
        }else{
            System.out.println("Usted es de la tercera edad");
        }

        System.out.println("Digite un numero del 1 al 3:");
        int key = teclado2.nextInt();
        switch (key) {
            case 1:
                System.out.println("Sabias que... los aguacates son una fruta y no una verdura. ");
                break;
                
            case 2:
                System.out.println("Yo nunca pense que dirias que tenias "+edad+" años"+"\nHasta mi ñaña es mas sincera");
                break;
            
            case 3:
                System.out.println("Sabias que... tu edad " + saberPrimo(edad));
                break;

            default:
                System.out.println("Vaya... te dije que solo del 1 al 3, parace que no sabes leer");
        }
        teclado2.close();

    }
    
        
    
    public static void main(String[] args) {
        sentencias obj1 = new sentencias();
        try {
            obj1.sentenciaSwitlif();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Digite solo numeros enteros y evite digitar letras");
        }
        
    }

}
