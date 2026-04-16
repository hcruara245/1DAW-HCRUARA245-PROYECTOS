package ejercicios_presentacion.Genericos.ej12_2y3;

public class ej12_2 {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>();
        c.insertarAlPrincipio(39);
        c.insertarAlPrincipio(67);
        c.insertarAlPrincipio(65);
        c.insertarAlPrincipio(63);
        c.insertarAlFinal(999);

        System.out.println(c);

        Contenedor<String> c2 = new Contenedor<>();
        c2.insertarAlPrincipio("b");
        c2.insertarAlPrincipio("c");
        c2.insertarAlPrincipio("a");
        c2.insertarAlFinal("...");
        c2.insertarAlFinal("z");
        System.out.println(c2);

        System.out.println(c.extraerDelPrincipio());
        System.out.println(c.extraerDelPrincipio());

        System.out.println(c2.extraerDelPrincipio());

        System.out.println(c.extraerDelFinal());
        System.out.println(c2.extraerDelFinal());

        System.out.println(c);
        System.out.println(c2);

        c.ordenarTabla();
        System.out.println(c);
        c2.ordenarTabla();
        System.out.println(c2);

        Contenedor<Ejemplo>  c3 = new Contenedor<>();
        Ejemplo e = new Ejemplo("aaaa");
        Ejemplo e1 = new Ejemplo("EEEEE");
        Ejemplo e2 = new Ejemplo("HHHHH");

        c3.insertarAlPrincipio(e);
        c3.insertarAlFinal(e1);
        c3.insertarAlPrincipio(e2);

        c3.ordenarTabla();
        System.out.println(c3);

        System.out.println("\n=================== \n");
        Contenedor contenedorPila = new Contenedor();
        contenedorPila.apilar();
        contenedorPila.vaciar();
    }
}
