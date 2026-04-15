package ejercicios_presentacion.examen_subida_notas;

public class Main {
    public static void main(String[] args) {
        /*
        MI MAIN PERSONAL DE LAS PRUEBAS
        Frase frase = new Frase();
        frase.estadoFrase();
        frase.insertarPalabra("HOLA");
        frase.estadoFrase();
        frase.insertarPalabra("ME");
        frase.insertarPalabra("LLAMO");
        frase.insertarPalabra("HUGO");
        frase.estadoFrase();
        frase.obtenerPalabraMasLarga();
        frase.obtenerPalabraMasCorta();
        frase.imprimirFrase();
        System.out.println("\n");
        frase.imprimirFraseInvertida();

        frase.eliminarPalabra("HUGO");
        System.out.println("\n");
        frase.imprimirFrase();

        Frase frase2 = new Frase(15);
        frase2.insertarPalabra("ESTERNOCLEIDOMASTOIDEO");

        int palabramaslarga = obtenerFraseConPalabraMasLarga(frase,frase2);
        System.out.println(palabramaslarga);
        */

//        1. PROBAR CONSTRUCTORES E ID ÚNICO
        Frase f1 = new Frase(5);
        Frase f2 = new Frase();
        f2.insertarPalabra("PALABRAMUYLARGA");
        f2.insertarPalabra("C");

//        2. PRUEBAS DE INSERCCIÓN
        System.out.println("--- PRUEBAS DE INSERCCIÓN ---");
        f1.insertarPalabra("Hola");
        f1.insertarPalabra("me");
        f1.insertarPalabra("llamo");
        f1.insertarPalabra("Victor");
        f1.insertarPalabra("Rodríguez");

        System.out.println("La palabra más larga está contenida en la frase: " + obtenerFraseConPalabraMasLarga(f1,f2));
    }

    public static int obtenerFraseConPalabraMasLarga(Frase f1, Frase f2) {
        int res = 0;

        String palabra1 = f1.obtenerPalabraMasLarga();
        String palabra2 = f2.obtenerPalabraMasLarga();

        if (palabra1.length() > palabra2.length()) {
            res = f1.getId_frase();
        }
        else {
            res = f2.getId_frase();
        }

        return res;
    }
}
