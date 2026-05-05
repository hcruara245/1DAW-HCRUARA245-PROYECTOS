import java.util.*;
import java.util.stream.*;
import java.util.function.*;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class pruebaEmpleados {
    public static void main(String[] args) {
        // ■■ Datos iniciales ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        List<Empleado> empleados = new ArrayList<>(Arrays.asList(
                new Empleado(1, "Ana Garcia", "IT", 45000, 6),
                new Empleado(2, "Luis Martinez", "RRHH", 28000, 2),
                new Empleado(3, "Sara Lopez", "IT", 52000, 8),
                new Empleado(4, "Pedro Ruiz", "Ventas", 31000, 4),
                new Empleado(5, "Marta Sanz", "IT", 29000, 1),
                new Empleado(6, "Carlos Diaz", "Ventas", 38000, 5),
                new Empleado(7, "Elena Vega", "RRHH", 26000, 3),
                new Empleado(8, "Tomas Gil", "IT", 61000, 10)
        ));

        // ■■ EJERCICIO 1 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        // Apartado 1a:
        Set<String> departamentosUnicos = new HashSet<>();
        for (Empleado emp : empleados) {
            departamentosUnicos.add(emp.getDepartamento());
        }

        System.out.println("\n=== DEPARTAMENTOS UNICOS ===");
        System.out.println(departamentosUnicos);

        // Apartado 1b: ...
        Map<String, List<Empleado>> empleadosPorDepartamento = new HashMap<>();

        for (Empleado emp : empleados) {
            if (empleadosPorDepartamento.containsKey(emp.getDepartamento())) {
                empleadosPorDepartamento.get(emp.getDepartamento()).add(emp);
            } else {
                empleadosPorDepartamento.put(emp.getDepartamento(), new ArrayList<>(List.of(emp)));
            }
        }

        System.out.println("\n=== EMPLEADOS POR DEPARTAMENTOS ===");
        System.out.println(empleadosPorDepartamento);

        // Apartado 1c: ...
        Iterator<String> it = departamentosUnicos.iterator();
        while (it.hasNext()) {
            String depto = it.next();
            if (depto.length() < 4) {
                departamentosUnicos.remove(depto);
            }
        }

        System.out.println("\n=== DEPARTAMENTOS DE 4 O MÁS CARACTERES ===");
        System.out.println(empleadosPorDepartamento);

        // Apartado 1d: ...
        System.out.println("\n=== DEPARTAMENTOS (TreeSet) ===");
        System.out.println(new TreeSet<>(departamentosUnicos));

        System.out.println("\n=== DEPARTAMENTOS (LinkedHashSet) ===");
        System.out.println(new LinkedHashSet<>(departamentosUnicos));

        // Apartado 1e: ...
        Map<String, Empleado> empleadoMejorPagadoPorDpto = new HashMap<>();
        for (Empleado emp : empleados) {
            if (empleadoMejorPagadoPorDpto.containsKey(emp.getDepartamento())) {
                if (emp.getSalario() > empleadoMejorPagadoPorDpto.get(emp.getDepartamento()).getSalario()) {
                    empleadoMejorPagadoPorDpto.replace(emp.getDepartamento(), emp);
                }
            } else {
                empleadoMejorPagadoPorDpto.put(emp.getDepartamento(), emp);
            }
        }

        System.out.println("\n=== EMPLEADO MEJOR PAGADO POR DEPTO ===");
        System.out.println(empleadoMejorPagadoPorDpto);

        // ■■ EJERCICIO 2 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        // Apartado 2a: ...
        List<String> list2a =
                empleados.stream()
                        .filter(e -> e.getDepartamento().equals("IT") && e.getSalario() > 30000)
                        .map(e -> e.getDepartamento().toUpperCase())
                        .toList();

        System.out.println("\n=== EMPLEADOS DE IT CON SALARIO DE MAS DE 30k ===");
        System.out.println(empleadoMejorPagadoPorDpto);

        // Apartado 2b: ...
        double salarioMedio = empleados.stream()
                .filter(e -> e.getAniosExperiencia() > 3)
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElseThrow();

        System.out.println("\n=== SALARIO MEDIO COM +3 AÑOS EXP ===");
        System.out.println(salarioMedio);

        // Apartado 2c: ...
        Comparator<Empleado> comparadorEmp = (o1, o2) -> {
            int res = o1.getDepartamento().compareTo(o2.getDepartamento());

            if (res == 0) {
                res = (int) (o2.getSalario() - o1.getSalario());
            }

            return res;
        };

        System.out.println("\n=== EMPLEADOS ORDENADOS POR DEP Y SALARIO DESC ===");
        empleados.stream()
                .sorted(comparadorEmp)
                .forEach(e ->
                        System.out.println(e.getNombre() + ", " + e.getDepartamento() + ", " + e.getSalario())
                );

        // Apartado 2d: ...
        Map<String, Double> mapSalarioMedioDpto = empleados.stream()
                .collect(groupingBy(
                        Empleado::getDepartamento,
                        averagingDouble(Empleado::getSalario)
                ));

        System.out.println("\n=== MEDIA DE SALARIO POR DEPARTAMENTO ===");
        System.out.println(mapSalarioMedioDpto);

        // Apartado 2e: ...
        empleados.get(0).setProyectos(Arrays.asList("Migración Cloud", "Seguridad"));
        empleados.get(1).setProyectos(Arrays.asList("Contratación", "Nóminas"));
        empleados.get(2).setProyectos(Arrays.asList("Migración Cloud", "App Móvil"));
        empleados.get(3).setProyectos(Arrays.asList("Campaña Verano"));
        empleados.get(4).setProyectos(Arrays.asList("Soporte IT"));
        empleados.get(5).setProyectos(Arrays.asList("Campaña Verano", "B2B"));
        empleados.get(6).setProyectos(Arrays.asList("Formación"));
        empleados.get(7).setProyectos(Arrays.asList("App Móvil", "Seguridad", "IA"));

        Set<String> proyectosIT = empleados.stream()
                .filter(e -> e.getDepartamento().equals("IT"))
                .flatMap(e -> e.getProyectos().stream())
                .collect(Collectors.toSet());

        System.out.println("\n=== APARTADO 2E: PROYECTOS ÚNICOS DE IT ===");
        System.out.println(proyectosIT);


        // Apartado 2f: ...
        double masaSalarial = empleados.stream()
                .map(Empleado::getSalario) // Transformamos a Stream de Doubles
                .reduce(0.0, Double::sum); // Acumulamos sumando

        System.out.println("\n=== APARTADO 2F: MASA SALARIAL TOTAL ===");
        System.out.println("Masa salarial total: " + masaSalarial + " EUR");


        // Apartado 2g: ...
        double mediaEmpresa = empleados.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0.0);

        Map<Boolean, List<Empleado>> empleadosParticionados = empleados.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalario() > mediaEmpresa));

        System.out.println("\n=== APARTADO 2G: EMPLEADOS POR ENCIMA DE LA MEDIA (" + mediaEmpresa + ") ===");
        System.out.println("-> POR ENCIMA DE LA MEDIA:");
        empleadosParticionados.get(true).forEach(e -> System.out.println(e.getNombre() + " (" + e.getSalario() + ")"));
        System.out.println("-> POR DEBAJO O IGUAL A LA MEDIA:");
        empleadosParticionados.get(false).forEach(e -> System.out.println(e.getNombre() + " (" + e.getSalario() + ")"));

        // ■■ EJERCICIO 3 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

        // Apartado 3a: Lambda Transformador<Empleado, String>
        Transformador<Empleado, String> resumenEmpleado = e ->
                String.format("[%d] %s | Dpto: %s | Salario: %.0f EUR | Exp: %d años",
                        e.getId(), e.getNombre(), e.getDepartamento(), e.getSalario(), e.getAniosExperiencia());


        // Apartado 3b: Lambda Transformador<List<Empleado>, Map<String,Long>>
        Transformador<List<Empleado>, Map<String, Long>> contadorPorDpto = lista ->
                lista.stream()
                        .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.counting()));

        System.out.println("\n=== APARTADO 3B: EMPLEADOS POR DEPARTAMENTO ===");
        System.out.println(contadorPorDpto.transformar(empleados));


        // Apartado 3c: Probar el método aplicarATodos
        System.out.println("\n=== APARTADO 3C: RESUMEN DE TODOS LOS EMPLEADOS ===");
        List<String> resumenes = aplicarATodos(empleados, resumenEmpleado);
        resumenes.forEach(System.out::println);


        // Apartado 3d: Pipeline con Function.andThen
        // Definimos las funciones individuales para el pipeline
        Function<List<Empleado>, Stream<Empleado>> paso1Filtro =
                lista -> lista.stream().filter(e -> e.getSalario() > 25000);

        Function<Stream<Empleado>, Stream<String>> paso2Transformar =
                stream -> stream.map(e -> resumenEmpleado.transformar(e)); // O e -> resumenEmpleado.aplicar(e)

        Function<Stream<String>, List<String>> paso3Ordenar =
                stream -> stream.sorted().collect(Collectors.toList());

        // Componemos el pipeline
        Function<List<Empleado>, List<String>> pipelineCompleto =
                paso1Filtro.andThen(paso2Transformar).andThen(paso3Ordenar);

        System.out.println("\n=== APARTADO 3D: PIPELINE (Salario > 25k, Resumen, Orden Alfabético) ===");
        List<String> resultadoPipeline = pipelineCompleto.apply(empleados);
        resultadoPipeline.forEach(System.out::println);
    }

    // Método genérico — Ejercicio 3c
    public static <T, R> List<R> aplicarATodos(List<T> lista, Transformador<T, R> t) {
        List<R> resultado = new ArrayList<>();
        for (T elemento : lista) {
            // Llama al método de la interfaz funcional (asumo que se llama 'transformar')
            resultado.add(t.transformar(elemento));
        }
        return resultado;
    }
}