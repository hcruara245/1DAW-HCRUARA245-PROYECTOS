package EjerciciosPrueba.EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Act10_5 {
    public static void main(String[] args) {
        File file = new File("NumerosReales.txt");
        try {
            Scanner sc = new Scanner(file);
            double[] nums = new double[1];
            double suma = 0;
            while (sc.hasNextLine()){
                nums[nums.length - 1] = sc.nextDouble();
                suma += (nums[nums.length - 1]);
                nums = Arrays.copyOf(nums,nums.length+1);
            }
            System.out.println(Arrays.toString(nums));
            System.out.println("LA SUMA DE TODO ES: " + suma);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }
}
