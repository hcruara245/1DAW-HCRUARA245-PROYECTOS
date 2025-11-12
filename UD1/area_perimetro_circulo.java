package area_perimetro_circulo;

import java.util.Scanner;

    public class area_perimetro_circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        final double numero_pi = 3.1416;
        
        double area = 0;
        double perimetro = 0;
        double radio = 0;
        
        System.out.println("introduce el radio");
        radio = sc.nextFloat();
        
        area = numero_pi*(radio*radio);
        System.out.println("el area es:");
        System.out.println(area);
        perimetro = numero_pi*(radio*2);
        System.out.println("el perimetro es:");
        System.out.println(perimetro);
    }
    
}
