package Agenda_2;

public class pruebas {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda("AGENDA 1");

        Contacto contacto1 = new Contacto("Hugo", "6");
        Contacto contacto2 = new Contacto("Alvaro", "67");
        Contacto contacto3 = new Contacto("Bartolomeo", "999");
        Contacto contacto4 = new Contacto("Zarcort games", "69");

        agenda1.anyadir_contacto(contacto1);
        agenda1.anyadir_contacto(contacto2);
        agenda1.anyadir_contacto(contacto3);
        agenda1.anyadir_contacto(contacto4);

        agenda1.ordenar_agenda(agenda1);
    }
}
