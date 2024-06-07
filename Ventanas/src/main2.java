
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class main2 {
    public static void main(String[] args) {
        Frame v5 = new Frame();
        Panel miPanel = new Panel();
        Button btnArea = new Button("Calcular área");
        Button btnPerimetro = new Button("Calcular Perimetro");
        btnArea.setBounds(50, 100, 100, 30);
        btnPerimetro.setBounds(210, 100, 150, 30);
        v5.setLocationRelativeTo(null);
        v5.setBackground(Color.DARK_GRAY);
        v5.setLayout(null);
        v5.setSize(400,200);
        v5.setTitle("Ventana con boton");
        v5.add(miPanel);
        v5.add(btnArea);
        v5.add(btnPerimetro);
        v5.setVisible(true);

    }
}
