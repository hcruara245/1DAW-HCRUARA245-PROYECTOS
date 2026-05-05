package Examen2526_estructuras_dinamicas.arca_de_noe;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArcaNoe {
    private Set<String> especies = new TreeSet<>();
    private Set<Animal> animals = new TreeSet<>();

    public ArcaNoe(Set<String> especies) {
        if (especies != null) {
            this.especies = especies;
        }
    }

    public void subir(Animal a) {
        String especie = a.getEspecie();
        boolean subido = false;
        System.out.println("Intentando subir: " + a);
        if (!especies.contains(especie)) {
            System.out.println("[ERROR] No se pudo subir. Motivo: La especie " + especie + " no pertenece a la" +
                    " lista de especies que deben salvarse.");
        }
        else {
            if (animals.contains(a)) {
                System.out.println("[ERROR] No se pudo subir. Motivo: El animal " + a + " ya se encuentra" +
                        " actualmente en el arca");
            }
            else {
                animals.add(a);
                subido = true;
            }
        }

        if (subido){
            animals.add(a);
            System.out.println("[EXITO] " + a + " ha subido al arca");
        }
    }

    public void MostrarAnimalesSubidos(){
        Set<Animal> animalSet =  animals.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(animalSet);
    }

    public void MostrarAnimalesRestantes(){
        // Buscar para cada especie la hembra y el macho
        System.out.println("Listado de animales que faltan por subir al arca para completar las parejas: ");
        for (String especie: especies) {
            boolean macho = false;
            boolean hembra = false;
            Set<Animal> animalporespecie = animals.stream()
                    .filter(a -> a.getEspecie().equals(especie))
                    .collect(Collectors.toCollection(LinkedHashSet::new));
            for (Animal a : animalporespecie){
                if (a.getSexo() ==  Sexo.MACHO) {
                    macho = true;
                }
                else {
                    hembra = true;
                }
            }
            if (!hembra){
                System.out.println(especie + " - hembra");
            }
            if (!macho){
                System.out.println(especie + " - macho");
            }
        }
    }
}
