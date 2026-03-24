package Examen25_26_ej2;

import java.io.*;
import java.util.Arrays;

public class MainFicherosDeTexto {
    public static void main(String[] args) {
        ordenarPalabras("frutas.txt");
        ordenarPalabras("planetas.dat");
    }

    public static void ordenarPalabras(String nomFichero) {
        String[] palabrasfichero = nomFichero.split("\\.");
        String nomcopia = palabrasfichero[0];
        nomcopia += "_sort.";
        nomcopia += palabrasfichero[1];
        File file = new File(nomcopia);
        try (BufferedReader br1 = new BufferedReader(new FileReader(nomFichero));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(nomcopia))) {

            String[] palabras = new String[0];
            boolean seguir =  true;
            while (seguir) {
                String nuevapalabra= br1.readLine();
                if (nuevapalabra != null) {
                    palabras = Arrays.copyOf(palabras, palabras.length+1);
                    palabras[palabras.length-1] = nuevapalabra;
                }
                else {
                    seguir = false;
                }
            }

            Arrays.sort(palabras);

            for (int i = 0; i < palabras.length; i++) {
                bw1.write(palabras[i]);
                bw1.newLine();
            }

        }catch (EOFException e){
            System.out.println("FIN DEL ARCHIVO");
        }
        catch (IOException e) {
            System.out.println("ERROR CON EL FICHERO");
        }
    }
}
