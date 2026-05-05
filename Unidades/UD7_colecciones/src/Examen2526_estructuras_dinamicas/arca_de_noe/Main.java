package Examen2526_estructuras_dinamicas.arca_de_noe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO EL ARCA DE NOÉ ---");
        List<String> especies = new ArrayList<>();
        especies.add("Pato");
        especies.add("Gato");
        especies.add("Perro");
        especies.add("PatO");
        especies.add("Tigre");
        especies.add("Pato");

        Set<String> especiesSet = new LinkedHashSet<>(especies);
        ArcaNoe arcaNoe = new ArcaNoe(especiesSet);

        System.out.println("> CARGANDO LA LISTA INICIAL DE ESPECIES " + especies + "\n");
        System.out.println("> CONJUNTO DE ESPECIES SIN REPETIR " + especiesSet + "\n");

        System.out.println("--- SUBIENDO ANIMALES AL ARCA ---");
        System.out.println();
        arcaNoe.subir(new Animal("Tigre",Sexo.HEMBRA));
        System.out.println();
        arcaNoe.subir(new Animal("Tigre",Sexo.MACHO));
        System.out.println();
        arcaNoe.subir(new Animal("Pato",Sexo.MACHO));
        System.out.println();
        arcaNoe.subir(new Animal("Pato",Sexo.HEMBRA));
        System.out.println();
        // AQUI DEBE DE DAR EL ERROR
        arcaNoe.subir(new Animal("Rinoceronte",Sexo.HEMBRA));
        System.out.println();
        // AQUI DEBE DAR ERROR
        arcaNoe.subir(new Animal("Pato",Sexo.MACHO));
        arcaNoe.subir(new Animal("PatO",Sexo.MACHO));
        System.out.println();

        System.out.println("--- MOSTRAR ANIMALES SUBIDOS ---");
        System.out.println("> EJECUTANDO MostrarAnimalesSubidos()");
        System.out.println("Listado de animales en el arca (Ordenados por especie y sexo)");
        arcaNoe.MostrarAnimalesSubidos();

        System.out.println("--- MOSTRAR ANIMALES RESTANTES ---");
        System.out.println("> EJECUTANDO MostrarAnimalesRestantes()");
        System.out.println("Listado de animales que faltan por subir para completar las parejas");
        arcaNoe.MostrarAnimalesRestantes();

        System.out.println("--- FIN DE LA EJECUCIÓN ---");
    }
}
