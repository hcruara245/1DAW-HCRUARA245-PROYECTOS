package adivina_el_numero;

import java.util.Scanner;

public class Boletin6_ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia = 0;
        int mes = 0;
        int diasMes = 0;
        int diasInicio = 0;
        int mesMeses= 0;
        int total = 0;
        
        System.out.println("Que dia es hoy?");
        dia = sc.nextInt();
        System.out.println("Que mes es hoy?");
        mes = sc.nextInt();
        if(mes>12){
            System.out.println("No has introducido una fecha valida");
        }
        if(dia>30){
            System.out.println("No has introducido una fehca valida");            
        }
        
        diasMes = 30 - dia;
        mesMeses = 12 - mes;
        diasInicio = diasMes + mesMeses * 30;
        total = 360 - diasInicio;
        System.out.println("Han pasado " + total + " dias");
        
    }
    
}
