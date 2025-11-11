import java.util.Scanner;

public class ejercicio_programacion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura del rombo(entero positivo): ");
        int altura = sc.nextInt();
        //primera mitad del rombo :) (hay que hacerlo por partes)
        //parte 1 o parte de arriba
        for(int filas = 0;filas < altura;filas++){ 
            //calculo la cantidad que filas que quiero de esta parte
            //como es logico, hay que hacerlo hasta las mismas filas que altura
            for(int espacios = 0;espacios < altura - filas - 1;espacios++){
                //he hecho una calculadora de espacios encontrando un patron que se repetia
                //va a pintar tantos espacios hasta que sea igual que la altura menos las filas menos 1
                //de esa forma ira decreciendo, ya que las filas iran aumentando
                //solo hay que imprimir el espacio en blanco tantas veces hasta que sea igual que la operacion 
                System.out.print(" ");
            }
            for(int asteriscos = 0;asteriscos < filas * 2 + 1;asteriscos++){
                //aqui calculo la cantidad de asteriscos que necesito
                //siempre se repite un patron, empieza en 1, y aumenta de dos en dos
                //he localizado el patron, en este caso, la el doble de la fila mas uno para que sea impar siempre
                System.out.print("*");
            }
            System.out.println();
        }
        for(int filas = altura - 2;filas >= 0;filas--){
            //el mismo codigo que antes, pero empieza en la fila de despues de la mitad y va restandose
            //mientras sea mayor o igual que 0
            for(int espacios = 0;espacios < altura - filas - 1;espacios++){
                System.out.print(" ");
            }
            for(int asteriscos = 0;asteriscos < filas * 2 + 1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
