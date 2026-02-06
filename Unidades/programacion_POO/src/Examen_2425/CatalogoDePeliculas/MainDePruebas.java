package Examen_2425.CatalogoDePeliculas;

public class MainDePruebas {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula("Formula1",2025,"Acción/Carreras","Cristiano Ronaldo");
        Pelicula peli2 = new Pelicula("Gran Turismo",2023,"Acción/Carreras");
        /*CREACIÓN DE PELICULAS*/

        System.out.println("*** PRUEBA 1 ***");
        peli1.addGenero("Carreras");
        peli1.addGenero("Deportes");
        /*INTENTO AÑADIR GENERO REPETIDO Y DA ERROR PERO SI NO ESTÁ REPETIDO NO DA PROBLEMAS*/

        System.out.println(peli1.getGenero());

        System.out.println("*** PRUEBA 2 ***");
        /*INTENTO CREAR PELICULAS CON DIFERENTES FECHAS DE LANZAMIENTO*/
        Pelicula peli3 = new Pelicula("Victor el Asesino", 1898,"Terror");
        System.out.println(peli3.getAnyoLanzamiento());
        Pelicula peli4 = new Pelicula("El Padrino", 1972, "Crimen/Drama");
        peli4.addGenero("Crimen/Drama");
        /*INTENTO BUGEAR AL PROGRAMA AÑADIENDO DOS GENEROS EXACTAMENTE IGUALES PARA DUPLICAR LOS GENEROS*/
        System.out.println(peli4.getGenero());
        /*CONSEGUIR LA PRODUCTORA DE TODAS LAS PELICULAS*/
        System.out.println(Pelicula.getProductora());

        System.out.println("*** PRUEBA 3 ***");
        Pelicula peli5 = new Pelicula("Formula2",2028,"", "Cristiano Messinaldo");
        peli5.addGenero("ACCION");
        System.out.println(peli5.getGenero());
        Pelicula peli6 = new Pelicula("EJEMPLOPELICULA",1678," ");
        peli6.addGenero("ACCION");
        System.out.println(peli6.getGenero());
        System.out.println(peli6.getAnyoLanzamiento());


        System.out.println("*** PRUEBA 4 ***");
        System.out.println();
        Catalogo catalogo = new Catalogo();
        catalogo.agregarPelicula(peli1);
        catalogo.agregarPelicula(peli2);
        catalogo.agregarPelicula(peli3);
        catalogo.agregarPelicula(peli4);
        catalogo.agregarPelicula(peli5);
        catalogo.agregarPelicula(peli6);
        catalogo.listarPeliculas();

        System.out.println("*** PRUEBA 5 ***");
        /*BUSQUEDA POR DIRECTOR*/
        Pelicula[] consultapeliculas = catalogo.buscarPeliculas("Cristiano","DIR");
        for (int i = 0; i < consultapeliculas.length; i++){
            System.out.println(consultapeliculas[i].getTitulo());
        }
        System.out.println();

        System.out.println("*** PRUEBA 6 ***");
        /*BUSQUEDA POR TÍTULO*/
        Pelicula[] consultaPorTitulos = catalogo.buscarPeliculas("Gra","TIT");
        for (int i = 0; i < consultaPorTitulos.length; i++){
            System.out.println(consultaPorTitulos[i].getTitulo());
        }
        System.out.println();

        System.out.println("*** PRUEBA 7 ***");
        /*BUSQUEDA POR GENERO*/
        Pelicula[] consultaPorGenero = catalogo.buscarPeliculas("Carreras","GEN");
        for (int i = 0; i < consultaPorGenero.length; i++){
            System.out.println(consultaPorGenero[i].getTitulo());
        }
        System.out.println();

        System.out.println("*** PRUEBA 8 ***");
        /*BUSQUEDA POR AÑO*/
        Pelicula[] consultaPorAnyo = catalogo.buscarPeliculas("2023","AÑO");
        for (int i = 0; i < consultaPorAnyo.length; i++){
            System.out.println(consultaPorAnyo[i].getTitulo());
        }
        System.out.println();
    }
}
