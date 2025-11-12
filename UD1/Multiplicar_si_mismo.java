package multiplicar_si_mismo;

    import java.util.Scanner;


    public class Multiplicar_si_mismo {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        
            float numero = 0;
                System.out.println("Dime un numero real");
                numero = sc.nextFloat();
                System.out.println("Tu numero es:");
                System.out.println(numero);
                System.out.println("Tu numero multiplicado por si mismo es:");
                System.out.println(numero = numero*numero);        
    }
    
}
