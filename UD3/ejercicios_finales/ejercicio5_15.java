package ejercicios_finales;

import java.util.Scanner;

public class ejercicio5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int grupo[] = new int[5];
        int notas[][] = new int[3][5];
        notas = pedirNotas(notas);
        mostrarNotasGrupo(notas);
        System.out.print("¿De qué alumno quieres la nota?(0-4): ");
        int alumPedido = sc.nextInt();
        mostrarNotaAlum(notas, alumPedido);
    }
    
    public static int[][] pedirNotas(int notas[][]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                System.out.print("Dime la nota del trimestre " + (i + 1) + " del alumno " +(j + 1) +" : ");
                notas[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return notas;
    }
    
    public static void mostrarNotasGrupo(int notas[][]){
        double mediaT1 = 0;
        double mediaT2 = 0;
        double mediaT3 = 0;
        
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                if(i == 0){
                    mediaT1 += notas[i][j];
                }
                else if(i == 1){
                    mediaT2 += notas[i][j];
                }
                else if(i == 2){
                    mediaT3 += notas[i][j];
                }
            }
        }
        
        mediaT1 /= 5;
        mediaT2 /= 5;
        mediaT3 /= 5;
        
        System.out.println("Media del grupo del T1: " +mediaT1);
        System.out.println("Media del grupo del T2: " +mediaT2);
        System.out.println("Media del grupo del T3: " +mediaT3);
    }
    
    public static void mostrarNotaAlum(int notas[][], int alum){
        double mediaAlum = 0;
        
        for(int i = 0; i < 3; i++){
            mediaAlum += notas[i][alum];
        }
        
        mediaAlum /= 3;
        
        System.out.println("La nota media del alumno " +(alum + 1) +" es: " + mediaAlum);
    }
}
