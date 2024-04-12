package modelo;
import java.util.GregorianCalendar;
public class ClasePersona {
    public static void main(String[] args) {
        //Instanciar constructores vacios
        Direccion direc1= new Direccion();
        direc1.setCalle1("Calle Vieja");
        direc1.setCalle2("Eliat Liut");
        direc1.setNumero(4563);
        
        //instanciar un objeto con 2 parametros
        Direccion direc2= new Direccion("Sucre", "Benigno Malo");
        direc2.setNumero(3356);
        
        //intanciar un objeto con 3 parametros
        Direccion direc3 = new Direccion("Via patamarca", "Calle sin nombre", 3456);
        
        //instanciar la clase persona
        Persona p1= new Persona("0107262370", "Daniel Guanga");

        //instanciar una fecha de nacimiento

        GregorianCalendar fechaNac= new GregorianCalendar(2005,11,27);
        // asignar a pepito la fecha de nacimiento

        p1.setFechaNac(fechaNac);

        // asignar direcciones a p1
        p1.agregarDireccion(direc1);
        p1.agregarDireccion(direc2);
        p1.agregarDireccion(direc3);

        System.out.println(p1);

        

    }
}
