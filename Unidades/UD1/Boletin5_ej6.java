package adivina_el_numero;



public class Boletin5_ej6 {

    
    public static void main(String[] args) {
        int numero = 0;
        int suma = 0;
        int multiplicacion = 1;
        int cantidadMulti = 1;
        
        
        while(numero < 21   ){
            numero++;
            suma = suma + numero;
        }
        
        System.out.println(suma);
        
        while(cantidadMulti<20){
            cantidadMulti++;
            if(cantidadMulti % 2 != 0){
            multiplicacion = cantidadMulti * multiplicacion;
            }
        }
        
        System.out.println(multiplicacion);
       
        
    }
    
}
