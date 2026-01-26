package Examen_2425.CatalogoDePeliculas;

public class Pelicula {
    /*Productora,Título,Director, Año de lanzamiento y género.
    * Añado estos atributos para la clase película*/

    private static String productora;
    private String titulo;
    private String director;
    private int anyoLanzamiento;
    private String genero;

    /*Para crear una película se debe indicar obligatoriamente el título, el año de lanzamiento y el
    género, y opcionalmente el director. Si no se indica éste, se dejará la cadena vacía.*/

    public Pelicula(String titulo, int anyoLanzamiento, String genero, String director) {
        productora = "WARNER";
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.genero = genero;
        this.director = director;

        if (this.titulo.length() > 30){
            this.titulo = this.titulo.substring(0, 30);
        } else if (anyoLanzamiento < 1990) {
            this.anyoLanzamiento = 1990;
        }
    }

    public Pelicula(String titulo, int anyoLanzamiento, String genero){
        this(titulo, anyoLanzamiento, genero, "");
    }

    public void addGenero(String genero){
        boolean generoExistente = existeGenero(this.genero, genero);

        /*LLAMO A LA FUNCIÓN Y DEPENDIENDO DEl RESULTADO HACE UNA COSA U OTRA*/
        if (generoExistente){
            System.out.println("Ya tiene ese genero");
        }
        else {
            if (this.genero.trim().length() == 0){
                this.genero = genero;
            }
            else {
                this.genero = this.genero + "/" + genero;
            }
        }
    }

    public boolean existeGenero(String genero, String generoAnyadir){
        boolean existe = false;

        String[] generos = genero.split("/");
        String[] generosAnyadir = generoAnyadir.split("/");

        /*CREO DOS ARRAYS CON EL GENERO A AÑADIR Y OTRO PARA EL GENERO O LOS GENEROS QUE SE VAN A AÑADIR
        * PARA COMPARARLOS
        *
        * CON EL BUCLE LO QUE SE HACE ES FIJAR LA POSICIÓN EN EL ARRAY DE LOS GENEROS A AÑADIR
        * Y IR COMPARANDO CON LAS POSICIONES EN EL ARRAY DE GENEROS YA EXISTENTE
        * SE COMPARA LA PALABRA CON LOS ESPACIOS YA QUITADOS, EN MAYUSCULAS PARA QUE NO TENGA QUE DISTINGUIR ENTRE
        * MAYÚSCULAS Y MINÚSCULAS Y LO COMPARA CON LA PALABRA FIJADA*/
        for (int i = 0; i < generosAnyadir.length; i++) {
            for (int j = 0; j < generos.length; j++) {
                if (generos[j].trim().toUpperCase().equals(generosAnyadir[i].trim().toUpperCase())) {
                    existe = true;
                }
            }
        }

        return existe;
    }

    public static String getProductora() {
        return productora;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public String getDirector() {
        return director;
    }

    public String getTitulo() {
        return titulo;
    }


}
