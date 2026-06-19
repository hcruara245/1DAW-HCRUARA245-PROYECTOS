package Subida_de_notas_2526.Parking;

public class Parking {
    private Coche coches[];
    private Motocicleta motocicletas[];

    public Parking() {
        this.coches = new Coche[30];
        this.motocicletas = new Motocicleta[20];
    }

    boolean aparcar(Aparcable vehiculo){
        boolean isAparcado = false;

        if (vehiculo instanceof Coche){
            boolean hueco = false;
            Coche coche = (Coche) vehiculo;
            for(int i = 0; i < coches.length && !hueco; i++){
                if (coches[i] == null){
                    hueco = true;
                    coches[i] = coche;
                    isAparcado = true;
                    coche.aparcar();
                    System.out.println("COCHE APARCADO");
                }
            }
        }
        else if (vehiculo instanceof Motocicleta){
            boolean hueco = false;
            Motocicleta motocicleta = (Motocicleta) vehiculo;
            for(int i = 0; i < motocicletas.length && !hueco; i++){
                if (motocicletas[i] == null){
                    hueco = true;
                    motocicletas[i] = motocicleta;
                    isAparcado = true;
                    motocicleta.aparcar();
                    System.out.println("MOTOCICLETA APARCADA");
                }
            }
        }
        else {
            System.out.println("Error: No es ningun vehículo aparcable");
        }

        return isAparcado;
    }

    void mostrarPlazasLibres(){
        int plazasLibresCoche = 0;
        int plazasLibresMotocicleta = 0;

        for (int i = 0; i < coches.length; i++){
            if (coches[i] == null){
                plazasLibresCoche++;
            }
        }

        for (int i = 0; i < motocicletas.length; i++){
            if (motocicletas[i] == null){
                plazasLibresMotocicleta++;
            }
        }

        if (plazasLibresCoche == 0 &&  plazasLibresMotocicleta == 0){
            System.out.println("El parking está completo");
        }
        else {
            System.out.println("El parking tiene " + plazasLibresCoche + " plazas libres para coches y " + plazasLibresMotocicleta
            + " para motocicletas");
        }
    }
}
