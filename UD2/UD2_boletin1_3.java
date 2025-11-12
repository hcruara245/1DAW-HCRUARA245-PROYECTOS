package ud2_boletin1_3;

import java.util.Scanner;

public class UD2_boletin1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que vas a hacer?(1 area, 2 altura): ");
        int eleccion = sc.nextInt();
        System.out.print("Dime el radio: ");
        double radio = sc.nextFloat();
        System.out.print("Dime la altura ");
        double altura = sc.nextFloat();
        calcular(eleccion, radio, altura);
    }
    
    public static void calcular(int eleccion, double radio, double altura){
        if(eleccion == 1){
            double area = 2 * Math.PI * (radio + altura);
            System.out.print("El area es: " + area);
        }
        else if(eleccion == 2){
            double volumen = Math.PI * (radio * radio) * altura;
            System.out.print("El volumen es: " + volumen);
        }
        else{
            System.out.println("No escribiste ni 1 ni 2");
        }
    }
}
