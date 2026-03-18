package EjerciciosPrueba.EjerciciosFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Act11_5 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\tabla.dat");
             ObjectInputStream ois = new ObjectInputStream(fileInputStream)){

            double[] miArray = (double[]) ois.readObject();

            for (double valor : miArray) {
                System.out.println(valor);
            }
            System.out.println("Array leído exitosamente.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
