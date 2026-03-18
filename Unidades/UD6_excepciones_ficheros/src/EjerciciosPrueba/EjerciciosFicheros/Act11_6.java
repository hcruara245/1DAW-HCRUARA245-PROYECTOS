package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;

public class Act11_6 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\cancionpirata.dat"))) {

            String micacion = (String) ois.readObject();
            System.out.println(micacion);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo en la ruta especificada.");
        } catch (EOFException e) {
            System.out.println("Fin del archivo alcanzado.");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
