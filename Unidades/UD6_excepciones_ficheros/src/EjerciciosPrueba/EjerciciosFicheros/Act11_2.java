package EjerciciosPrueba.EjerciciosFicheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Act11_2 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\cancionpirata.dat");
            String cancion = "BEEEETISS ALE, \n REAALL BETIS BALOMPIEE, \n TIENES QUE GANAR LA COPAAAA";

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(cancion);
            oos.close();
        }catch (IOException e){
            System.out.println("ERROR DE INPUT Y OUTPUT");
        }
    }
}
