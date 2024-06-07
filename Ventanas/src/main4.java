
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class main4 {
    public static void main(String[] args) {
        Frame Marco = new Frame();
        Panel PanelGeneral = new Panel();
        Panel PanelMenuNorte = new Panel(new FlowLayout());
        Button btnOp1 = new Button("Opcion 1");
        Button btnOp2 = new Button("Opcion 1");
        Button btnOp3 = new Button("Opcion 1");
        Button btnOeste = new Button("Oeste");
        Button btnSur = new Button("Sur");
        Button btnNorte = new Button("Norte");
        Button btnEste = new Button("Este");
        Marco.setSize(600, 400);
        Marco.add(PanelGeneral);
        PanelMenuNorte.add(btnOp1);
        PanelMenuNorte.add(btnOp2);
        PanelMenuNorte.add(btnOp3);
        PanelGeneral.setLayout(new BorderLayout());
        PanelGeneral.add(btnOeste, BorderLayout.WEST);
        PanelGeneral.add(btnEste, BorderLayout.EAST);
        PanelGeneral.add(btnSur, BorderLayout.SOUTH);
        PanelGeneral.add(btnNorte, BorderLayout.NORTH);
        PanelGeneral.add(PanelMenuNorte);
        PanelGeneral.setBackground(Color.gray);
        PanelMenuNorte.setBackground(Color.CYAN);
        Marco.setVisible(true);

    }
}
