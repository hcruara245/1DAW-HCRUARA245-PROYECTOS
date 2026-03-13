import java.util.ArrayList;

public class EmpresaReparto {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Furgoneta("2913 EXG",2000,1200));
        vehiculos.add(new BicicletaElectrica("9214 PON",600,80,200));
        vehiculos.add(new Furgoneta("6781 GAH",3500,2900));
        vehiculos.add(new BicicletaElectrica("1572 PIA",750,10,125));
        vehiculos.add(new Furgoneta("7291 LEO",1300,0));
        vehiculos.add(new BicicletaElectrica("1234 ABC",290,55,50));

        System.out.println("Cargando vehículos... \n");
        for (Vehiculo v : vehiculos){
            try {
                v.cargar(Math.random() * 1000 + 1);
            }catch (CargaExtendidaException | CargaNegativaException exception){
                System.out.println("Error al cargar vehiculo: CARGA EXCEDIDA");
            }
        }

        System.out.println("\nCargando vehículos con carga negativa(ejemplo)... \n");
        for (Vehiculo v : vehiculos){
            try {
                v.cargar(-250);
            } catch (CargaNegativaException | CargaExtendidaException exception) {
                System.out.println("Error al cargar vehiculo: CARGA NEGATIVA");
            }
        }

        System.out.println("\nVehículos trás carga: \n");
        for (Vehiculo v : vehiculos){
            System.out.println(v.toString());
        }

        for (Vehiculo v : vehiculos){
            if (v instanceof Furgoneta){
                ((Furgoneta) v).setKilometrosRecorridos(Math.random() * 15000 + 1);
            }
            else if (v instanceof BicicletaElectrica){
                ((BicicletaElectrica) v).setNivelBateria((int) (Math.random() * 50 + 1));
            }
        }

        System.out.println("\nRealizando mantenimientos... \n");
        for (Vehiculo v : vehiculos){
            boolean mantenimiento = v.requiereMantenimiento();
            if (mantenimiento){
                v.realizarMantenimiento();
            }
        }

        ArrayList<Furgoneta> furgonetas = new ArrayList<>();
        ArrayList<BicicletaElectrica> bicicletaElectricas = new ArrayList<>();
        for (Vehiculo v : vehiculos){
            if (v instanceof Furgoneta){
                furgonetas.add((Furgoneta) v);
            }
            else if (v instanceof BicicletaElectrica){
                bicicletaElectricas.add((BicicletaElectrica) v);
            }
        }

        System.out.println("\nFurgonetas trás mantenimiento: \n");
        for (Furgoneta f : furgonetas){
            System.out.println(f.toString());;
        }

        System.out.println("\nBicis trás mantenimiento: \n");
        for (BicicletaElectrica bc : bicicletaElectricas){
            System.out.println(bc.toString());;
        }
    }
}
