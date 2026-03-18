package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;

public class Act11_4 {
    public static void main(String[] args) { // Quitamos el throws
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\datos.dat");
             ObjectInputStream ois = new ObjectInputStream(fileInputStream)) {

            int[] nums = new int[10];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = ois.readInt();
                System.out.print(nums[i] + ",");
            }

        } catch (FileNotFoundException e) {
            System.out.println("EL ARCHIVO NO EXISTE");
        } catch (EOFException e) {
            System.out.println("FIN DE ARCHIVO ALCANZADO PREMATURAMENTE");
        } catch (IOException e) {
            System.out.println("ERROR I/O");
        }
    }

}
