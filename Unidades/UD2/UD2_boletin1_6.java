package ud2_boletin1;

import java.util.Scanner;

public class UD2_boletin1_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un caracter en minusculas");
        char car = sc.next().charAt(0);
        boolean esVocal = vocal(car);
        if(esVocal){
            System.out.println("Si es vocal");
        }
        else{
            System.out.println("No es vocal");
        }
    }
    
    public static boolean vocal(char car){
        if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'){
        return true;
        }
        else{
        return false;
        }
    }
    
}
