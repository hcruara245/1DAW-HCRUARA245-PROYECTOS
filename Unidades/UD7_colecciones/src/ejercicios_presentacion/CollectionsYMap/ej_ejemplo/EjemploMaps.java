package ejercicios_presentacion.CollectionsYMap.ej_ejemplo;

import java.util.*;

public class EjemploMaps {
    public static void main(String[] args) {

        // 1. HASHMAP: El más rápido. No garantiza NINGÚN orden.
        Map<String, Double> hashMap = new HashMap<>();

        // 2. LINKEDHASHMAP: Respeta el ORDEN DE INSERCIÓN.
        Map<String, Double> linkedMap = new LinkedHashMap<>();

        // 3. TREEMAP: Ordena las llaves de forma NATURAL (Alfabeto o numérico).
        Map<String, Double> treeMap = new TreeMap<>();

        // --- OPERACIONES BÁSICAS (Funcionan igual en todos) ---

        // .put(K, V) -> Añadir elementos
        llenarMapa(hashMap);
        llenarMapa(linkedMap);
        llenarMapa(treeMap);

        // .get(K) -> Obtener un valor por su llave
        System.out.println("Precio del Pan: " + hashMap.get("Pan"));

        // .containsKey(K) -> Revisar si existe una llave
        if (hashMap.containsKey("Leche")) {
            System.out.println("La leche está en el inventario.");
        }

        // .remove(K) -> Borrar un elemento
        hashMap.remove("Huevos");

        // --- COMPARACIÓN DE ORDEN ---
        System.out.println("\n--- HashMap (Sin orden): " + hashMap.keySet());
        System.out.println("--- LinkedHashMap (Orden inserción): " + linkedMap.keySet());
        System.out.println("--- TreeMap (Orden alfabético): " + treeMap.keySet());

        // --- CÓMO RECORRER UN MAPA ---
        System.out.println("\n--- Recorriendo el inventario (TreeMap) ---");

        // La forma más eficiente y moderna: forEach
        treeMap.forEach((producto, precio) -> {
            System.out.println("Producto: " + producto + " | Precio: $" + precio);
        });

        Map<String, Integer> stock = new HashMap<>();
        stock.put("Manzanas", 10);
        stock.put("Peras", 5);

        // 1. putIfAbsent: Solo añade si la llave NO existe
        // No hará nada porque "Manzanas" ya está
        stock.putIfAbsent("Manzanas", 50);
        stock.putIfAbsent("Plátanos", 20); // Este sí se añade

        // 2. computeIfPresent: Modifica el valor solo si la llave existe
        // Si hay Peras, súmales 10 al stock actual
        stock.computeIfPresent("Peras", (llave, valorActual) -> valorActual + 10);

        // 3. computeIfAbsent: Ideal para inicializar valores complejos
        // Si no hay "Uvas", ponle 1 como valor inicial
        stock.computeIfAbsent("Uvas", llave -> 1);

        // 4. replace: Reemplaza solo si la llave existe (más seguro que put)
        stock.replace("Plátanos", 25);

        // 5. getOrDefault: Evita el NullPointerException
        // Si "Mangos" no existe, nos devuelve 0 en lugar de null
        int cantMangos = stock.getOrDefault("Mangos", 0);
        System.out.println("Cantidad de Mangos: " + cantMangos);

        // 6. replaceAll: Aplica una operación a TODOS los valores
        // Ejemplo: Subir el stock de todo un 10% (bonus)
        stock.replaceAll((k, v) -> v + 5);

        // --- FORMAS DE RECORRER (Iterar) ---

        // A. Por Llave y Valor (La más usada hoy en día)
        System.out.println("\n--- Recorrido con Lambda ---");
        stock.forEach((k, v) -> System.out.println(k + " -> " + v));

        // B. Solo las llaves
        for (String producto : stock.keySet()) {
            System.out.println("Producto: " + producto);
        }

        // C. Solo los valores
        for (Integer cantidad : stock.values()) {
            System.out.println("Stock: " + cantidad);
        }

        // D. Por entrada completa (EntrySet) - Útil si quieres borrar mientras recorres
        for (Map.Entry<String, Integer> entrada : stock.entrySet()) {
            System.out.println(entrada.getKey() + " tiene " + entrada.getValue());
        }

        // 7. Limpiar todo el mapa
        stock.clear();
        System.out.println("\n¿Está vacío?: " + stock.isEmpty());
    }

    private static void llenarMapa(Map<String, Double> mapa) {
        mapa.put("Pan", 1.50);
        mapa.put("Leche", 0.90);
        mapa.put("Manzanas", 2.30);
        mapa.put("Huevos", 3.00);
        mapa.put("Café", 4.50);
    }
}
