import misclases.Contacto;

public class Agenda {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("HUGO CRUZ ARANDA","92756969G");
        System.out.println("==================");
        System.out.println("PRUEBA VALIDAR DNI");
        System.out.println("==================");
        String string = contacto.toString();
        System.out.println(string);
        System.out.println("Tras validar el DNI el resultado es: " + contacto.esValido());
    }
}
