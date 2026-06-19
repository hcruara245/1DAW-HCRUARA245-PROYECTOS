package Examen2526_estructuras_dinamicas.expresiones_lambda_y_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PruebaCiudades {

    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Madrid", "España", 3300000, false, 80, true, 3));
        ciudades.add(new Ciudad("Barcelona", "España", 1600000, true, 60, true, 2));
        ciudades.add(new Ciudad("Valencia", "España", 800000, true, 40, false, 0));
        ciudades.add(new Ciudad("París", "Francia", 2100000, false, 120, true, 1));
        ciudades.add(new Ciudad("Split","Croacia", 200000, true, 70, false, 0));
        ciudades.add(new Ciudad("Dubrovnik","Croacia", 180000, true, 70, false, 0));
        ciudades.add(new Ciudad("Roma", "Italia", 2800000, true, 200, false, 0));

        // apartado a:
        ReporteCiudad reporteCorto = c ->  {
            return "La ciudad " + c.getNombre() + " se encuentra en " + c.getPais();
        };

        // apartado b:
        ReporteCiudad reporteTuristico = c ->  {
            return "La ciudad " + c.getNombre() + " tiene " + c.getMonumentosHistoricos() + " monumentos historicos y cuenta con " + c.getHabitantes() + " habitantes";
        };

        // apartado c:
        System.out.println(reporteCorto.generar(new Ciudad("Madrid", "España", 3300000, false, 80, true, 3)));
        System.out.println(reporteTuristico.generar(new Ciudad("Roma", "Italia", 2800000, true, 200, false, 0)));

        // apartado d:
        System.out.println();
        ciudades.stream()
                .filter(Ciudad::isTienePlaya)
                .forEach(System.out::println);

        // apartado e:
        System.out.println();
        ciudades.stream()
                .filter(Ciudad::isVisitado)
                .filter(ciudad -> ciudad.getHabitantes() > 2000000)
                .map(Ciudad::getNombre)
                .sorted(String::compareTo)
                .forEach(System.out::println);

        // apartado f:
        System.out.println();
        List<String> ciudadesnovisitadas = ciudades.stream()
                .filter(c -> !c.isVisitado())
                .filter(Ciudad::isTienePlaya)
                .sorted(Comparator.comparingInt(Ciudad::getHabitantes).reversed())
                .map(Ciudad::getNombre)
                .map(String::toUpperCase)
                .toList();

        System.out.println(ciudadesnovisitadas);

        // apartado g:
        System.out.println();
        ciudades.stream()
                .filter(ciudad -> ciudad.getPais().equalsIgnoreCase("CROACIA"))
                .peek(ciudad -> ciudad.setVecesVisitado(ciudad.getVecesVisitado() + 1))
                .forEach(ciudad -> ciudad.setVisitado(true));

        // Mostrar ciudades croacia
        ciudades.stream()
                .filter(ciudad -> ciudad.getPais().equalsIgnoreCase("CROACIA"))
                .forEach(System.out::println);

        // apartado h:
        int totalhabs = (int) ciudades.stream()
                .filter(c -> c.getPais().equalsIgnoreCase("ESPAÑA"))
                .mapToDouble(Ciudad::getHabitantes)
                .reduce(0, Double::sum);
        System.out.println(totalhabs);
    }
}
