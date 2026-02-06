package Ejercicio6;

public class MainPruebas {
    public static void main(String[] args) {
        Texto txt1 = new Texto("Hola me llamo Hug", 70);
        txt1.anadir_caracter('o');
        txt1.anadir_caracter('o');
        txt1.anadir_caracter('o');
        String texto = "";
        texto = txt1.getCadena();
        System.out.println(texto);
        txt1.anadir_cadena(" Cruz Aranda");
        texto = txt1.getCadena();
        System.out.println(texto);
        System.out.println(txt1.contar_vocales());
        txt1.setFecha_creado("19/01/2026 - 11:17");
        txt1.mostrar_info();
        txt1.setMax_caracteres(12);
        txt1.mostrar_info();
    }
}
