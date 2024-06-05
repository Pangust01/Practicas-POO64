
import java.awt.Frame;
import java.awt.Point;

public class VentanaNueva extends Frame{

    public VentanaNueva() {
        this("Ventana 1", 600, 400);
        
    }

    public VentanaNueva(String titulo) {
        this.setTitle(titulo);
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        
    }

    public VentanaNueva(String titulo, int ancho, int alto) {
        this(titulo);
        this.setSize(ancho, alto);

    }

    public VentanaNueva(String titulo, int ancho, int alto, int posX, int posY) {
        this(titulo,ancho,alto);
        this.setLocation(new Point(posX, posY));
        
    }

    public void actionListener(){
        dispose();
    }


}
