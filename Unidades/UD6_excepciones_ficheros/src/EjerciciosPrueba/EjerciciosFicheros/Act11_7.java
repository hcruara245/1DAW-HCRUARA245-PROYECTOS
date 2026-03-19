package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;
import java.util.Scanner;

public class Act11_7 {
    public static void main(String[] args){
        grabarFichero();
        leerFichero();
    }

    public static void grabarFichero(){
        File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\numeros.dat");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            int num = 0;
            Scanner sc = new Scanner(System.in);
            while (num >= 0){
                System.out.println("DIME EL NÚMERO");
                num = sc.nextInt();
                if (num >= 0) {
                    oos.writeInt(num);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR CON EL ARCHIVO");
        } catch (IOException e) {
            System.out.println("ERROR AL EDITAR EL ARCHIVO");
        }
    }

    public static void leerFichero(){
        File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\numerosCopia.dat");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\numeros.dat"))){

            int num = 0;
            while (true){
                num = ois.readInt();
                System.out.println(num);
                oos.writeInt(num);
            }
        } catch (EOFException e){
            System.out.println("FIN DEL ARCHIVO");
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR CON EL ARCHIVO");
        } catch (IOException e) {
            System.out.println("ERROR DE I/O");
        }
    }
}