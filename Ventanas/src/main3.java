
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class main3 {
    public static void main(String[] args) {
        Frame Marco = new Frame();
        Frame v7 = new Frame();
        Panel PanelPrincipal = new Panel();
        Panel PanelDcha = new Panel();
        Panel PanelIzq = new Panel();
        FlowLayout Flizq = new FlowLayout(FlowLayout.LEFT);
        Panel NewPanel = new Panel(Flizq);
        Button btnDescansar = new Button("Descansar");
        Button btnSaltar = new Button("Saltar");
        Button btnCorrer = new Button("Correr");
        Button btnA = new Button("Boton 1");
        Button btnB = new Button("Boton 2");
        Button btnC = new Button("Boton 3");
        Button btnD = new Button("Boton 4");
        btnSaltar.setBounds(100, 100, 70, 40);
        btnDescansar.setBounds(100, 100, 70, 40);
        btnCorrer.setBounds(100, 100, 70, 40);
        Marco.add(PanelPrincipal);
        Marco.setLocationRelativeTo(null);
        PanelPrincipal.add(PanelIzq);
        PanelPrincipal.add(PanelDcha);
        Marco.setSize(600, 400);
        Marco.setTitle("Ventana con paneles");
        Marco.setVisible(true);
        PanelPrincipal.setBackground(Color.darkGray);
        PanelDcha.setBackground(Color.gray);
        PanelIzq.add(btnSaltar);
        PanelIzq.add(btnCorrer);
        PanelDcha.add(btnDescansar);
        v7.add(NewPanel);
        v7.setSize(400, 200);
        NewPanel.add(btnA);
        NewPanel.add(btnB);
        NewPanel.add(btnC);
        NewPanel.add(btnD);
        NewPanel.setBackground(Color.green);
        v7.setVisible(true);
        

    }
}
