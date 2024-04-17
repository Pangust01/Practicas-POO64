package modelo;
import java.util.Date;
/**
 * Clase Empleado Asalariado
 * 
 * @DanielGuanga
 */
public class Empleado {

    String cedula;
    private String nombre;
    private String apellido;
    private Date fehcaString;
    private String telefono;
    private String direccion;
    protected String cargo;
    public Empleado(){

    }

    public Empleado(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(Date fehcaString, String telefono, String direccion, String cargo) {
        this.fehcaString = fehcaString;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cargo = cargo;
    }

    public Empleado(String cedula) {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFehcaString() {
        return fehcaString;
    }

    public void setFehcaString(Date fehcaString) {
        this.fehcaString = fehcaString;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double calcularSalario(){
        EmpleadoAsalariado emp1= new EmpleadoAsalariado(0, 0, 0);

        return 0;
    }

}
