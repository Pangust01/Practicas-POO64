package modelo;
import java.util.ArrayList;
import java.util.Scanner;
public class Listas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> listas = new ArrayList<Integer>();
        int num2=1;
        do {
            System.out.println("Digite un numero para colocar en la lista: ");
            int num= teclado.nextInt();
            listas.add(num);
            num2=num;
        } while (num2!=0);
        System.out.println("Su lista es: "+listas);
        System.out.println("Su lista tiene un tamaño de: "+listas.size());
        //int posicion=0;
        // for (int i : listas) {
        //     System.out.println(i);
        //     System.out.println("Su lista tiene estos numeros en la posicion: ["+posicion+"]"+" es: "+i);
        //     posicion++;
        // }
        teclado.close();
        
    }
}
