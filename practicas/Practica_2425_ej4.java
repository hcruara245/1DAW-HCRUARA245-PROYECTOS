package practica_2425_ej4;

import java.util.Scanner;

public class Practica_2425_ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sueldo = 0;
        int irpf = 0;
        int total = 0;
        System.out.print("Que cargo eres?(1-junior, 2-senior, 3-jefe proyecto): ");
        int cargo = sc.nextInt();
        System.out.print("Cuantos dias estuviste de viaje: ");
        int viaje = sc.nextInt();
        System.out.print("Estado civil(1-Soltero, 2-Casado): ");
        int estado_civil = sc.nextInt();
        
        switch(cargo){
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
        }
        switch(estado_civil){
            case 1:
                irpf = 25;
                break;
            case 2:
                irpf = 20;
                break;
        }
        
        System.out.println("-------------------------------");
        System.out.println("| Sueldo Base: " + sueldo +" eur       |");
        System.out.println("| Dietas (" +viaje +" viajes): " + (viaje * 30) +" eur  |");
        System.out.println("-------------------------------");
        System.out.println("| Sueldo bruto: " + (sueldo + (viaje*30)) +" eur      |");
        System.out.println("| Retencion IRPF " + irpf +"% : " + ((sueldo + (viaje*30)) * irpf / 100) +"    |");
        total = (sueldo + (viaje*30)) - ((sueldo + (viaje*30)) * irpf / 100);
        System.out.println("| Sueldo neto: " + total +" eur       |");
        System.out.println("-------------------------------");
    }
    
}
