package adivina_el_numero;
public class Boletin5_ej5 {
    public static void main(String[] args) {
        int numero = 1;
        long multiplicacion = 1;
        
        while(numero <= 20){
            multiplicacion = multiplicacion * numero;
            numero++;
        }
        
        System.out.println(multiplicacion);
        
    }
    
}
