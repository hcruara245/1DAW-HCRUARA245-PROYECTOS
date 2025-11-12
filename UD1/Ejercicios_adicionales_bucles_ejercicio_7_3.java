package ejercicios_adicionales_bucles_ejercicio_7_3;
public class Ejercicios_adicionales_bucles_ejercicio_7_3 {
    public static void main(String[] args) {
        System.out.println("Producto de primeros 10 impares");
        int total = 1;
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 1){
                total = i * total;                
            }
        }
        System.out.println("Producto: " + total);
    }
}