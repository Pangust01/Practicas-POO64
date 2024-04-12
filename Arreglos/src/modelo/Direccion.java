package modelo;

public class Direccion {
    private String calle1="";
    private String calle2="";
    private int numero;
    //Constructores
    public Direccion(){
        
    }
    public Direccion(String calle1, String calle2, int numero) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numero = numero;
    }

    public Direccion(String calle1, String calle2) {
        this.calle1 = calle1;
        this.calle2 = calle2;
    }

    public Direccion(String calle1) {
        this.calle1 = calle1;

    }

    //Metodos

    public String getCalle1() {
        return calle1;
    }
    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }
    public String getCalle2() {
        return calle2;
    }
    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public String toString(){
        return "Dirección: {Calle principal: "+calle1+"}"+
                "Dirección: {Calle Secundaria: "+calle2+"}"+
                "Numero: "+numero;
    }
    

}
