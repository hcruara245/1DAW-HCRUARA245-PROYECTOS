package Fest1;

import java.time.LocalDate;

public class Festival {
    private int numArtistas;
    private String lugar;
    private LocalDate fechaFestival;
    private static String nombrePromotor = "SONY_MUSIC";
    private static int contadorConcierto = 1;
    private Artista[] artistas;
    private String idConcierto;
    private int aforoPista;
    private int aforoGrada;
    private int aforoVIP;
    private int contadorArtistas;
    /*Creo un contador de artistas útil para otros métodos que aumenta al añadir un artista al festival*/

    /*Creo un constructor al que se le pasa como parametros el numero de artístas, el lugar, los 3 aforos y la hora,
    * ya que el nombre del promotor es para todos, el contador es estatico y se asigna solo al idConcierto y por último
    * El array se inicializa con el tamaño que se le pase como numero de artistas*/
    public Festival(int numArtistas, String lugar, LocalDate fechaFestival, int aforoGrada, int aforoPista, int aforoVIP) {
        if (numArtistas > 10){
            System.out.println("ERROR: No puede haber más de 10 artistas");
        }
        else {
            this.numArtistas = numArtistas;
            this.lugar = lugar;
            this.fechaFestival = fechaFestival;
            this.aforoGrada = aforoGrada;
            this.aforoVIP = aforoVIP;
            this.aforoPista = aforoPista;
            this.idConcierto = "FEST_" + contadorConcierto;
            contadorConcierto++;
            this.artistas = new Artista[numArtistas];
        }
    }

    /*En el segundo constructor se le pasa como parametros el lugar y la fecha, y con esto llamo al otro constructor
    * para que ponga los parametros automaticamente*/
    public Festival(String lugar, LocalDate fechaFestival){
        this(5,lugar,fechaFestival,100,100,100);
    }


    /*En esta función he creado un switch para que haga diferentes cosas en función del parametro del tipo de entrada
    * primero tiene un booleano predeterminado a false y se pondrá true si se puede comprar, al final del código lo
    * devuelve*/
    public boolean comprarEntradas(int numEntradas, TipoEntrada tipo){
        boolean comprado = false;
        switch (tipo){
            case VIP:
                    if (numEntradas <= aforoVIP){
                        this.aforoVIP -= numEntradas;
                        comprado = true;
                    }
                break;
            case GRADA:
                if (numEntradas <= aforoGrada){
                    this.aforoGrada -= numEntradas;
                    comprado = true;
                }
                break;
            case PISTA:
                if (numEntradas <= aforoPista){
                    this.aforoPista -= numEntradas;
                    comprado = true;
                }
                break;
        }
        return comprado;
    }

    void mostrarDisponibilidad(){
        System.out.println("AFORO GRADA: " + getAforoGrada() + " AFORO PISTA: " + getAforoPista() + " AFORO VIP: " + getAforoVIP());
    }

    boolean confirmarArtista(Artista artista){
        boolean confirmado = false;

        confirmado = confirmarArtista(artista, 0);

        return confirmado;
    }


    boolean confirmarArtista(Artista artista, int orden){
        boolean confirmado = artistaConfirmado(artista);

        /*Controlo que el orden no sea mayor que el tamaño, para que no de error y además para que en el bucle
        no se pueda pasar del tamaño del array*/
        if (orden > this.artistas.length){
            System.out.println("ERROR: No se puede añadir en ese orden");
        }
        /*Comprueba si esta confirmado previamente, si no lo está lo añade*/
        else if (!confirmado){
            if (this.artistas[orden] == null){
                this.artistas[orden] = artista;
                confirmado = true;
                contadorArtistas++;
                System.out.println("CONFIRMADO, POSICIÓN: " + orden);
            }
            else{
                for (int i = orden; i < this.artistas.length; i++){
                    if (this.artistas[i] == null){
                        this.artistas[i] = artista;
                        System.out.println("CONFIRMADO, POSICIÓN: " + i);
                        confirmado = true;
                        contadorArtistas++;
                        i = this.artistas.length - 1;
                        /*La línea de arriba es para que se salga inmediatamente del bucle una vez asigne el artista*/
                    }
                }
            }
        }
        return confirmado;
    }

    public boolean artistaConfirmado(Artista artista){
        boolean confirmado = false;

        /*Comprueba que el artista no esté repetido*/
        for (int i = 0; i < this.artistas.length;i++){
            if (artistas[i] != null && artistas[i].getNIF().equals(artista.getNIF())){
                confirmado = true;
            }
        }
        return confirmado;
    }

    void mostrarCartelFestival(){
        System.out.println("Van a participar: " + this.contadorArtistas + " artistas");
        System.out.println("En: " + this.lugar);
        System.out.println("El día: " + this.fechaFestival);
        System.out.println("Promocionado por: " + Festival.nombrePromotor);
        System.out.println("ARTISTAS: ");
        for (int i = 0; i < artistas.length; i++){
            if(artistas[i] != null){
                System.out.println(artistas[i].getNombre());
                System.out.println(artistas[i].getDiscografía());
                System.out.println("ACTUA EN LA POSICIÓN: " + (i + 1));
                boolean grupo = artistas[i].isGrupo();
                if (grupo){
                    System.out.println("ES UN GRUPO");
                    System.out.println("************");
                }
                else {
                    System.out.println("ES SOLISTA");
                    System.out.println("************");
                }
            }
        }
    }

    void mostrarCartelFestival(String discografia){
        System.out.println("Van a participar: " + this.contadorArtistas + " artistas");
        System.out.println("En: " + this.lugar);
        System.out.println("El día: " + this.fechaFestival);
        System.out.println("Promocionado por: " + Festival.nombrePromotor);
        System.out.println("ARTISTAS DE LA DISCOGRAFÍA " + discografia + " :");
        for (int i = 0; i < artistas.length; i++){
            System.out.println("************");
            if(artistas[i] != null && artistas[i].getDiscografía().trim().toUpperCase().equals(discografia.trim().toUpperCase())){
                System.out.println(artistas[i].getNombre());
                System.out.println("ACTUA EN LA POSICIÓN: " + (i + 1));
                boolean grupo = artistas[i].isGrupo();
                if (grupo){
                    System.out.println("ES UN GRUPO");
                }
                else {
                    System.out.println("ES SOLISTA");
                }
            }
            System.out.println("************");
        }
    }

    /*He creado un entero que tiene como resultado la resta entre los dos dias del año de los dos localdate*/
    void mostrarDiasRestantes(){
        int diasRestantes;
        diasRestantes = (this.fechaFestival.getDayOfYear() - LocalDate.now().getDayOfYear());
        if (diasRestantes > 0){
            System.out.println("El festival " + Festival.nombrePromotor + " se celebrará el "
            + this.fechaFestival.getDayOfMonth() + " de " + this.fechaFestival.getMonth() + " con lo que faltan "
            + diasRestantes + " días restantes para su comienzo");
        }
        else {
            System.out.println("El festival ya ha pasado");
        }
    }

    public int getAforoPista() {
        return aforoPista;
    }

    public int getAforoGrada() {
        return aforoGrada;
    }

    public int getAforoVIP() {
        return aforoVIP;
    }

    public int getContadorArtistas() {
        return contadorArtistas;
    }

    public Artista[] getArtistas() {
        return artistas;
    }
}
