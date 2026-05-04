package ejercicios_presentacion.act13_1;

@FunctionalInterface
public interface Saludador<T> {
    String saludar(T t);
}
