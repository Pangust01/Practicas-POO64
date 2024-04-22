package modelo;

public class EmpleadoPorHoras extends Empleado{
    private int numeroDeHorasTrabajas;
    private int valorHoraTrabajada;

    public EmpleadoPorHoras(){

    }

    public EmpleadoPorHoras(int numeroDeHorasTrabajas, int valorHoraTrabajada) {
        this.numeroDeHorasTrabajas = numeroDeHorasTrabajas;
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public int getNumeroDeHorasTrabajas() {
        return numeroDeHorasTrabajas;
    }

    public void setNumeroDeHorasTrabajas(int numeroDeHorasTrabajas) {
        this.numeroDeHorasTrabajas = numeroDeHorasTrabajas;
    }

    public int getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(int valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    
}
