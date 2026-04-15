package ejercicios_presentacion.ListySet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        List listanums =  new ArrayList();
        int num = 0;
        do {
            num = pedirNum();
            if (num >= 0) {
                listanums.add(num);
            }
        } while (num >= 0);
        System.out.println(listanums);

        // RECORRER LISTA CON INDICE
        // PARA IMPRIMIR PARES Y BORRAR DIVISIBLES ENTRE 3
        for (int i = 0; i < listanums.size(); i++) {
            int numactual = (int) listanums.get(i);
            if (numactual % 2 == 0) {
                System.out.println(numactual);
            }
        }

        for (int i = 0; i < listanums.size(); i++) {
            int numactual = (int) listanums.get(i);
            if (numactual % 3 == 0) {
                listanums.remove(i);
            }
        }

        System.out.println(listanums);


        List listanums2 =  new ArrayList();
        int num2 = 0;
        do {
            num2 = pedirNum();
            if (num2 >= 0) {
                listanums2.add(num2);
            }
        } while (num2 >= 0);
        System.out.println(listanums2);

        // RECORRER LISTA CON ITERATOR
        // PARA IMPRIMIR PARES Y BORRAR DIVISIBLES ENTRE 3
        Iterator<Integer> it = listanums2.iterator();
        while(it.hasNext()){
            int elemento = Integer.parseInt(it.next().toString());
            if (elemento % 2 == 0) {
                System.out.println(elemento);
            }
        }

        Iterator<Integer> it2 = listanums2.iterator();
        while(it2.hasNext()){
            int elemento = Integer.parseInt(it2.next().toString());
            if (elemento % 3 == 0) {
                it2.remove();
            }
        }

        System.out.println(listanums2);
    }

    public static int pedirNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int num = sc.nextInt();
        return num;
    }
}
