package adivina_el_numero.EJ1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("SISTEMA DE GESTIÓN DE NOTAS - MÓDULO: PROGRAMACIÓN JAVA");
        System.out.println("========================================================");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIntroduzca el número de alumnos a registrar en el grupo: ");
        int numAlumnos = sc.nextInt();

        Modulo programacion = new Modulo("PROGRAMACION JAVA", numAlumnos);

        System.out.println("\nIntroduzca cuántas notas se van a evaluar en este curso: ");
        int notasEvaluar = sc.nextInt();

        registroAlumnos(numAlumnos,notasEvaluar, programacion);

        System.out.println("========================================================");
        System.out.println("\tRESULTADOS DE LAS ESTADÍSTICAS GLOBALES");
        System.out.println("========================================================");

        programacion.generarInforme();

        System.out.println("\n*** ESTADÍSTICAS COMPLEMENTARIAS ***");
        System.out.println("- Nota media global de todo el grupo " + programacion.obtenerMediaGrupo());
        System.out.println("- Alumno destacado (Media más alta): "  + programacion.obtenerAlumnoDestacado().getNombre() + " (Media : " + programacion.obtenerAlumnoDestacado().obtenerMedia() + ")");

        System.out.println("\n> Nota más alta del curso:");
        programacion.obtenerNotaMasAlta();

        System.out.println("\n- Total de exámenes individuales aprobados en el grupo: " + programacion.calcularExamenesAprobados());
        System.out.println("\n*** RELACIÓN DE ALUMNOS QUE NO SUPERAN EL MÓDULO ***");
        System.out.println(Arrays.toString(programacion.obtenerAlumnosSuspensos()));
    }

    public static void registroAlumnos(int numAlumnos, int numNotasEvaluar, Modulo modulo) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numAlumnos; i++) {

            System.out.println("> Registro del alumno " + (i + 1) + ":");
            System.out.println("Nombre:");
            String nombre = scanner.next();

            Alumno aux = new Alumno(nombre, numNotasEvaluar);
            double notas[] = new double[numNotasEvaluar];

            for (int j = 0; j < numNotasEvaluar; j++) {
                double nota = 0;
                do {
                    System.out.println("Introduce la nota " + (j + 1) + ":");
                    nota = scanner.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("[ERROR]: La nota introducida no está entre 0 y 10. Inténtelo de nuevo.");
                    }
                } while (nota < 0 || nota > 10);
                notas[j] = nota;
            }

            aux.introducirNotas(notas);

            modulo.registrarAlumno(aux);
        }
    }
}
