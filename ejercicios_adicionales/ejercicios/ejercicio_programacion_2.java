package ejercicio1_11;

import java.util.Scanner; //importo libreria escaner

public class ejercicio_programacion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //espacio para crear variables
        int entradas_gol = 0;
        int entradas_preferencia = 0;
        boolean comprar = true;
        String seguir_comprando = "";
        int recaudacion = 0;
        int entradas_a_comprar = 0;
        int precio_gol = 25;
        int precio_preferencia = 40;
        int opcion = 0;
        int entradas_vendidas_gol = 0;
        int entradas_vendidas_preferencia = 0;
        
        //pregunto por las entradas de los dos lados y ademas el usuario introduce
        //por teclado el numero de entradas
        System.out.print("Introduce el numero de entradas disponibles en GOL: ");
        entradas_gol = sc.nextInt();
        System.out.print("Introduce el numero de entradas disponibles en PREFERENCIA: ");
        entradas_preferencia = sc.nextInt();
        
        //bucle donde lo voy a realizar todas las operaciones
        do{
            //menu principal de intento de compra, es solo estetico antes de recoger 
            //alguna informacion
            System.out.println("--- NUEVO INTENTO DE COMPRA ---");
            System.out.println("Entradas disponibles:");
            System.out.println("GOL: " + entradas_gol);
            System.out.println("PREFERENCIA: " + entradas_preferencia);
            System.out.println();
            System.out.println("EN que zona desea comprar?");
            System.out.println("1. GOL 25 euros");
            System.out.println("2. PREFERENCIA 40 euros");
            System.out.print("OPCION: ");
            //leo la opcion que introduce el usuario
            opcion = sc.nextInt();
            System.out.println();
            //si la opcion es 1, es decir, en GOL, se hara este codigo
            if(opcion == 1){
                System.out.print("Cuantas entradas desea comprar: ");
                entradas_a_comprar = sc.nextInt();
                if(entradas_a_comprar > 5){
                    System.out.println("ERROR: No se pueden comprar mas de 5 entradas por operacion");
                }
                else if(entradas_a_comprar > entradas_gol){
                    System.out.println("ERROR: No hay suficientes entradas disponibles en GOL");
                }
                //las dos condiciones anteriores muestran los errores en caso de que se quieran comprar
                //mas de 5 entradas o que las entradas que quieras comprar sean mayores a el numero 
                //de entradas que hay
                else{
                    System.out.println("Venta realizada correctamente");
                    System.out.println("Importe ganado: " + entradas_a_comprar * precio_gol);
                    recaudacion += entradas_a_comprar * precio_gol;
                    entradas_gol -= entradas_a_comprar;
                    entradas_vendidas_gol += entradas_a_comprar;
                }
                //en caso de que no de error, se añadira el dinero a una variable recaudacion
                //se le restara al numero de entradas disponibles y las entradas vendidas en gol aumentara 
                //segun el numero de entradas que haya comprado
                System.out.print("Desea seguir comprando?(s/n): ");
                seguir_comprando = sc.next();
                if(seguir_comprando.equals("s")){
                    comprar = true;
                }
                else{
                    comprar = false;
                }
                //condicion para seguir comprando o no, si se introduce la s volvera a hacer el bucle
                //si se introduce cualquier otro caracter no entrara en el bucle y se tomara como error
            }
            else if(opcion == 2){
                //si la opcion es 2, es decir, en preferencia, se hara este codigo
                System.out.print("Cuantas entradas desea comprar: ");
                entradas_a_comprar = sc.nextInt();
                if(entradas_a_comprar > 5){
                    System.out.println("ERROR: No se pueden comprar mas de 5 entradas por operacion");
                }
                else if(entradas_a_comprar > entradas_preferencia){
                    System.out.println("ERROR: No hay suficientes entradas disponibles en PREFERENCIA");
                }
                //las dos condiciones anteriores muestran los errores en caso de que se quieran comprar
                //mas de 5 entradas o que las entradas que quieras comprar sean mayores a el numero 
                //de entradas que hay
                else{
                    System.out.println("Venta realizada correctamente");
                    System.out.println("Importe ganado: " + entradas_a_comprar * precio_preferencia);
                    recaudacion += entradas_a_comprar * precio_preferencia;
                    entradas_preferencia -= entradas_a_comprar;
                    entradas_vendidas_preferencia += entradas_a_comprar;
                    //en caso de que no de error, se añadira el dinero a una variable recaudacion
                    //se le restara al numero de entradas disponibles y las entradas vendidas en preferencia aumentara 
                    //segun el numero de entradas que haya comprado
                }
                System.out.print("Desea seguir comprando?(s/n): ");
                seguir_comprando = sc.next();
                if(seguir_comprando.equals("s")){
                    comprar = true;
                }
                else{
                    comprar = false;
                }
                //condicion para seguir comprando o no, si se introduce la s volvera a hacer el bucle
                //si se introduce cualquier otro caracter no entrara en el bucle y se tomara como error
            }
        }
        while(entradas_gol + entradas_preferencia > 0 && comprar);
        
        System.out.println("------------------------------------");
        System.out.println("         Resumen FINAL");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Entradas vendidas:");
        System.out.println("GOL: " + entradas_vendidas_gol);
        System.out.println("PREFERENCIA: " + entradas_vendidas_preferencia);
        System.out.println();
        System.out.println("Recaudacion total: " + recaudacion + " euros");
        System.out.println();
        System.out.println("Entradas restantes: ");
        System.out.println("GOL: " + entradas_gol);
        System.out.println("PREFERENCIA: " + entradas_preferencia);
        //menu final donde se muestra toda la informacion de las ventas con las variables creadas anteriormente
    }
 
}
