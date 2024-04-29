package Controlador;
import java.util.Scanner;

import Vista.ClienteView;
import modelo.Cliente;

public class MVCDemo {
    public static Cliente LlenarDatosCliente(int id, String nombre, String apellido){
        Cliente c1 = new Cliente(id, nombre, apellido);
        return c1;
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para registrar clientes...");
        System.out.println("Digite su id:");
        int id=teclado.nextInt();
        System.out.println("Digite su nombre:");
        String nombre=teclado.next();
        System.out.println("Digite su apellido:");
        String apellido=teclado.next();
        Cliente modelo = LlenarDatosCliente(id,nombre,apellido);
        ClienteView vista = new ClienteView();
        controlador control = new controlador(modelo);
        control.setVista(vista);
        control.setNombre("Juan");
        control.actualizarVista();
        teclado.close();
    }

    
}
