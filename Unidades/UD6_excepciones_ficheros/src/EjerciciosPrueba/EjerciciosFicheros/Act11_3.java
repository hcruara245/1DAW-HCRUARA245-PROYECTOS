package EjerciciosPrueba.EjerciciosFicheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Act11_3 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime el tamaño de la tabla: ");
            int tamanyoTabla = sc.nextInt();

            double[] nums = new double[tamanyoTabla];

            for (int i = 0; i < nums.length; i++) {
                System.out.println("Dime el numero " + (i+1));
                nums[i] = sc.nextDouble();
            }

            sc.close();

            File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\tabla.dat");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(nums);

            oos.close();
        }catch (IOException e){
            System.out.println("ERROR INPUT/OUTPUT");
        }
    }
}
