package ud2_boletin1;

import java.util.Scanner;

public class UD2_boletin1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        int contadorprimos = divisorprimo(num);
        System.out.println("Ese numero tiene " +contadorprimos +" numeros primos divisores");
    }
    
    public static int divisorprimo(int a){
        int contador = 0;
        for(int i = 2; i < a; i++){
            if(a % i == 0){
            contador++;
            }
        }
        return contador;
    }
}
