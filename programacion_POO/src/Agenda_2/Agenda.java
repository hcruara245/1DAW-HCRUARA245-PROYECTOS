package Agenda_2;

import java.util.Arrays;

public class Agenda {
    Contacto[] contactos;
    String nombre_agenda;

    Agenda(String nombre_agenda){
        this.contactos = new Contacto[0];
        this.nombre_agenda = nombre_agenda;
    }

    void anyadir_contacto(Contacto c){
        boolean existe_contacto = comprobarContacto(contactos, c);

        if (!existe_contacto) {
            contactos = Arrays.copyOf(contactos, contactos.length + 1);
            contactos[contactos.length - 1] = c;
            System.out.println("Contacto añadido");
        }
        else {
            System.out.println("Ya existe este contacto");
        }
    }

    void buscar_contacto(String nombre){
        boolean encontrado = false;

        if(!encontrado) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i].nombre.equals(nombre)) {
                    System.out.println(contactos[i].nombre + " | " + contactos[i].telefono);
                    encontrado = true;
                } else {
                    System.out.println("Contacto no encontrado");
                }
            }
        }
    }

    void mostrar_agenda(Agenda agenda) {
        ordenar_agenda(agenda);
        for (int i = 0; i < agenda.contactos.length; i++) {
            System.out.println(agenda.contactos[i].nombre + " | " + agenda.contactos[i].telefono);
        }
    }

    void ordenar_agenda(Agenda agenda){
        Arrays.sort(agenda.contactos, (c1, c2) -> c1.nombre.compareTo(c2.nombre));
    }

     boolean comprobarContacto(Contacto[] contactos, Contacto c){
        boolean contacto_existe = false;

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].nombre.equals(c.nombre)) {
                contacto_existe = true;
            }
            else {
                contacto_existe = false;
            }
        }
        return contacto_existe;
    }
}
