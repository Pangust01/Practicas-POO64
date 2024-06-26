package ups;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JOptionPane;
public class VentanaPrincipal extends Frame{
    public VentanaPrincipal(){
        this.setTitle("Iniciar la division");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void panelInicial(){
  
            Panel panelP = new Panel(new BorderLayout());
            Panel panelComponentes = new Panel();
            Panel panelBtns = new Panel();
            Label lblTitulo = new Label("Calculadora de dividir numero enteros");
            Label lblDivision = new Label("¿Desea iniciar la division?");
            TextArea txtpantalla = new TextArea();
            Button btnIniciar = new Button("Iniciar");
            Button btnCancelar = new Button("Cancelar");
            Button btnSalir = new Button("Salir");
            this.add(panelP);
            panelP.add(lblTitulo, BorderLayout.NORTH);
            panelP.add(panelComponentes, BorderLayout.CENTER);
            panelP.add(panelBtns, BorderLayout.SOUTH);
            panelComponentes.add(lblDivision);
            panelComponentes.add(txtpantalla);
            panelBtns.add(btnIniciar);
            panelBtns.add(btnCancelar);
            panelBtns.add(btnSalir);
    
            btnIniciar.addActionListener((ActionListener)-> {
                    try {
                        String dividendo = JOptionPane.showInputDialog("Ingrese el primer numero para dividir");
                        String divisor = JOptionPane.showInputDialog("Ingrese el segundo numero para dividir");
                        int a = Integer.parseInt(dividendo);
                        int b = Integer.parseInt(divisor);
                        int cociente = a/b;
                        txtpantalla.setText("Su division es: "+cociente);
                        
                    }  catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir para 0");
                        System.out.println("Error encontrado: " + e);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Coloque solo numeros enteros");
                        System.out.println("Error encontrado: " + e);
                    }   
            });
        

    }
}
