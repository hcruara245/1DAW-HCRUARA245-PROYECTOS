package practica_2425_ej2;

import java.util.Scanner;

public class Practica_2425_ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pido el numero por teclado al usuario
        System.out.print("Dime un numero: ");
        long num = sc.nextLong();
        
        //Sitio donde creo las variables principales que voy a ir usando
        long dig_par = 0;
        long dig_impar = 0;
        long suma_par = 0;
        long suma_impar = 0;
        long digito = 0;
        long potencia = 1;
        //La variable de abajo es una variable temporal (copia del numero introducido por el usuario)
        long temp = num;
        
        //recorro el numero para ver los digitos que tiene
        while(potencia <= temp / 10){
            potencia *= 10;
        }
        
        //bucle donde voy a coger los digitos impares y los pares y los añadire a la suma
        while(num > 0){
            digito = num / potencia;
            num %= potencia;
            potencia /= 10;
            
            if(digito % 2 == 0){
                dig_par = dig_par * 10 + digito;
                suma_par += digito;
            }
            else{
                dig_impar = dig_impar * 10 + digito;
                suma_impar += digito;
            }
        }
        System.out.println("Digitos pares " + dig_par);
        System.out.println("Digitos impares " + dig_impar);
        System.out.println("Suma de los pares " + suma_par);
        System.out.println("Suma de los impares " + suma_impar);
    }
    
}
