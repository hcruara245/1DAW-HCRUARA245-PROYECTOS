import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Alumno[] alumnos = guardarAlumnos();
            guardarAprobados(alumnos);
            guardarAlumnosBinario(alumnos);
            mostrarDatosClase();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("CLASE NO ENCONTRADA");
        }
    }

    public static Alumno[] guardarAlumnos() throws IOException {
        Alumno[] alumnos = new Alumno[0];
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\1DAW-HCRUARA245-PROYECTOS\\ejercicios_adicionales\\GestionDeAlumnos\\src\\alumnos.txt"))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                String[] partes = linea.split(",");
                double nota = Double.parseDouble(partes[2]);
                Alumno a = new Alumno(partes[0], partes[1], nota);
                alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
                alumnos[alumnos.length - 1] = a;
            }
        }

        return alumnos;
    }

    public static void guardarAprobados(Alumno[] alumnos) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\Documents\\1DAW-HCRUARA245-PROYECTOS\\ejercicios_adicionales\\GestionDeAlumnos\\src\\aprobados.txt"))) {
            for (Alumno alumno : alumnos) {
                if (alumno != null && alumno.getNota() >= 5) {
                    bw.write(alumno.toString());
                    bw.newLine();
                }
            }
        }
    }

    public static void guardarAlumnosBinario(Alumno[] alumnos) throws IOException {
        File file = new File("C:\\Users\\Usuario\\Documents\\1DAW-HCRUARA245-PROYECTOS\\ejercicios_adicionales\\GestionDeAlumnos\\src\\alumnos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        for (Alumno alumno : alumnos) {
            oos.writeObject(alumno);
        }
    }

    public static void mostrarDatosClase() throws IOException, ClassNotFoundException {
        double media = 0;
        int contador = 0;
        double notaMasAlta = 0;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Usuario\\Documents\\1DAW-HCRUARA245-PROYECTOS\\ejercicios_adicionales\\GestionDeAlumnos\\src\\alumnos.dat"))){
            while (true){
                Alumno alumno = (Alumno) ois.readObject();
                if (alumno != null){
                    System.out.println(alumno);
                    media += alumno.getNota();
                    contador++;
                    if (alumno.getNota() > notaMasAlta){
                        notaMasAlta = alumno.getNota();
                    }
                }
            }
        }catch (EOFException e) {
            System.out.println("FIN DEL ARCHIVO");
            System.out.println("NOTA MEDIA: " + (media/contador));
            System.out.println("NOTA MAS ALTA: " + notaMasAlta);
        }
    }
}