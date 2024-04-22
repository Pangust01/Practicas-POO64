package modelo;

public class EmpleadoPorComision extends Empleado{
    private double totalDeVentas;
    private double porcentajeComision;
    private double salario;
    
    public EmpleadoPorComision(){

    }

    public EmpleadoPorComision(double totalDeVentas, double porcentajeComision, double salario) {
        this.totalDeVentas = totalDeVentas;
        this.porcentajeComision = porcentajeComision;
        this.salario = salario;
    }

    public double getTotalDeVentas() {
        return totalDeVentas;
    }

    public void setTotalDeVentas(double totalDeVentas) {
        this.totalDeVentas = totalDeVentas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
