package modelo;

public class EmpleadoAsalariado extends Empleado{
    private int aniosAntiguedad;
    private int salario;
    private int cargasFamiliares;

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
        return 0;
    }
    
}
