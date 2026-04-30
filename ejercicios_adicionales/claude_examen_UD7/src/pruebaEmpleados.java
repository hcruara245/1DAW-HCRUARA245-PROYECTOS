import java.util.*;

public class pruebaEmpleados {
    public static void main(String[] args) {
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
        // Apartado 1a: ...
        Set<String> departamentosUnicos = new HashSet<>();
        Iterator<Empleado> it = empleados.iterator();
        while (it.hasNext()) {
            departamentosUnicos.add(it.next().getDepartamento());
        }
        System.out.println("Departamentos: " + departamentosUnicos);
        // Apartado 1b: ...
        Map<String,List<Empleado>> empleadosByDepartamento = new HashMap<>();
        Iterator<String> it2 = departamentosUnicos.iterator();
        while (it2.hasNext()) {
            empleadosByDepartamento.put(it2.next(), new ArrayList<>());
        }
        // Apartado 1c: ...
        // Apartado 1d: ...
        // Apartado 1e: ...
        // ■■ EJERCICIO 2 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        // Apartado 2a: ...
        // Apartado 2b: ...
        // Apartado 2c: ...
        // Apartado 2d: ...
        // Apartado 2e: (añade proyectos a los empleados antes del stream)
        // Apartado 2f: ...
        // Apartado 2g: ...
        // ■■ EJERCICIO 3 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        // Apartado 3a: ...
        // Apartado 3b: ...
        // Apartado 3c: ...
        // Apartado 3d: ...
    }
    // Método genérico — Ejercicio 3c
    public static <T, R> List<R> aplicarATodos(
            List<T> lista, Transformador<T, R> t) {
// TODO
        return null;
    }
}