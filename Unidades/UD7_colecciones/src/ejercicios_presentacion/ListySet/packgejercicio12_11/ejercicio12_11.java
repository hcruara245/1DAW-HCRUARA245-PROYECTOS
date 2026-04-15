package ejercicios_presentacion.ListySet.packgejercicio12_11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12_11 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("socios.dat"))){
            boolean seguir = true;
            ArrayList socios = new ArrayList();
            while (seguir){
                System.out.println("opciones:");
                System.out.println("1. alta");
                System.out.println("2. baja");
                System.out.println("3. modificar");
                System.out.println("4. listar por dni");
                System.out.println("5. listar por antiguedad");
                System.out.println("6. salir");
                System.out.println("================");
                System.out.print("ELECCIÓN: ");
                Scanner leer = new Scanner(System.in);
                int opcion = leer.nextInt();
                switch (opcion){
                    case 1:
                        leer.nextLine();
                        System.out.println("Dime los datos del socio: ");
                        System.out.print("nombre: ");
                        String nombre = leer.nextLine();
                        System.out.print("DNI: ");
                        String dni = leer.next();
                        System.out.print("anio: ");
                        int anio = leer.nextInt();
                        Socio socio = new Socio(nombre,dni,anio);
                        socios.add(socio);
                        for (Object sc : socios){
                            Socio aux = (Socio) sc;
                            oos.writeObject(aux);
                        }
                        break;
                    case 2:
                        System.out.println("Dime el dni del socio a borrar: ");
                        String dnisocio = leer.next();

                        java.util.Iterator it = socios.iterator();
                        while (it.hasNext()) {
                            Socio aux = (Socio) it.next();
                            if (aux.getDni().equals(dnisocio)) {
                                it.remove();
                                System.out.println("Socio eliminado.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Dime el dni del socio a modificar: ");
                        String sociodni = leer.next();
                        boolean salir = false;
                        for (int i = 0; i < socios.size() && !salir; i++) {
                            Socio aux = (Socio) socios.get(i);
                            if (aux.getDni().equals(sociodni)) {
                                System.out.println("Socio encontrado. Introduce nuevos datos:");
                                System.out.print("Nuevo nombre: ");
                                aux.setNombre(leer.next());
                                System.out.print("Nuevo DNI: ");
                                aux.setDni(leer.next());
                                System.out.print("Nuevo anio: ");
                                aux.setFecha_alta(leer.nextInt());
                                salir = true;
                            }
                        }
                        break;
                    case 4:
                        Object sociosaux[] = socios.toArray();
                        Arrays.sort(sociosaux);
                        System.out.println(Arrays.toString(sociosaux));
                        break;
                    case 5:
                        Object sociosaux2[] = socios.toArray();
                        Arrays.sort(sociosaux2,new ComparaPorAntiguedad());
                        System.out.println(Arrays.toString(sociosaux2));
                        break;
                    case 6:
                        System.out.println("Guardando datos en socios.dat...");
                        for (Object sc : socios) {
                            Socio aux = (Socio) sc;
                            oos.writeObject(aux);
                        }
                        seguir = false;
                        System.out.println("¡Adiós!");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }
}
