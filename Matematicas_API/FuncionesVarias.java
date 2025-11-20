package matematicas;



public class FuncionesVarias {
    //Main para pruebas
    public static void main(String[] args) {
        System.out.println(esCapicua(12321)); //Debe salir true
        System.out.println(esCapicua(3333218)); //Debe salir false
        System.out.println(esCapicua(123456789987654321L)); //Debe salir true
        System.out.println(esCapicua(154152151523152351L)); //Debe salir false
        System.out.println(esPrimo(13)); //debe salir true
        System.out.println(esPrimo(12)); //debe salir false
        System.out.println(esPrimo(1241251283L)); //debe salir true
        System.out.println(esPrimo(1241251250L)); //debe salir false
        System.out.println(siguientePrimo(15)); //debe salir el numero 17 
        System.out.println(primoCercano(14, true)); //saldra 13 que es el anterior
        System.out.println(primoCercano(14, false)); //saldra 15 que es el siguiente
        System.out.println(potencia(2, 5)); //va a salir la potencia de 2^5, es 32
        System.out.println(digitos(123456789012345L)); //hay 15 digitos
        System.out.println(digitos(12345)); //cuenta los digitos, hay 5
        System.out.println(voltea(12345678)); //se le dará la vuelta al numero
        System.out.println(digitoN(1234, 2));
        System.out.println(posicionDeDigito(12345, 3)); //saldra 3, porque es la posicion del digito 3
        System.out.println(posicionDeDigito(12345, 6)); //saldra -1
        System.out.println(quitarPorDetras(12345)); //se le quita el 5
        System.out.println(quitarPorDelante(12345)); //se le quitara el 1
        System.out.println(quitarPorDetras(12345, 2)); //se le quitan 2 por detras
        System.out.println(quitarPorDelante(12345, 2)); //se le quitan 2 por delante
        System.out.println(pegaPorDelante(12345, 33)); //se le pega 33 alante
        System.out.println(pegaPorDetras(12345, 33)); //se le pega 33 por detras
        System.out.println(trozoDeNumero(111144447777L, 4, 4)); //se le quitan 4 por delante y detras
        System.out.println(juntaNumeros(123, 456)); //Debe de salir 123456
    }
    
    public static boolean esCapicua(long x){
        long num_reves = 0;
        num_reves = voltea(x);
        if(num_reves == x){
            return true;
        }
        else{
        return false;
        }
    }
    
    public static boolean esCapicua(int x){
        int num_reves = 0;
        int temp = x;
        while(temp > 0){
            num_reves += temp % 10;
            num_reves *= 10;
            temp /= 10;
        }
        num_reves /= 10;        
        if(x == num_reves){
            return true;
        }
        return false;
    }
    
    public static boolean esPrimo(long x){
        for(long i = 2; i < x;i++){
            if(x % i == 0){
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
    public static boolean esPrimo(int x){
        for(int i = 2; i < x;i++){
            if(x % i == 0){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    
    public static int siguientePrimo(int x){
        int siguiente = x + 1;
        while(true){
            if(esPrimo(siguiente)){
                return siguiente;
            }
            else{
                siguiente++;
            }
        }
    }
    
    public static int primoCercano(int x, boolean anterior){
        if(anterior){
            for(int i = x - 1;i < x;i--){
                if(esPrimo(i)){
                    return i;
                }
            }
        }
        return siguientePrimo(x);
    }
    
    public static double potencia(int base, int exponente){
        double num = 0;
        if(exponente > 0){
           num = Math.pow(base, exponente);
           return num;
        }
        else{
            num = Math.pow(base, exponente);
            num = num / 1;
            return num;
        }
    }
    
    public static int digitos(long x){
        int cantidadDigitos = 0; 
        while(x > 0){
            x /= 10;
            cantidadDigitos++;
        }
        return cantidadDigitos;
    }
    
    public static int digitos(int x){
        return digitos((long)x);
    }
    
    public static long voltea(int x){
        return voltea((long)x);
    }
    
    public static long voltea(long x){
        long num_volteado = 0;
        long digito = 0;
        
        while(x > 0){
            digito = x % 10;
            num_volteado += digito;
            num_volteado *= 10;
            x /= 10;
        }
        num_volteado /= 10;
        
        return num_volteado;
    }
    
    public static int digitoN(long x, int n){
        long temp = x;
        double contadorDigitos = 0;
        double potencia = 10;
        long digito = 0;
        
        contadorDigitos = digitos(x);
        
        contadorDigitos -= n;
        potencia = Math.pow(potencia, contadorDigitos);
        x /= potencia;
        digito = x % 10;
        
        return (int)digito;
    }
    
    public static int digitoN(int x, int n){
        return digitoN((long)x, n);
    }
    
    public static long posicionDeDigito(long x, int d){
        long digito = 0;
        int contadordigitos = 0;
        while(x > 0){
            digito = x % 10;
            x /= 10;
            contadordigitos++;
            if(digito == d){
                return contadordigitos;
            }
        }
        return -1;
    }
    
    public static int posicionDeDigito(int x, int d){
        return (int) posicionDeDigito((long)x, d);
    }
    
    public static long quitarPorDetras(long x){
        long num = quitarPorDetras(x, 1);
        return num;
    }
    
    public static long quitarPorDelante(long x){
        long num = quitarPorDelante(x, 1);
        return num;
    }
    
    public static long quitarPorDetras(long x, int n){
        long num = x;
        
        for(int i = 0;i < n;i++){
            num /= 10;
        }
        
        return num;
    }
    
    public static long quitarPorDelante(long x, int n){
        double cantidadDigitos = digitos(x);
        long num = x;
        cantidadDigitos = Math.pow(10, cantidadDigitos);
        cantidadDigitos = cantidadDigitos / (Math.pow(10, (double)n));
        num %= cantidadDigitos;
        return num;
    }
    
    public static long pegaPorDetras(long x, int d){
        long num = x * 10;
        num += d;
        return num;
    }
    
    public static long pegaPorDelante(long x, int d){
        long num = x;
        double numAnyadir = d;
        int digitosNum = digitos(num);
        numAnyadir *= potencia(10, digitosNum);
        num += numAnyadir;
        return num;
    }
    
    public static long trozoDeNumero(long x, int inicio, int fin){
        long num = x;
        num = quitarPorDelante(num, inicio);
        num = quitarPorDetras(num, fin);
        return num;
    }
    
    public static long juntaNumeros(long x, long y){
        long num1 = x;
        long num2 = y;
        int digitosNum1 = 0;
        digitosNum1 = digitos(num1);
        num1 *= (long) potencia(10, digitosNum1);
        return num1 + num2;
    }
}