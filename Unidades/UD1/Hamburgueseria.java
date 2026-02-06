package adivina_el_numero;

import java.util.Scanner;

public class Hamburgueseria {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double preciofinal = 0;
        double hamnormal = 0;
        double hamgourmet = 0;
        double precionormal = 3;
        double preciogourmet = 5;
        double descuento = 12;
        boolean club = false;
        double descuentototal = 0;
        
        System.out.println("Pedidos pitana feliz");
        System.out.print("Numero hamburguesas normales: ");
        hamnormal = sc.nextInt();
        System.out.print("Numero hamburguesas gourmet: ");
        hamgourmet = sc.nextInt();
        System.out.print("Dia de la semana: ");
        String dia = sc.next();
        System.out.print("Pertenece al club fanegas?(s/n): ");
        String respuesta = sc.next();
        
        
        if((dia.equals("martes"))){
            if(hamgourmet>=2){
                preciogourmet = 4.5;
            }
        }
        
        else if((dia.equals("miercoles"))){
            precionormal = 2;
        }
            
            
        if((respuesta.equals("s"))){
            club = true;
        }
        else if ((respuesta.equals("n"))){
            club = false;
        }
        
        preciofinal = hamgourmet * preciogourmet + hamnormal * precionormal;
        
        if(club){
            descuentototal = preciofinal * descuento / 100;
        }
        
        System.out.println();
        System.out.println("Aqui tiene su pedido. Gracias por su compra");
        System.out.println("Hamburguesas basicas: " +hamnormal);
        System.out.println("Hamburguesas gourmet: " +hamgourmet);
        System.out.println("Total: " +preciofinal +" euros");
        System.out.println("Descuento: " +descuentototal +" euros");
        System.out.println("A pagar: " +(preciofinal - descuentototal) +" euros");
        
        
    }
    
}
