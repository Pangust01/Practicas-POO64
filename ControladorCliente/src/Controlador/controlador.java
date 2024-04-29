package Controlador;
import Vista.ClienteView;
import modelo.Cliente;
public class controlador {
    private ClienteView vista;
    private Cliente modelo;

    public controlador(){

    }

    public controlador(ClienteView vista, Cliente modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    public controlador(Cliente modelo) {
        this.modelo = modelo;
    }
    
    

    public ClienteView getVista() {
        return vista;
    }

    public void setVista(ClienteView vista) {
        this.vista = vista;
    }

    public int getId(){
        return modelo.getId();
    }

    public void setId(int id){
        modelo.setId(id);
    }

    public String getNombre(){
        return modelo.getNombre();
    }

    public void setNombre(String nombre){
        modelo.setNombre(nombre);
    }
    
    public String getApellido(){
        return modelo.getApellido();
    }

    public void setApellido(String apellido){
        modelo.setApellido(apellido);
    }

    public void actualizarVista(){
        vista.imprimeDatosCliente(getId(), getNombre(), getApellido());
    }
}

