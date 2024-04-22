package modelo;

import java.util.GregorianCalendar;

/**
 * Clase Empleado Asalariado
 * 
 * @DanielGuanga
 */
public class Empleado {

    String cedula;
    private String nombre;
    private String apellido;
    private GregorianCalendar fechaString;
    private String telefono;
    private String direccion;
    protected String cargo;

    public Empleado() {

    }

    public Empleado(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String nombre, String apellido, GregorianCalendar fechaString, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaString = fechaString;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Empleado(GregorianCalendar fechaString, String telefono, String direccion, String cargo) {
        this.fechaString = fechaString;
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

    public GregorianCalendar getFechaString() {
        return fechaString;
    }

    public void setFehcaString(GregorianCalendar fechaString) {
        this.fechaString = fechaString;
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

    public double calcularSalario() {
        return 0;
    }

}
