package adivina_el_numero.EJ2;

public class Gestion_Eventos {
    public static void main(String[] args) {
        calcularFechaFinal(25,2,2023,10);
        calcularFechaFinal(28,12,2023,10);
        calcularFechaFinal(29,12,2023,10);
        calcularFechaFinal(30,12,2023,10);
        calcularFechaFinal(31,12,2023,10);
        calcularFechaFinal(1,1,2023,364);
    }

    public static void calcularFechaFinal(int dia,int mes,int anio, int num_dias){

        // Un poco de control de errores para que no metan fechas raras
        if (dia > 28 && mes == 2){
            dia = 1;
        }

        if (dia <= 0 || dia > 31){
            dia = 1;
        }
        if (mes <= 0  || mes > 12){
            mes = 1;
        }
        if (anio <= 0){
            anio = 1;
        }
        if (num_dias <= 0){
            num_dias = 1;
        }

        int[] dias_meses = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (num_dias > 31){
            boolean para = false;
            for (int i = 0; i < dias_meses.length && !para; i++){
                num_dias = num_dias - dias_meses[i];
                mes = i + 1;
                if (num_dias > 0 && num_dias < 31){
                    para = true;
                }
            }
        }

        dia += num_dias;

        if (dia > dias_meses[mes - 1]){
            dia -= dias_meses[mes - 1];
            mes++;
            if (mes > 12){
                mes = 1;
                anio++;
            }
        }

        System.out.println("Fecha final: " + dia + "/" + mes + "/" + anio);
    }
}
