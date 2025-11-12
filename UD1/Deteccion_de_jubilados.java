package deteccion_de_jubilados;
    
    import java.util.Scanner; // importo libreria input

    public class Deteccion_de_jubilados {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name = ""; // declaro variables
        int edad = 0; // declaro variables
        int anos_cotizados = 0; // declaro variables
        boolean trabajo_riesgo = true; // declaro variables
            System.out.println("Dime el nombre de la persona"); // pregunto por nombre
            name = sc.nextLine();
            System.out.println("Dime la edad de la persona"); // pregunto por edad
            edad = sc.nextInt();
            System.out.println("Dime los anos cotizados"); // pregunto por años cotizados
            anos_cotizados = sc.nextInt();
            System.out.println("Ha sido un trabajo de riesgo(true o false)"); // pregunto por trabajo peligrosos
            trabajo_riesgo = sc.nextBoolean();
                if (edad >=65 || edad>59 && edad<65 && anos_cotizados>35 || edad>50 && trabajo_riesgo) { 
                    System.out.println("Enhorabuena te puedes jubilar");
                   }   else{
                            System.out.println("A seguir trabajando");
                                }
         
    }
}
