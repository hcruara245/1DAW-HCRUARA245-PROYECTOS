package EjerciciosPrueba.EjerciciosFicheros;

import java.io.FileReader;
import java.io.IOException;

public class Act10_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\unidades\\UD6_excepciones_ficheros\\src\\EjerciciosPrueba\\EjerciciosFicheros\\Act10_1.java");
        int c = 0;

        while ((c = fr1.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
