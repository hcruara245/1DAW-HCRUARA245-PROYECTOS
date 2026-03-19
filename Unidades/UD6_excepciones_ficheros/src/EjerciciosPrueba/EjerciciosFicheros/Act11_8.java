package EjerciciosPrueba.EjerciciosFicheros;

import java.io.*;

public class Act11_8 {
    public static void main(String[] args) {
        guardarSocios();
        leerSocios();
    }

    public static void guardarSocios(){
        Socio[] socios = new Socio[10];
        File file = new File("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\socios.dat");
        socios[0] = new Socio("Juan Palmilla",1);
        socios[1] = new Socio("Alvaro Victorio Palmilla",67);
        socios[2] = new Socio("Mauro Contador de Palmillas",67);
        socios[3] = new Socio("Fernando Alonso Diaz",33);
        socios[4] = new Socio("Lewis Nigga",44);
        socios[5] = new Socio("Ishow my DIH",99);
        socios[6] = new Socio("ADOLFO",100);
        socios[7] = new Socio("Lamine Pañal",457);
        socios[8] = new Socio("Rapinha",6987);
        socios[9] = new Socio("La sexta",15);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Socio socio : socios){
                oos.writeObject(socio);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR CON ARCHIVO");
        } catch (IOException e) {
            System.out.println("ERROR DE I/O");
        }
    }

    public static void leerSocios(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\1DAW-hcruara245\\Documents\\1DAW-HCRUARA245-PROYECTOS\\Files\\socios.dat"))) {
            while (true){
                Socio socio = (Socio) ois.readObject();
                System.out.println(socio);
            }
        }catch (EOFException e){
            System.out.println("FIN DEL ARCHIVO");
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR CON ARCHIVO");
        } catch (IOException e) {
            System.out.println("ERROR DE I/O");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR DE CLASE");
        }
    }
}
