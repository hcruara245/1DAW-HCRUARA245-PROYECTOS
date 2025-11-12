package ejercicios_adicionales_bucles_ejercicio_7_2;
public class Ejercicios_adicionales_bucles_ejercicio_7_2 {
    public static void main(String[] args) {
        System.out.println("Los multiplos de 7 menores que 100 son: ");
        
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                System.out.print(i +",");
            }
        }
    }
    
}
