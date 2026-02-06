package ejercicio1_11;

import java.util.Scanner;

public class ejercicio_programacion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca otro numero: ");
        int num2 = sc.nextInt();
        int caracteres_num1 = 0;
        int caracteres_num2 = 0;
        int cifras_iguales = 0;
        int digito1 = 0;
        int digito2 = 0;
        
        int temp1 = num1;
        int temp2 = num2;
        //creo dos variables temporañes, voy a comprobar la cantidad de digitos
        //de cada numero
        
        //creo dos bucles para comprobar la cantidad de digitos, si no coinciden
        //el programa mostrara un error
        while(temp1 > 0){
            temp1 /= 10;
            caracteres_num1++;
        }
        while(temp2 > 0){
            temp2 /= 10;
            caracteres_num2++;
        }
        temp1 = num1;
        temp2 = num2;
        //vuelvo a poner las temporales igual que los numeros para volver a hacer esta
        //iteracion que voy a explicar ahora
        if(caracteres_num1 == caracteres_num2){
            //reconozco cada digito y si coinciden el contador aumenta
            for(int i = 0;i < caracteres_num1;i++){
                while(temp1 > 0 && temp2 > 0){
                    digito1 = temp1 % 10;
                    temp1 /= 10;
                    digito2 = temp2 % 10;
                    temp2 /= 10;
                    if(digito1 == digito2){
                        cifras_iguales++;
                    }
                }
            }
            System.out.println("La cantidad de cifras que coinciden en la misma posicion: " + cifras_iguales);
        }
        else{
            System.out.println("Los numeros no tienen la misma cantidad de caracteres");
        }
    }
    
}
