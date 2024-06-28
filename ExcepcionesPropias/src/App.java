
import java.util.InputMismatchException;
import java.util.Scanner;



public class App {

    public static int obtenerCocientePropio(int numerador, int denominador) throws MIExcepcion{
        //inicializar la variable
        int resultado;
        if (denominador==0) {
            throw new MIExcepcion("El denominador no debe ser de "+ denominador);

        }

        resultado = numerador/denominador;
        return  resultado;

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Bienbenido a la calculadora de dividir numeros enteros");
       try (Scanner leer = new Scanner(System.in)){
            int numerador, denominador, cociente;
            System.out.println("Ingrese el numerador: ");
            numerador = leer.nextInt();
            System.out.println("Ingrese el denominador: ");
            denominador = leer.nextInt();
            cociente = obtenerCocientePropio(numerador, denominador);
            System.out.println(cociente); 
            leer.close();
       } catch (MIExcepcion e) {
            System.out.println("Error de mi excepcion propia: "+e);
       } catch (InputMismatchException e){
            System.out.println("Debe colocar numeros solo numeros enteros");
       }
    }
}
