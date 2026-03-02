package ejercicios_presentacion;

public class coercion_5_1 {
    public static void main(String[] args) {
        int tabla[] = new int[10];
        
        for(int i = 0;i < tabla.length;i++){
            System.out.println(tabla[i] = (int) (Math.random() * 100 + 1));
        }
    }
}
