package Ejercicio1_Y_Ejercicio_2;

class CuentaCorriente {
    private String dni;
    private String nombre_titular;
    private int saldo;

    public CuentaCorriente(String nombre_titular, String dni){
        if (dni.length() != 9){
            this.dni = "00000000A";
            this.saldo = 0;
            this.nombre_titular = nombre_titular;
            System.out.println("Cuenta creada");
        }
        else if (dni.endsWith("1") || dni.endsWith("2") || dni.endsWith("3") || dni.endsWith("4") || dni.endsWith("5")
                || dni.endsWith("6") || dni.endsWith("7") || dni.endsWith("8") || dni.endsWith("9") || dni.endsWith("0")){
            this.dni = "00000000A";
            this.saldo = 0;
            this.nombre_titular = nombre_titular;
            System.out.println("Cuenta creada");
        }
        else{
            this.saldo = 0;
            this.nombre_titular = nombre_titular;
            this.dni = dni;
            System.out.println("Cuenta creada");
        }
    }

    public void sacar_dinero (int saldo_retirar){
        if(saldo_retirar > this.saldo){
            System.out.println("Error: No tienes tanto dinero en la cuenta");
        }
        else{
            this.saldo -= saldo_retirar;
            System.out.println("Saldo retirado");
        }
    }

    public void ingresar_dinero(int ingreso){
        this.saldo += ingreso;
        System.out.println("Dinero ingresado");
    }

    public void mostrar_info(){
        System.out.println(this.dni + " | " + this.nombre_titular + " | " + this.saldo + "€");
    }
}
