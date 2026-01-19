package Ejercicio6;

import java.util.Scanner;

public class Texto {
    private String cadena;
    private int max_caracteres;
    public String fecha_creado;

    public Texto(String cadena, int max_caracteres) {
        if (cadena.length() > max_caracteres){
            System.out.println("Error: La cadena es mas larga que el máximo indicado");
        }
        else {
            this.cadena = cadena;
            this.max_caracteres = max_caracteres;
            this.fecha_creado = "";
            System.out.println("La cadena ha sido creada correctamente");
        }
    }

    public void anadir_caracter(char caracter_a_anadir){
        Scanner sc = new Scanner(System.in);
        if (cadena.length() + 1 > max_caracteres){
            System.out.println("Error: No se puede añadir un carácter porque supera el máximo indicado");
        }
        else {
            String eleccion = "";
            System.out.println("Donde quieres añadir el caracter (principio o final)");
            eleccion = sc.nextLine();
            if (eleccion.equals("principio") || eleccion.equals("Principio") ){
                cadena = caracter_a_anadir + cadena;
                System.out.println("Caracter añadido");
            }
            else if (eleccion.equals("final") || eleccion.equals("Final") ){
                cadena = cadena + caracter_a_anadir;
                System.out.println("Caracter añadido");
            }
            else {
                System.out.println("Error: La elección no es correcta");
            }
        }
    }

    public void anadir_cadena(String cadena_a_anadir){
        Scanner sc = new Scanner(System.in);
        if (cadena.length() + cadena_a_anadir.length() > max_caracteres){
            System.out.println("Error: No se puede añadir la cadena porque supera el máximo indicado");
        }
        else {
            String eleccion = "";
            System.out.println("Donde quieres añadir el caracter (principio o final)");
            eleccion = sc.nextLine();
            if (eleccion.equals("principio") || eleccion.equals("Principio") ){
                cadena = cadena_a_anadir + cadena;
                System.out.println("Cadena añadida");
            }
            else if (eleccion.equals("final") || eleccion.equals("Final") ){
                cadena = cadena + cadena_a_anadir;
                System.out.println("Cadena añadida");
            }
            else {
                System.out.println("Error: La elección no es correcta");
            }
        }
    }

    public int contar_vocales(){
        int vocales = 0;
        String copia_cadena = this.cadena;
        copia_cadena = copia_cadena.toUpperCase();
        for (int i = 0; i < copia_cadena.length(); i++){
            if (copia_cadena.charAt(i) == 'A' || copia_cadena.charAt(i) == 'E'
                    || copia_cadena.charAt(i) == 'I' || copia_cadena.charAt(i) == 'O'
                    || copia_cadena.charAt(i) == 'U'){
                vocales++;
            }
        }
        return vocales;
    }

    public void mostrar_info(){
        System.out.println("Cadena: " + this.cadena);
        System.out.println("Máximo de caracteres: " + this.max_caracteres);
        System.out.println("Fecha de creación: " + this.fecha_creado);
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getMax_caracteres() {
        return max_caracteres;
    }

    public void setMax_caracteres(int max_caracteres) {
        if (this.cadena.length() > max_caracteres){
            System.out.println("Error: La cadena es mas larga que el máximo indicado");
        }
        else {
            this.max_caracteres = max_caracteres;
            System.out.println("Máximo de caracteres cambiado");
        }
    }

    public String getFecha_creado() {
        return fecha_creado;
    }

    public void setFecha_creado(String fecha_creado) {
        this.fecha_creado = fecha_creado;
    }
}
