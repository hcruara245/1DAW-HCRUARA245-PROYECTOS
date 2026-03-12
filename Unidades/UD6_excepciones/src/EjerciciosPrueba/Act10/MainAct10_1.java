package EjerciciosPrueba.Act10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAct10_1 {
    public static void main(String[] args) {
        Integer num = 0;
        boolean cambiado = false;
        while (!cambiado) {
            try {
                num = leerEntero();
                cambiado = true;
            } catch (InputMismatchException exception) {
                System.out.println("NO TIENE EL FORMATO DESEADO");
            }
        }
    }

    static Integer leerEntero() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        Integer num = 0;
        System.out.println("Dime el número");
        num = sc.nextInt();

        return num;
    }
}
