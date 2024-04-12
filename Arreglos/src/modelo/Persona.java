package modelo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.text.SimpleDateFormat;
// import java.util.*
public class Persona {
    private String cedula="";
    private String nombre="";
    private GregorianCalendar fechaNac;
    private List<Direccion> direccion;
    public Persona(){
        this.direccion= new ArrayList<>();
    }
    public Persona(String cedula, String nombre, GregorianCalendar fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fecha;
        this.direccion= new ArrayList<>();
    }
    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        
    }    
    
    public Persona(String cedula) {
        this.cedula = cedula;

    }
    
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(GregorianCalendar fecha) {
        this.fechaNac = fecha;
    }

    public void agregarDireccion(Direccion dir){
        direccion.add(dir);
    }

    public String toString(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return "Imprimiendo datos del usuario... \nSu cedula: {"+cedula+"}"+
                "Su nombre: {"+nombre+"}"+
                "Su fecha: {"+formato.format(fechaNac.getTime())+"}"+
                "Tiene registrada la dirreccion: {"+direccion+"}";

    }

    
}
