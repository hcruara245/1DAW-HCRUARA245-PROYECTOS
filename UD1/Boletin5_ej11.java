package boletin5_ej11;

import java.util.Scanner;

public class Boletin5_ej11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumapos = 0;
        int medianeg = 0;
        int numcero = 0;
        int contadorneg = 0;
        int num = 0;
        
        for(int i=1;i<=10;i++){
            System.out.println("Dime un numero");
            num = sc.nextInt();
            if(num == 0){
                numcero++;
            }
            else if( num < 0){
                medianeg = medianeg + num;
                contadorneg++;
            }
            else{
                sumapos = num + sumapos;
            }
        }
        System.out.println("Has escrito: " +numcero + " ceros");
        System.out.println("La suma de los positivos es: " +sumapos);
        if(contadorneg > 0){
        System.out.println("La media de los negativos es: " +(medianeg / contadorneg));
        }
    }
}
