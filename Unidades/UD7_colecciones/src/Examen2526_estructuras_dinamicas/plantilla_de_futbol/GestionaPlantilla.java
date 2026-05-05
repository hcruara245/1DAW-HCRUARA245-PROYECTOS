package Examen2526_estructuras_dinamicas.plantilla_de_futbol;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GestionaPlantilla {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO GESTIÓN DE LA PLANTILLA ---");
        System.out.println("> Plantilla inicializada correctamente (Vacía)");
        Map<Integer,Jugador> plantilla =  new TreeMap<>();

        System.out.println("--- ALTA JUGADORES ---");
        altajugador(plantilla,1);
        altajugador(plantilla,2);
        altajugador(plantilla,3);
        System.out.println("--- MOSTRAR PLANTILLA ---");
        mostrar(plantilla);
        System.out.println("--- MOSTRAR PLANTILLA POR POSICION ---");
        mostrar(plantilla,"delantero");
        System.out.println("--- ELIMINAR JUGADOR CON DORSAL 3---");
        eliminarJugador(plantilla,3);
        System.out.println("--- MOSTRAR PLANTILLA ACTUALIZADA ---");
        mostrar(plantilla);
    }

    static boolean altajugador(Map<Integer,Jugador> plantilla, Integer dorsal) {
        boolean resultado = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el DNI del jugador: ");
        String dni= sc.nextLine();
        System.out.println("Ingresa la posicion del jugador (1-portero,2-defensa,3-medio,4-delantero): ");
        int posicion = sc.nextInt();
        Jugador jugador;
        System.out.println("> Intentando dar de alta: Dorsal " + dorsal +" | DNI: " + dni + " | Nombre: " + nombre + " | Posicion: " + posicion);
        // PERDONAME VICTOR POR ESTO PERO NO ME DEJABA CON UN SWITCH POR ALGUNA RAZÓN
        if (posicion == 1){
            jugador = new Jugador(nombre,dni,Posicion.portero);
        }
        else if (posicion == 2){
            jugador = new Jugador(nombre,dni,Posicion.defensa);
        }
        else if (posicion == 3){
            jugador = new Jugador(nombre,dni,Posicion.medio);
        }
        else if (posicion == 4){
            jugador = new Jugador(nombre,dni,Posicion.delantero);
        }
        else {
            System.out.println("ERROR CON LA POSICION");
            jugador = new  Jugador(nombre,dni,Posicion.medio);
        }

        boolean contienedorsal = plantilla.containsKey(dorsal);
        if(!contienedorsal){
            boolean contienejugador = plantilla.containsValue(jugador);
            if(!contienejugador){
                plantilla.put(dorsal,jugador);
                resultado = true;
                System.out.println("[EXITO] Jugador añadido a la plantilla correctamente.");
            }
            else {
                System.out.println("[ERROR] EL Jugador ya existe");
            }
        }
        else {
            System.out.println("[ERROR] El dorsal ya está ocupado");
        }

        return resultado;
    }

    // EN EL CASO QUE EL JUGADOR NO EXISTA SE DEVOLVERÁ UN NULL
    static Jugador eliminarJugador(Map<Integer,Jugador> plantilla, Integer dorsal) {
        Jugador jugador = null;
        if (plantilla.containsKey(dorsal)) {
            jugador = plantilla.get(dorsal);
            plantilla.remove(dorsal);
        }
        return jugador;
    }

    static void mostrar(Map<Integer,Jugador> plantilla) {
        plantilla.forEach((dorsal,jugador)->{
            System.out.println("Dorsal: " + dorsal + " - Nombre: " + jugador.getNombre() + "(DNI: " + jugador.getDNI() + ") - Posicion: " + jugador.getPosicion());
        });
    }

    static void mostrar(Map<Integer,Jugador> plantilla, String posicion) {
        posicion = posicion.toLowerCase();
        Posicion pos;
        if (posicion.equals("portero")){
            pos =  Posicion.portero;
        }
        else if (posicion.equals("defensa")){
            pos =  Posicion.defensa;
        }
        else if (posicion.equals("medio")){
            pos =  Posicion.medio;
        }
        else if (posicion.equals("delantero")){
            pos =  Posicion.delantero;
        }
        else {
            pos = Posicion.portero;
        }
        plantilla.entrySet().stream()
                .filter(e -> e.getValue().getPosicion().equals(pos))
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}