package CaculadoraAreaPerimetro;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class Metodos extends Frame{
    
    public Metodos(){
        this.setTitle("Calculadora Area y Perimetro");
        this.setVisible(true);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
    }
    public void calcularAreaPerimetro(){
        Panel VentanaArea = new Panel(new BorderLayout());
        Panel Panelbotones = new Panel();
        Panel PanelTexto = new Panel();
        Label texto = new Label();
        Label texto2 = new Label("Seleccione una opcion:");
        Label texto3 = new Label();
        Button Area = new Button("Area");
        Button Regresar = new Button("Regresar");
        Button Perimetro = new Button("Perimetro");
        Button Salir = new Button("Salir");
        List figuras = new List();
        this.add(VentanaArea);
        figuras.setBackground(Color.cyan);
        figuras.add("Cuadrado");
        figuras.add("Triangulo");
        figuras.add("Rectangulo");
        texto.setBackground(Color.GRAY);
        texto.setText("BIENVENIDO A LA CALCULADORA AREA/PERIMETRO");
        VentanaArea.add(texto, BorderLayout.PAGE_START);
        VentanaArea.setBackground(Color.GRAY);
        VentanaArea.add(Panelbotones, BorderLayout.SOUTH);
        VentanaArea.add(PanelTexto, BorderLayout.CENTER);
        PanelTexto.add(texto2);
        Panelbotones.add(Area);
        Panelbotones.add(Regresar);
        Panelbotones.add(Perimetro);
        Panelbotones.add(Salir);
        System.out.println(figuras.getItem(0));

    }

    

    

 
}
