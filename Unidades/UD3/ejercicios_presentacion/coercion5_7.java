package ejercicios_presentacion;

import java.util.Scanner;

public class coercion5_7 {
    public static void main(String[] args) {
        int t[] = pedirValores();
        int tablaSinCeros[] = sinRepetidos(t);
        for(int i = 0;i < tablaSinCeros.length;i++){
            System.out.println(tablaSinCeros[i]);
        }
    }
    
    public static int[] sinRepetidos(int t[]){
        int provisional[] = new int[t.length];
        int contador = 0;
        
        for(int i = 0;i < t.length;i++){
            boolean repetido = false;
            for(int j = 0;j < provisional.length;j++){
                if(t[i] == provisional[j]){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                provisional[contador] = t[i];
                contador++;
            }
        }
        
        int resultado[] = new int [contador];
        for(int i = 0; i < contador;i++){
            resultado[i] = provisional[i];
        }
        return resultado;
    }
    
    public static int[] pedirValores(){
        Scanner sc = new Scanner(System.in);
        int longitudTabla = 0;
        System.out.print("¿De cuanta longitud quieres la tabla?: ");
        longitudTabla = sc.nextInt();
        int tabla[] = new int[longitudTabla];
        System.out.println("Dime los valores de la tabla");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Dime el numero " + (i+1) +" : ");
            tabla[i] = sc.nextInt();
        }
        
        return tabla;
    }
}