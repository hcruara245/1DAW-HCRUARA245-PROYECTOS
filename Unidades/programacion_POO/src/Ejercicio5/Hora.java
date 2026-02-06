package Ejercicio5;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        if (hora > 23 || minuto > 59 || segundo > 59){
            System.out.println("Alguno de los parametros son incorrectos");
        }
        else{
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void incrementar_segundos(int segundos_a_incrementar){
        this.segundo += segundos_a_incrementar;
        if(this.segundo > 59){
            this.minuto += this.segundo / 60;
            this.segundo = this.segundo % 60;
            if(this.minuto > 59){
                this.hora += this.minuto / 60;
                this.minuto = this.minuto % 60;
                if(this.hora > 23){
                    this.hora = this.hora % 24;
                }
            }
        }
        System.out.println("Hora incrementada");
        if (this.hora < 10){
            System.out.print("0" + this.hora + ":");
        }
        else{
            System.out.print(this.hora + ":");
        }
        if (this.minuto < 10){
            System.out.print("0" + this.minuto + ":");
        }
        else{
            System.out.print(this.minuto + ":");
        }
        if (this.segundo < 10){
            System.out.println("0" + this.segundo);
        }
        else{
            System.out.println(this.segundo);
        }
    }
}
