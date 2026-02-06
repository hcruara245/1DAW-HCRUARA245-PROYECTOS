package aumento_tiempo;

import java.util.Scanner;

public class piramideHueca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();
        
        for(int filas = 0;filas < altura;filas++){
            for(int espacios = 1;espacios < altura - filas;espacios++){     
                    System.out.print(" ");
            }
            for(int asterisco = 0;asterisco < filas + 1;asterisco++){
                if(filas == altura - 1 && asterisco < filas){
                    System.out.print("**");
                }
                else if(asterisco < 2){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
