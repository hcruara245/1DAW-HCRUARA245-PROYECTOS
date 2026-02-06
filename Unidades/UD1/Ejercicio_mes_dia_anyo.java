package adivina_el_numero;

import java.util.Scanner;

public class Ejercicio_mes_dia_anyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**pedir el dia mes año de una fecha e indicar si es correcta hay que tener en cuenta que hay meses con 28 30 31 dias anyos bisiestos no cuentan */
        
        int dia = 0;
        int mes = 0;
        int anyo = 0;
        
        System.out.print("Dime un dia del mes: ");
        dia = sc.nextInt();
        
        System.out.print("Dime un mes del anyo: ");
        mes = sc.nextInt();
        
        System.out.print("Dime un anyo: ");
        anyo = sc.nextInt();
        
        while(dia > 31 || dia < 1){
            System.out.println("No cogiste una fecha correcta");
            break;
        }
        
        while(mes > 12 || mes < 1){
            System.out.println("No cogiste una fecha correcta");
            break;
        }
        
        switch(dia){
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28:
                System.out.println("Escogiste el dia: " + dia + " del mes " + mes + " del anyo " + anyo);
                break;
            case 29,30:
                if(mes == 2){
                    System.out.println("No cogiste una fecha correcta");
                    break;
                }
                else{
                    System.out.println("Elegiste el dia: " + dia + " del mes " + mes + " del anyo " + anyo);
                    break;
                }
            case 31:
                if(mes == 4 || mes == 6 || mes == 9){
                    System.out.println("No cogiste una fecha correcta");
                    break;
                }
                else{
                    System.out.println("Cogiste el dia: " + dia + " del mes " + mes + " del anyo " + anyo);
                    break;
                }
            }
            
        
        
        
    }
}
    
    
