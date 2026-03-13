package EjerciciosPrueba.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act10_3 {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\unidades\\UD6_excepciones_ficheros\\src\\EjerciciosPrueba\\EjerciciosFicheros\\Act10_1.java");
        BufferedReader br1 = new BufferedReader(fr1);
        String line;

        while ((line = br1.readLine()) != null ){
            System.out.println(line);
        }

        br1.close();
    }
}
