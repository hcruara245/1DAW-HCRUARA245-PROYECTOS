package ejercicios_presentacion;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntuaciones[] = pedirPuntuacion();
        System.out.println("Vienen programadores de exhibición?");
        String respuesta = sc.next();
        if(respuesta.equals("si")){
            int resultados[] = pedirProgramadoresExhibicion(puntuaciones);
            pedirNotasExhibicion(resultados);
            for(int i = 0;i < resultados.length; i++){
                System.out.println(resultados[i]);
            }
        }
        else{
            for(int i = 0;i < puntuaciones.length; i++){
                System.out.println(puntuaciones[i]);
            }
            System.out.println("-1");
        }
    }
    
    public static int[] pedirPuntuacion(){
        Scanner sc = new Scanner(System.in);
        int puntuacion[] = new int [5];
        for(int i = 0; i < puntuacion.length; i++){
            System.out.print("Dime la puntuación " +(i+1) +" : ");
            puntuacion[i] = sc.nextInt();
        }
        
        return puntuacion;
    }
    
    public static int[] pedirProgramadoresExhibicion(int tabla[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantos programadores de exhibición vienen?: ");
        int progExhib = sc.nextInt();
        int resultado[] = Arrays.copyOf(tabla, tabla.length + progExhib);
        return resultado;
    }
    
    public static int[] pedirNotasExhibicion(int t[]){
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        
        for(int i = 5; i < t.length; i++){
            System.out.print("Dime la puntuación " + contador +" :");
            t[i] = sc.nextInt();
            contador++;
        }
        
        return t;
    }
}
