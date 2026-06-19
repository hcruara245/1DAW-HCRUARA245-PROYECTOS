package adivina_el_numero.EJ2;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su primer apellido: ");
        String ape1 = sc.nextLine();

        System.out.println("Introduzca su segundo apellido: ");
        String ape2 = sc.nextLine();

        int palabraMasLarga = 0;

        if (nombre.length() > palabraMasLarga) {
            palabraMasLarga = nombre.length();
        }
        if (ape1.length() > palabraMasLarga) {
            palabraMasLarga = ape1.length();
        }
        if (ape2.length() > palabraMasLarga) {
            palabraMasLarga = ape2.length();
        }

        for (int j = 0; j <= palabraMasLarga; j++) {
            if (nombre.length() <= j){
                System.out.print(' ');
            }
            else {
                System.out.print((char) nombre.charAt(j));
            }
            if (ape1.length() <= j){
                System.out.print(' ');
            }
            else {
                System.out.print((char) ape1.charAt(j));
            }
            if (ape2.length() <= j){
                System.out.print(' ');
            }
            else {
                System.out.print((char) ape2.charAt(j));
            }
            System.out.println();
        }
    }
}
