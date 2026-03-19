package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Act11_9 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\temp.dat");
        System.out.println("===================");
        System.out.println("-      MENU       -");
        System.out.println("===================");
        System.out.println("OPCIONES:");
        boolean seguir = true;
        while (seguir){
            System.out.println("¿QUE DESEA HACER?: ");
            System.out.println("1. Añadir nuevo registro");
            System.out.println("2. Mostrar listado de registros");
            System.out.println("3. SALIR");
            int opcion = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Elige 1, 2 o 3: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    newRegistro(file);
                    break;
                case 2:
                    mostrarRegistros(file);
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
                    break;
            }
        }
    }

    public static void newRegistro(File file){
        Scanner sc = new Scanner(System.in);
        System.out.print("DIME LA TEMPERATURA: ");
        double temp = sc.nextDouble();

        Registro[] registros = new Registro[0];

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            while (true){
                Registro r = (Registro) ois.readObject();

                registros = Arrays.copyOf(registros, registros.length + 1);
                registros[registros.length - 1] = r;
            }
        } catch (EOFException e){
            System.out.println("FIN DEL ARCHIVO");
        } catch (Exception e){
            System.out.println("ERROR AL LEER");
        }

        registros = Arrays.copyOf(registros, registros.length + 1);
        registros[registros.length - 1] = new Registro(temp, LocalDateTime.now());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            for (Registro r : registros){
                oos.writeObject(r);
            }
        } catch (IOException e) {
            System.out.println("ERROR DE ESCRITURA");
        }
    }

    public static void mostrarRegistros(File file){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            while (true){
                Registro r = (Registro) ois.readObject();
                System.out.println(r.fecha + " : " + r.temp);
            }
        }catch (EOFException e){
            System.out.println("FIN DEL ARCHIVO");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR CON EL ARCHIVO");
        } catch (IOException e) {
            System.out.println("ERROR DE ESCRITURA");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR DE CLASE");
        }
    }
}