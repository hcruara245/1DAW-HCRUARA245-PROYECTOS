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

    //ORDENAR CONTACTOS POR NOMBRE, PARA HACERLO CON TELEFONOS
    //HAY QUE PASARLE OTRO PARAMETRO Y UNA CONDICIÓN, EN FUNCIÓN
    //A EL PARAMETRO HACE UNA COSA U OTRA

    void ordenar_agenda(Agenda agenda){
        Arrays.sort(agenda.contactos, (c1, c2) -> c1.nombre.compareTo(c2.nombre));

//        Arrays.sort(agenda.contactos, (c1, c2) -> c1.telefono.compareTo(c2.telefono));
//
//        Creo una variable que va a ir aumentando cada vez que ordene un contacto
//        int contacto_orden = 0;
//        Creo un nuevo contacto temporal para guardar el contacto
//        Contacto c = new Contacto("", "");
//
//        for (int i = 0 ; i < agenda.contactos.length - 1; i++){
//
//            if (contactos[i].nombre.compareTo(contactos[i+1].nombre) > 0){
//                c = contactos[i];
//                contactos[contacto_orden] = contactos[i];
//                contactos[i] = c;
//                contacto_orden++;
//            }
//        }

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