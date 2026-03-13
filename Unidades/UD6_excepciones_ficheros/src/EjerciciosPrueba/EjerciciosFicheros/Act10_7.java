package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;

public class Act10_7 {
    public static void main(String[] args) {
        try {
            File miArchivo = new File("archivo.txt");
            if (miArchivo.createNewFile()) {
                System.out.println("Archivo creado: " + miArchivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            FileWriter fw1 = new FileWriter("archivo.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write("En un lugar de la mancha");
            bw1.newLine();
            bw1.write("de cuyo nombre no quiero acordarme");
            bw1.close();

            FileReader f1 = new FileReader("archivo.txt");
            BufferedReader br1 = new BufferedReader(f1);
            String linea;
            while ((linea = br1.readLine()) != null) {
                System.out.println(linea);
            }
            br1.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
        }
    }
}