package Subida_de_notas_2526.Parking;

public class PruebaParking {
    public static void main(String[] args) {
        Parking parking = new Parking();

        Coche mercedes = new Coche("Mercedes","GLE-300",2020,"2058 JGA",5,false);
        Coche astonmartin = new Coche("Aston Martin", "Vantage V12",2022, "5814 VDZ",3,false);

        Camion volvo = new Camion("Volvo","Truck 500", 2018,"1198 LKE",15000);

        Motocicleta ducati = new Motocicleta("Ducati", "Panigale V2S",2021,"4459 XBN",false,false);
        Motocicleta honda = new Motocicleta("Honda", "CB-400F",2014,"8578 HCV",true,true);

        parking.aparcar(mercedes);

        parking.mostrarPlazasLibres();

        parking.aparcar(ducati);
        parking.aparcar(honda);

        parking.mostrarPlazasLibres();

        mercedes.mostrarDetalles();
        astonmartin.mostrarDetalles();

        volvo.mostrarDetalles();

        ducati.mostrarDetalles();
        honda.mostrarDetalles();
    }
}
