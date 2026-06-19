package Subida_de_notas_2526.CajasSolidarias;

import java.util.*;

enum Tipo {Peque,Media,Grande}

public class CajaSolidaria {
    private Tipo tipo;
    private List<Producto> productos;
    private double peso;

    public CajaSolidaria(String tipo) {
        switch (tipo) {
            case "P":
                this.tipo = Tipo.Peque;
                this.peso = 10;
                productos = new ArrayList<>();
                break;
            case "G":
                this.tipo = Tipo.Grande;
                this.peso = 50;
                productos = new ArrayList<>();
                break;
            // No hace falta comprobar la M ya que va dentro de la default
            default:
                this.tipo = Tipo.Media;
                productos = new ArrayList<>();
                this.peso = 20;
                break;
        }
    }

    boolean anadirProducto(Producto p){
        boolean res = false;

        // Obtengo el peso actual de todos los productos juntos de la caja en caso de que hayan
        Optional<Double> pesoTotal = productos.stream()
                .map(Producto::getPeso)
                .reduce(Double::sum);

        // Si hay peso, lo consigo, y lo sumo al peso del producto, y si es mayor al peso máximo de la caja lanzo el mensaje
        // de error.
        if (pesoTotal.isPresent() && !(p.getPeso() > this.peso) || pesoTotal.isEmpty()) {
            if (productos.contains(p)) {
                Producto aux = p;
                productos.remove(p);

                if (!productos.contains(p)) {
                    productos.add(aux);
                    productos.add(p);
                    res = true;
                } else {
                    // Si sigue conteniendo el producto simplemente lo vuelvo a añadir
                    productos.add(p);
                    System.out.println("No se puede añadir el producto " + p + " porque ya está dos veces en la caja.");
                }
            }
            else {
                if (!(p.getPeso() > this.peso)) {
                    productos.add(p);
                }
            }
        }
        else {
            System.out.println("No se puede añadir el producto " + p + " porque la caja supera el maximo de Kgs permitidos.");
        }

        return res;
    }

    Producto retirarProducto(String nomProducto){
        Producto prodfinal = null;

        for (Producto aux : productos) {
            if (aux.getNombre().equals(nomProducto)) {
                prodfinal = aux;
                productos.remove(aux);
            }
        }

        return  prodfinal;
    }

    int consultarCantidadProducto(String nomProducto){
        int cantidadProducto = 0;

        for (Producto producto : productos) {
            if (producto.getNombre().equals(nomProducto)) {
                cantidadProducto++;
            }
        }

        return cantidadProducto;
    }

    Set buscarProductos(String cad){
        Set<Producto> res = new LinkedHashSet<>();

        for (Producto aux : productos) {
            if (aux.getNombre().contains(cad)) {
                res.add(aux);
            }
        }

        return res;
    }

    void mostrarEstadoCaja(){
        Optional<Double> pesoTotal = productos.stream()
                .map(Producto::getPeso)
                .reduce(Double::sum);

        int cantidadproductos = productos.size();

        System.out.println("La caja tiene un total de " + cantidadproductos + " con un peso total de " + pesoTotal.get() + " kgs");
    }

    // Yo he hecho el peso con un double
    void consultarProductosPesados(double pesoMinimo){
        productos.stream()
                .filter(producto -> producto.getPeso() > pesoMinimo)
                .forEach(System.out::println);
    }

    void listarProductos(){
        productos.stream()
                .sorted()
                .forEach(System.out::println);
    }

    void listarProductosPorPeso(){
        productos.stream()
                .sorted(Comparator.comparing(Producto::getPeso))
                .forEach(System.out::println);
    }
}