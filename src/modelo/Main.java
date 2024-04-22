package modelo;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws Exception {
        GregorianCalendar fecha = new GregorianCalendar(2005, 10, 27);
        
        
        Empleado p1= new Empleado("Daniel", "Guanga", fecha, "0958867933", "Patamarca");
        EmpleadoAsalariado Emp = new EmpleadoAsalariado();
        Emp.setCargo("Estudiante Universitario");
        Emp.setCedula("0107262370");
        Emp.setAniosAntiguedad(2);
        Emp.setSalario(450);
        Emp.setCargasFamiliares(1);
        System.out.println(Emp.toString(p1));
        
    }
}
