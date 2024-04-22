package modelo;
import java.text.SimpleDateFormat;
public class EmpleadoAsalariado extends Empleado{
    private int aniosAntiguedad;
    private int salario;
    private int cargasFamiliares;
    private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    public EmpleadoAsalariado(){
        
    }

    public EmpleadoAsalariado(int aniosAntiguedad,int salario, int cargasFamiliares) {
        this.aniosAntiguedad = aniosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(int cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }


    public double calcularSalario(double extra){
        if (aniosAntiguedad>1) {
            return salario+extra;
        } 
        return salario;
    }

    public String toString(Empleado Emp1){
        
        return  "Su cedula es "+cedula+"\n"+
                "Su nombre es "+Emp1.getNombre()+"\n"+
                "Su apellido es "+Emp1.getApellido()+"\n"+
                "Su fecha de nacimiento es "+formato.format(Emp1.getFechaString().getTime())+"\n"+
                "Su telefono es "+Emp1.getTelefono()+"\n"+
                "Su direccion es "+Emp1.getDireccion()+"\n"+
                "Su cargo es "+cargo+"\n"+
                "Sus años de antigüedad son: "+aniosAntiguedad+"\n"+
                "Su salario es de "+calcularSalario(salario/12)+" $\n"+
                "Sus cargas familiares son "+cargasFamiliares+"\n";
    }
    
}
