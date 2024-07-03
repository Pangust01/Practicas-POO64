package ups;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManejoObjetosBinarios {

    // Escribir el objeto al archivo binario
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Juan", 30));
        listaPersonas.add(new Persona("Daniel", 18));
        listaPersonas.add(new Persona("Alexis", 18));

        try (FileOutputStream fos = new FileOutputStream("persona.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(listaPersonas.get(0));
            oos.writeObject(listaPersonas.get(1));
            oos.writeObject(listaPersonas.get(2));
            System.out.println("Objeto escrito al archivo binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("persona.bin");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Persona personaLeida = (Persona) ois.readObject();
            Persona personaLeida2 = (Persona) ois.readObject();
            Persona personaLeida3 = (Persona) ois.readObject();
            System.out.println("Objeto leído del archivo binario: " + personaLeida);
            System.out.println("Objeto leído del archivo binario: " + personaLeida2);
            System.out.println("Objeto leído del archivo binario: " + personaLeida3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
