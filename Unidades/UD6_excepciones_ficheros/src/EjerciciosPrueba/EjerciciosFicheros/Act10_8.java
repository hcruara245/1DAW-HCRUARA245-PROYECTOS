package EjerciciosPrueba.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Act10_8 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("NO EXISTE EL ARCHIVO");
        }
    }
}