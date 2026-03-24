package Examen25_26_ej2;

import EjerciciosPrueba.EjerciciosFicheros.Socio;

import java.io.*;

public class LecturaBinario {
    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ficheroBinario.dat"))){
            while (true){
                String palabra = ois.readObject().toString();
                System.out.print(palabra);
            }
        }catch (EOFException e){
            System.out.println("FIN DEL ARCHIVO");
        } catch (IOException e) {
            System.out.println("Error al escribir fichero");
        } catch (ClassNotFoundException e) {
            System.out.println("CLASE ERRONEA");
        }
    }
}
