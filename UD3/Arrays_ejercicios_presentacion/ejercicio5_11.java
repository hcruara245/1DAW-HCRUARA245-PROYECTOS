package ejercicios_presentacion;

import java.util.Scanner;

public class ejercicio5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿De cuánto tamaño quieres la combinacion?: ");
        int tamanyo = sc.nextInt();
        int combinacion[] = crearCombinacion(tamanyo);
        adivinarCombinacion(combinacion);
    }
    
    public static int[] crearCombinacion(int longitud){
        int combinacion[] = new int [longitud];
        
        for(int i = 0;i < combinacion.length; i++){
            combinacion[i] = (int) (Math.random()*6) + 1;
        }
        
        return combinacion;
    }
    
    public  static void adivinarCombinacion(int[] t){
        int aciertos = 0;
        int intento = 0;
        int indice = 0;
        Scanner sc = new Scanner(System.in);
        while(aciertos != t.length){
            System.out.print("Dime tu intento " + (aciertos + 1) + " : ");
            intento = sc.nextInt();
            if(intento == t[indice]){
                indice++;
                aciertos++;
                System.out.println("¡ACIERTO!");
            }
            else if(intento < t[indice]){
                System.out.println("ES MAYOR");
            }
            else{
                System.out.println("ES MENOR");
            }
        }
    }
}