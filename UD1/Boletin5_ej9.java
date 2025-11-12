package boletin5_ej9;
import java.util.Scanner;
public class Boletin5_ej9 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner (System.in);     
        int numero = 0;
        int media = 0;
        int contador = 0;
        while(numero>=0){
            System.out.println("Dime un numero positivo");
            numero = sc.nextInt();
            if(numero>0){
            contador++;
            media = numero + media;
            }
            else{
                media = media / contador;
                System.out.println("Tu ultimo numero ha sido negativo, la media de los positivos es: " +media);
            }
        }
    }
}
