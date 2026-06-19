package Subida_de_notas_2526.Arbol_Genealogico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class PruebaArbol {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("INICIO DE LA PRUEBA: EJERCICIO 2");
        System.out.println("=================================");

        System.out.println("\n --- Creación de objetos en memoria ---");

        Persona abueloPaterno = new  Persona("Alberto","Gómez", 80,null,null);
        Persona abuelaPaterna = new Persona("Luisa","Martinez",78,null,null);
        Persona abueloMaterno = new Persona("Pedro", "Perez", 72, null,null);
        Persona abuelaMaterna = new Persona("Ana","Ruiz",65,null,null);
        Persona padre = new Persona("Carlos","Gomez",55,abueloPaterno,abuelaPaterna);
        Persona madre = new Persona("María","Perez",52, abueloMaterno,abuelaMaterna);
        Persona hijo = new Persona("Juan", "Gómez Perez",25, padre,madre);

        System.out.println(hijo);

        System.out.println("EDAD DE LOS ABUELOS:");
        System.out.println(hijo.obtenerEdadAbuelos());

        Persona[] personas = calcularMasJoven(padre,madre,hijo);
        for (Persona p : personas) {
            System.out.println(p.getNombre() + "(" + p.getEdad() + ")");
        }

        generarArbol(hijo);
    }

    static void generarArbol(Persona p){
        String nomarchivo = p.getNombre().trim() + ".txt";
        File arbol = new File(nomarchivo);


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arbol));){

            Persona aux = p;
            Persona aux2 = p;
            bw.write(aux.toString());
            bw.newLine();

            while (aux.getMadre() != null || aux.getPadre() != null || aux2.getPadre() != null || aux2.getMadre() != null) {
                if (aux2.getPadre() != null){
                    aux2 = aux2.getPadre();
                    bw.write(aux2.toString());
                    bw.newLine();
                }
                else {
                    bw.write(aux2.toString());
                    bw.newLine();
                }
                if (aux.getMadre() != null){
                    aux = aux.getMadre();
                    bw.write(aux.toString());
                    bw.newLine();
                }
                else {
                    bw.write(aux.toString());
                    bw.newLine();
                }
            }



        } catch (IOException e) {
            System.out.println("Error al abrir el arbol");
        }
    }

    static Persona[] calcularMasJoven(Persona p1, Persona p2, Persona p3){
        Persona[] personas = {p1,p2,p3};

        Arrays.sort(personas, (o1, o2) -> {
            int res = 0;

            if (o1.getEdad() > o2.getEdad()) {
                res = 1;
            } else if (o1.getEdad() < o2.getEdad()) {
                res = -1;
            }

            return res;
        });

        return personas;
    }
}
