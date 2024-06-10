package CaculadoraAreaPerimetro;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Metodos extends Frame {

    public Metodos() {
        this.setTitle("Calculadora Area y Perimetro");
        this.setVisible(true);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
    }

    public void menuAreaPerimetro() {
        Panel VentanaArea = new Panel(new BorderLayout());
        Panel Panelbotones = new Panel();
        Panel PanelTexto = new Panel();
        Label texto = new Label();
        Label texto2 = new Label("Seleccione una opcion:");
        Button Area = new Button("Area");
        Button Perimetro = new Button("Perimetro");
        Button Salir = new Button("Salir");
        this.add(VentanaArea);
        Salir.addActionListener((ActionEvent) -> {
            System.exit(0);
        });
        Area.addActionListener((ActionEvent) -> {
            CalcularPerimetro();
            this.dispose();
        });
        Perimetro.addActionListener((ActionEvent)->{
            calcularPerimetro();
            this.dispose();
        });

        texto.setBackground(Color.GRAY);
        texto.setAlignment(Label.CENTER);
        texto.setText("BIENVENIDO A LA CALCULADORA AREA/PERIMETRO");
        VentanaArea.add(texto, BorderLayout.PAGE_START);
        VentanaArea.setBackground(Color.GRAY);
        VentanaArea.add(Panelbotones, BorderLayout.SOUTH);
        VentanaArea.add(PanelTexto, BorderLayout.CENTER);
        PanelTexto.add(texto2);
        Panelbotones.add(Area);
        Panelbotones.add(Perimetro);
        Panelbotones.add(Salir);

    }

    public void CalcularPerimetro() {
        Frame CalcularPerimetro = new Frame();
        Panel panelPerimetro = new Panel(new BorderLayout());
        Panel panelList = new Panel(new BorderLayout());
        Panel panelFiguras = new Panel();
        Panel panelbotones = new Panel();
        Label lblTitulo = new Label("Bienvenido a la Calculadora de area de figuras");
        Label lblbase = new Label("Digite la base de su figura en centimetros:");
        Label lblaltura = new Label("Digite la altura de su figura en centimetros:");
        TextField txtBase = new TextField();
        TextField txtAltura = new TextField();
        TextArea txtPantalla = new TextArea();
        Button btnCalcular = new Button("Calcular");
        Button btnRegresar = new Button("Regresar");
        List figuras = new List();
        txtPantalla.setEditable(false);
        txtBase.setSize(100, 20);
        CalcularPerimetro.setTitle("Calcular Area");
        CalcularPerimetro.setSize(300, 400);
        CalcularPerimetro.add(panelPerimetro);
        CalcularPerimetro.setVisible(true);
        CalcularPerimetro.setLocationRelativeTo(null);
        panelPerimetro.add(panelList, BorderLayout.CENTER);
        panelList.add(figuras, BorderLayout.NORTH);
        panelPerimetro.add(lblTitulo, BorderLayout.NORTH);
        panelPerimetro.add(panelbotones, BorderLayout.SOUTH);
        panelFiguras.add(txtPantalla);
        txtPantalla.setBounds(10, 200, 250, 40);
        lblbase.setBounds(10, 5, 250, 30);
        txtBase.setBounds(10, 45, 150, 25);
        lblaltura.setBounds(10, 70, 250, 30);
        txtAltura.setBounds(10, 100, 150, 25);
        panelFiguras.setLayout(null);
        panelbotones.setBackground(Color.GREEN);
        panelbotones.add(btnCalcular);
        panelbotones.add(btnRegresar);
        panelList.setBackground(Color.GREEN);
        lblTitulo.setBackground(Color.GREEN);
        lblTitulo.setAlignment(Label.CENTER);
        figuras.setBackground(Color.cyan);
        figuras.add("Cuadrado");
        figuras.add("Triangulo");
        figuras.add("Rectangulo");
        figuras.addActionListener((ActionEvent) -> {
            if (figuras.getSelectedIndex() == 0) {
                panelList.add(panelFiguras, BorderLayout.CENTER);
                panelFiguras.add(lblbase);
                panelFiguras.add(txtBase);
                panelFiguras.remove(txtAltura);
                panelFiguras.remove(lblaltura);
                txtAltura.setText("");
                txtBase.setText("");
                txtPantalla.setText("");
                
            } else if (figuras.getSelectedIndex() == 1) {
                panelList.add(panelFiguras, BorderLayout.CENTER);
                txtBase.setColumns(10);
                txtAltura.setColumns(10);
                panelFiguras.add(lblbase);
                panelFiguras.add(txtBase);
                panelFiguras.add(lblaltura);
                panelFiguras.add(txtAltura);
                txtAltura.setText("");
                txtBase.setText("");
                txtPantalla.setText("");

            } else {
                panelList.add(panelFiguras, BorderLayout.CENTER);
                txtBase.setColumns(10);
                txtAltura.setColumns(10);
                panelFiguras.add(lblbase);
                panelFiguras.add(txtBase);
                panelFiguras.add(lblaltura);
                panelFiguras.add(txtAltura);
                txtAltura.setText("");
                txtBase.setText("");
                txtPantalla.setText("");

            }

            System.out.println(figuras.getSelectedItem());
        });
        btnRegresar.addActionListener((ActionEvent) -> {
            CalcularPerimetro.dispose();
            this.setVisible(true);
        });
        btnCalcular.addActionListener((ActionEvent) -> {
            double base = Double.parseDouble(txtBase.getText());
            double altura;
            double perimetroFiguras;
            if (figuras.getSelectedIndex() == 0) {
                perimetroFiguras = base * base;
                txtPantalla.setText("Su perimetro del cuadrado es: " + perimetroFiguras + " cm²");
            } else if (figuras.getSelectedIndex() == 1) {
                altura = Double.parseDouble(txtAltura.getText());
                perimetroFiguras = (base * altura) / 2;
                txtPantalla.setText("Su perimetro del triangulo es: " + perimetroFiguras + " cm²");
            } else {
                altura = Double.parseDouble(txtAltura.getText());
                perimetroFiguras = base * altura;
                txtPantalla.setText("Su perimetro del triangulo es: " + perimetroFiguras + " cm²");
            }

        });

    }

    public void calcularPerimetro(){
        Frame CalcularPerimetro = new Frame();
        Panel panelPerimetro = new Panel(new BorderLayout());
        Panel panelList = new Panel(new BorderLayout());
        Panel panelFiguras = new Panel();
        Panel panelbotones = new Panel();
        Label lblTitulo = new Label("Bienvenido a la Calculadora de area de figuras");
        Label lblbase = new Label("Digite la base de su figura en centimetros:");
        Label lblaltura = new Label("Digite la altura de su figura en centimetros:");
        TextField txtBase = new TextField();
        TextField txtAltura = new TextField();
        TextArea txtPantalla = new TextArea();
        Button btnCalcular = new Button("Calcular");
        Button btnRegresar = new Button("Regresar");
        List figuras = new List();
        txtPantalla.setEditable(false);
        txtBase.setSize(100, 20);
        CalcularPerimetro.setTitle("Calcular Area");
        CalcularPerimetro.setSize(300, 400);
        CalcularPerimetro.add(panelPerimetro);
        CalcularPerimetro.setVisible(true);
        CalcularPerimetro.setLocationRelativeTo(null);
        panelPerimetro.add(panelList, BorderLayout.CENTER);
        panelList.add(figuras, BorderLayout.NORTH);
        panelPerimetro.add(lblTitulo, BorderLayout.NORTH);
        panelPerimetro.add(panelbotones, BorderLayout.SOUTH);
        panelFiguras.add(txtPantalla);
        txtPantalla.setBounds(10, 200, 250, 40);
        lblbase.setBounds(10, 5, 250, 30);
        txtBase.setBounds(10, 45, 150, 25);
        lblaltura.setBounds(10, 70, 250, 30);
        txtAltura.setBounds(10, 100, 150, 25);
        panelFiguras.setLayout(null);
        panelbotones.setBackground(Color.ORANGE);
        panelbotones.add(btnCalcular);
        panelbotones.add(btnRegresar);
        panelList.setBackground(Color.ORANGE);
        lblTitulo.setBackground(Color.ORANGE);
        lblTitulo.setAlignment(Label.CENTER);
        figuras.setBackground(Color.cyan);
        figuras.add("Cuadrado");
        figuras.add("Triangulo Equilatero");
        figuras.add("Rectangulo");
        figuras.addActionListener((ActionEvent) -> {
            if (figuras.getSelectedIndex() == 0) {
                panelList.add(panelFiguras, BorderLayout.CENTER);
                panelFiguras.add(lblbase);
                panelFiguras.add(txtBase);
                panelFiguras.remove(txtAltura);
                panelFiguras.remove(lblaltura);
                txtAltura.setText("");
                txtBase.setText("");
                txtPantalla.setText("");
                
            } else if (figuras.getSelectedIndex() == 1) {
                panelList.add(panelFiguras, BorderLayout.CENTER);
                txtBase.setColumns(10);
                txtAltura.setColumns(10);
                panelFiguras.add(lblbase);
                panelFiguras.add(txtBase);
                panelFiguras.remove(lblaltura);
                panelFiguras.remove(txtAltura);
                txtAltura.setText("");
                txtBase.setText("");
                txtPantalla.setText("");

            } else {
                panelList.add(panelFiguras, BorderLayout.CENTER);
                txtBase.setColumns(10);
                txtAltura.setColumns(10);
                panelFiguras.add(lblbase);
                panelFiguras.add(txtBase);
                panelFiguras.add(lblaltura);
                panelFiguras.add(txtAltura);
                txtAltura.setText("");
                txtBase.setText("");
                txtPantalla.setText("");

            }

            System.out.println(figuras.getSelectedItem());
        });
        btnRegresar.addActionListener((ActionEvent) -> {
            CalcularPerimetro.dispose();
            this.setVisible(true);
        });
        btnCalcular.addActionListener((ActionEvent) -> {
            double base = Double.parseDouble(txtBase.getText());
            double altura;
            double perimetroFiguras;
            if (figuras.getSelectedIndex() == 0) {
                perimetroFiguras = base * 4;
                txtPantalla.setText("Su perimetro del cuadrado es: " + perimetroFiguras + " cm²");
            } else if (figuras.getSelectedIndex() == 1) {
                perimetroFiguras = base*3;
                txtPantalla.setText("Su perimetro del triangulo es: " + perimetroFiguras + " cm²");
            } else {
                altura = Double.parseDouble(txtAltura.getText());
                perimetroFiguras = (base*2)+(altura*2);
                txtPantalla.setText("Su perimetro del triangulo es: " + perimetroFiguras + " cm²");
            }

        });
    }

}
