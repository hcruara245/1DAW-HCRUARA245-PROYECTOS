package EjerciciosPrueba.EjerciciosFicheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Act10_4 {
    public static void main(String[] args) throws IOException {
        try {
        FileReader fr1 = new FileReader("NumerosReales.txt");
        int c = 0;
        int[] nums = new int[1];
        int pos = 0;

        while ((c = fr1.read()) != -1){
            if ((char) c == ' '){
                nums = Arrays.copyOf(nums, nums.length + 1);
                pos++;
            }
            else if (Character.isDigit(c)) {
                nums[pos] = Character.getNumericValue(c);
            }
        }
        int suma = 0;
        for (int i = 0; i < nums.length;i++){
            suma += nums[i];
        }
        System.out.println("LA SUMA ES: " + suma);
        System.out.println("LA MEDIA ES: " + (suma / nums.length));


//            Scanner sc = new Scanner(new File("NumerosReales.txt"));
//            double[] nums = new double[1];
//            int pos = 0;
//
//            while (sc.hasNextDouble()) {
//                if (pos >= nums.length) {
//                    nums = Arrays.copyOf(nums, nums.length + 1);
//                }
//                nums[pos] = sc.nextDouble();
//                pos++;
//            }
//
//            double suma = 0;
//            for (int i = 0; i < nums.length;i++){
//                suma += nums[i];
//            }
//            System.out.println("LA SUMA ES: " + suma);
//            System.out.println("LA MEDIA ES: " + (suma / nums.length));
        } catch (IOException e) {
            System.out.println("ARCHIVO NO ENCONTRADO");
        }
    }
}
