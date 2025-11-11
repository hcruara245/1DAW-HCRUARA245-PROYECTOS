
package eliminar_ceros_ochos;

import java.util.Scanner;

public class Eliminar_ceros_ochos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        
        do {
            System.out.print("Introduzca un numero entero positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        int numeroOriginal = numero;
        int nuevoNumero = 0;      
        int contadorEliminados = 0;
        int posicion = 1;         

        
        while (numero > 0) {
            int digito = numero % 10;  
            numero /= 10;              

            if (digito == 0 || digito == 8) {
                contadorEliminados++;
            } else {
                nuevoNumero += digito * posicion;
                posicion *= 10;
            }
        }

        System.out.println("Numero resultado: " + nuevoNumero);
        System.out.println("Digitos eliminados: " + contadorEliminados);
    }
    
}
