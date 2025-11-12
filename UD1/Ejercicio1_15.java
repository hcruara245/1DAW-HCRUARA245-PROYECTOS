package ejercicio1_15;

import java.util.Scanner;

public class Ejercicio1_15 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero1 = 0;
            int numero2 = 0;
            int numero3 = 0;
            
                System.out.println("Dime el numero 1");
                numero1 = sc.nextInt();
                System.out.println("Dime el numero 2");
                numero2 = sc.nextInt();
                System.out.println("Dime el numero 3");
                numero3 = sc.nextInt();
                
                    int mayor,medio,menor;
                
                    if (numero1 >= numero2 && numero1 >= numero3){
                        mayor = numero1;
                        if(numero2>=numero3){
                            medio=numero2;
                            menor=numero3;
                        } else {
                            medio = numero3;
                            menor = numero2;
                        }
                    
                    } else if (numero2 >= numero1 && numero2 >= numero3 ){
                        mayor = numero2; 
                        if(numero1 >= numero3){
                            medio = numero1;
                            menor = numero3;
                        } else{
                            medio = numero3;
                            menor = numero1;
                        }
                    } else {
                        mayor = numero3;
                        if(numero1 >= numero2){
                            medio = numero1;
                            menor = numero2;
                        } else{
                            medio = numero2;
                            menor = numero1;
                        }
                    }
                    
                        System.out.println("Los numeros ordenados de mayor a menor es: " + mayor + "," + medio + "," + menor);
            
            
    }
    
}