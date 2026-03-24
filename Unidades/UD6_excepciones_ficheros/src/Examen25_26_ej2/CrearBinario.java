package Examen25_26_ej2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author losad
 */
public class CrearBinario {
     public static void main(String[] args) {
         
        String parte1 =  " Hola"; 
        String parte2 =  " esto es un examen de ficheros";
        String parte3 =  " 1DAW!!";
        
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("ficheroBinario.dat"))) {
                        out.writeObject(parte1);
                        out.writeObject(parte2);
                        out.writeObject(parte3);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

