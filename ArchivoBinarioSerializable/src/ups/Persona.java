package ups;


import java.io.Serializable;

/*
 * Para escribir y leer objetos a un archivo binario,
 * la clase del objeto debe implementar la interfaz serializable.
 * Permitiendo trabajar con datos más complejos y estructuras de datos complejas en un formato eficiente
 * 
 * 
 */
public class Persona implements Serializable{
    private static  final long serialVersionUID = 1L;
    /*
     * Se define un serialVersionUID
     */
    private final String nombre;
    private final int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", Edad: "+edad;
    }
    
    
}
