package Fest1;

import java.time.LocalDate;
import java.util.Arrays;

public class ClasePruebaFestivales {
    public static void main(String[] args) {
        /*Main de pruebas creo todos los artistas y Festivales*/
        Festival festival1 = new Festival(7,"Tocina", LocalDate.of(2011,12,14),120,200,140);
        Festival festival2 = new Festival("Los rosales", LocalDate.of(2001,11,10));
        Festival festival3 = new Festival("La mancha", LocalDate.of(2020,5,5));

        Artista art1 = new Artista("Bugs Bunny", "28325612R","La Locura");
        Artista art2 = new Artista("Los Recio","23984754R", "Camarones", LocalDate.of(1999,2,14),true);
        Artista art3 = new Artista("Alvaro Victorio", "32542");
        Artista art4 = new Artista("Victor asesino", "325422445", "El descuartizado");
        Artista art5 = new Artista("Maluma", "32541X42");
        Artista art6 = new Artista("Joaquin", "3254245R2");
        Artista art7 = new Artista("Pedro antonio", "918419X");
        Artista art8 = new Artista("Ozuna", "3254241E");

        festival1.confirmarArtista(art3);
        festival2.confirmarArtista(art1);
        festival2.confirmarArtista(art3);

        Festival[] festivals = new Festival[2];
        festivals[0] = festival2;
        festivals[1] = festival1;
        int aparicionesAlvaroVict = contarFestivalesArtista(art3, festivals);
        System.out.println(aparicionesAlvaroVict);

        festival3.confirmarArtista(art8);
        festival3.confirmarArtista(art7);
        festival3.confirmarArtista(art6);
        festival3.confirmarArtista(art5);
        festival3.confirmarArtista(art4);
        festival3.confirmarArtista(art3);

        festival1.mostrarDisponibilidad();
        festival1.mostrarDiasRestantes();

        festival1.mostrarCartelFestival();
        festival2.mostrarCartelFestival();
        festival3.mostrarCartelFestival();
    }

    public static int contarFestivalesArtista(Artista artista, Festival[] festivales){
        int contadorParticipaciones = 0;

        /*Creo un contador y llamo a otra funcion que tengo creada en la clase festival*/
        for (int i = 0; i < festivales.length; i++){
            if (festivales[i].artistaConfirmado(artista)){
                contadorParticipaciones++;
            }
        }

        return contadorParticipaciones;
    }

    public static Artista[] obtenerArtistasComunes(Festival f1, Festival f2){
        /*Creo tres arrays, el que va a devolver y dos más con los artistas de los dos festivales,
        * Calculo las iteraciones del bucle principal y si son menores a cero lo hace positivo*/
        Artista[] artistasComunes = new Artista[0];
        Artista[] artistasf1 = f1.getArtistas();
        Artista[] artistasf2 = f2.getArtistas();
        int iteracionesBucle = artistasf1.length - artistasf2.length;
        if (iteracionesBucle < 0){
            iteracionesBucle *= -1;
        }
        /*Consigo los NIF y si son iguales exactamente se suma ese cantante al Array*/
        for (int i = 0; i < iteracionesBucle; i++){
            if (artistasf1[i].getNIF().equals(artistasf2[i].getNIF())){
                artistasComunes = Arrays.copyOf(artistasComunes, artistasComunes.length + 1);
                artistasComunes[artistasComunes.length - 1] = artistasf1[i];
            }
        }

        return artistasComunes;
    }
}
