package EjerciciosPrueba.EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Act10_6 {
    public static void main(String[] args) {
        File file = new File("Enteros.txt");
        try {
            Scanner sc = new Scanner(file);
            int[] nums = new int[1];
            int suma = 0;
            while (sc.hasNextLine()){
                nums[nums.length - 1] = sc.nextInt();
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
