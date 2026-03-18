package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;
import java.util.Scanner;

public class Act10_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("DIME EL NOMBRE DEL FICHERO: ");
        String nomarchivo = sc.nextLine();

        try (Scanner scread = new Scanner(new File(nomarchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter("copia_de_" + nomarchivo))) {

            while (scread.hasNextLine()) {
                String line = scread.nextLine();
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Copia finalizada con éxito.");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encontró el archivo de origen.");
        } catch (IOException e) {
            System.out.println("ERROR: Fallo al escribir en el nuevo archivo.");
        } finally {
            sc.close();
        }
    }
}