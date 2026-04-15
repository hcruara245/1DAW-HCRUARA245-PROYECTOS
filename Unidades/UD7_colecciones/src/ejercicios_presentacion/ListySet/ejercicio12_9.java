package ejercicios_presentacion.ListySet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ejercicio12_9 {
    public static void main(String[] args) {
        int cantidadnums = (int) (Math.random()*10+1);
        Scanner sc = new Scanner(System.in);
        List listanums = new ArrayList();
        for (int i = 0; i <= cantidadnums; i++) {
            System.out.println("dime el numero");
            int num = sc.nextInt();
            listanums.add(num);
        }

        Iterator it = listanums.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof Integer num) {
                if (num % 2 == 0) {
                    num = num * 100;
                    System.out.println(num);
                }
            }
        }
    }
}
