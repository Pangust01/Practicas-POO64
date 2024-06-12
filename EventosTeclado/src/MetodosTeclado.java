
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MetodosTeclado extends KeyAdapter{
    Label mensaje;
    TextArea pantalla;
    public MetodosTeclado(Label mensaje, TextArea pantalla){
        this.mensaje = mensaje;
        this.pantalla= pantalla;
    }

    @Override
    public void keyTyped(KeyEvent e){
                //Un sout
                mensaje.setText(mensaje.getText()+e.getKeyChar());
                String msg = mensaje.getText();
                pantalla.setText(msg);
                if (e.getKeyChar()=='*') {
                    System.exit(0);
                }
    }



    
}
