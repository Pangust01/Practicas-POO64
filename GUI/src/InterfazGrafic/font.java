package InterfazGrafic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class font extends Panel{
    public font(){

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Configurar el font
        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("TEXTO USANDO: Serif con negrita, tamaño 12", 20, 50);

        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("TEXTO USANDO: Monospaced con cursiva, tamaño 24", 20, 100);

        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("TEXTO USANDO: SansSerif con texto plano, tamaño 14", 20, 150);

        g.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 18));
        g.setColor(Color.RED);
        g.drawString("Serif 18 TEXTO USANDO: negrita con cursiva",20, 200);

    }

    public void Ventana(){
        Frame ventanaFuente = new Frame();
        ventanaFuente.add(this);
        ventanaFuente.setSize(800,400);
        ventanaFuente.setLocationRelativeTo(null);
        ventanaFuente.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }   
        });
        ventanaFuente.setVisible(true);
    }

}
