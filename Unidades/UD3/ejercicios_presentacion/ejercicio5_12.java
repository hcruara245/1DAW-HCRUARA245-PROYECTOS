package ejercicios_presentacion;

public class ejercicio5_12 {
    public static void main(String[] args) {
        int [][]tablaBidimensional = new int [5][5];
        
        for(int i = 0;i < tablaBidimensional.length;i++){
            for(int j = 0;j < tablaBidimensional[i].length;j++){
                tablaBidimensional[i][j] = 10 * i + j;
            }
        }
        
        for(int i = 0;i < tablaBidimensional.length;i++){
            for(int j = 0;j < tablaBidimensional[i].length;j++){
                System.out.print("| " +tablaBidimensional[i][j] + " |");
            }
            System.out.println();
        }
    } 
}
