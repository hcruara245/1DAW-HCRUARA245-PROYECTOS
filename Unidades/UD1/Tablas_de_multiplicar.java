package adivina_el_numero;

public class Tablas_de_multiplicar {

    public static void main(String[] args) {
        
        
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla + ":");
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {   
                int resultado = tabla * multiplicador;
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }
            System.out.println(); 
        }
    }
}
