package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;

public class Act11_1 implements Serializable {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int[] enteros = {6,1,75,1,67,4,5,7,1,1};
            File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\datos.dat");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            for (int i = 0; i < enteros.length; i++) {
                oos.writeInt(enteros[i]);
            }

            oos.close();
        }catch (FileNotFoundException e){
            System.out.println("EL ARCHIVO NO SE PUDO CREAR");
        } catch (IOException e) {
            System.out.println("ERROR DE ENTRADA Y SALIDA");
        }
    }
}
