package examen;

public class Fecha {

   public static boolean esFechaValida(int dia, int mes, int anyo) {
        boolean fechaValida = true;    
        if (anyo < 1 || anyo > 9999) {
            fechaValida = false;
        }else{
            
            if (mes < 1 || mes > 12) {
                fechaValida = false;
            }else{
                int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if (mes == 2 && esBisiesto(anyo)) {
                    diasPorMes[1] = 29;
                    // LO HE CAMBIADO DEL 2 al 1, ya que febrero sería la posición 1 del array,
                    // porqué el array empieza en 0
                }
                if (dia < 1 || dia > diasPorMes[mes -1]) {
                    fechaValida = false;
                }   
            }
        }
        return fechaValida;
    }
        
    private static boolean esBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }
    
}