package ejercicios_presentacion.act13_1;

public class Main {
    public static void main(String[] args) {
        Saludador<String> stringSaludador = nombre -> "¡Hola, " + nombre + ", bienvenido";

        Saludador<Cliente> clienteSaludador = c -> "¡Hola, " + c.getNombre() + ", bienvenido";

        /*Ejemplo de generar saludos primero con string y despues con cliente*/
        System.out.println(stringSaludador.saludar("VICTOR"));

        System.out.println(clienteSaludador.saludar(new Cliente("Victor Losada",33,"9999")));
    }
}
