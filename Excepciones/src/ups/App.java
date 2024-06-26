package ups;

import javax.swing.JOptionPane;

public class App {
    public static int divide(int x, int y){
        return x/y;
    }
    public static void main(String[] args) throws Exception {
        try {
            int resultado = divide(10,0);
            System.out.println("Resultado: "+resultado);
        } catch (ArithmeticException e) {
            //maneja cualquier otra exepcion
            JOptionPane.showMessageDialog(null, "No se puede dividir para 0");
        }catch (Exception e){
            System.out.println("Ocurrio un error inesperado "+ e.getMessage());
        } finally{
            System.out.println("Accion completa");
        }
    }
}
