package ejercicios_presentacion.examen_subida_notas;

import java.util.Scanner;

public class AlquilerDePisos {
    public static void main(String[] args) {
        int plantas = 3;
        int pisos = 4;

        int[][] habitantesBloque =  new int[plantas][pisos];

        // PLANTA 0
        habitantesBloque [0][0] = 2;
        habitantesBloque [0][1] = 0;
        habitantesBloque [0][2] = 3;
        habitantesBloque [0][3] = 0;

        // PLANTA 1
        habitantesBloque [1][0] = 0;
        habitantesBloque [1][1] = 0;
        habitantesBloque [1][2] = 1;
        habitantesBloque [1][3] = 4;

        // PLANTA 2
        habitantesBloque [2][0] = 5;
        habitantesBloque [2][1] = 0;
        habitantesBloque [2][2] = 0;
        habitantesBloque [2][3] = 0;


        System.out.println(calcularVecinosBloque(habitantesBloque));

        int[] libres = obtenerPisosLibresPorPlanta(habitantesBloque);
        imprimirPisosLibresPorPlanta(libres);

        System.out.println(comprobarDisponibilidad(habitantesBloque, 0,1));
        alquilarPiso(habitantesBloque,0,1,8);
        System.out.println(comprobarDisponibilidad(habitantesBloque, 0,1));

        System.out.println(calcularVecinosBloque(habitantesBloque));

        libres = obtenerPisosLibresPorPlanta(habitantesBloque);
        imprimirPisosLibresPorPlanta(libres);
    }

    public static int calcularVecinosBloque(int[][] bloque){
        int res = 0;

        for (int i = 0; i < bloque.length; i++) {
            for (int j = 0; j < bloque[i].length; j++) {
                res += bloque[i][j];
            }
        }

        return res;
    }

    public static boolean comprobarDisponibilidad(int[][] bloque, int planta, int num_piso){
        boolean res = false;

        if (planta < bloque.length){
            if (num_piso < bloque[planta].length){
                if (bloque[planta][num_piso] == 0){
                    res = true;
                }
            }
        }

        return res;
    }

    public static int[] obtenerPisosLibresPorPlanta(int[][] bloque){
        int[] res = new int[bloque.length];

        for (int i = 0; i < bloque.length; i++) {
            int pisoslibres = 0;
            for (int j = 0; j < bloque[i].length; j++) {
                if (bloque[i][j] == 0){
                    pisoslibres++;
                }
            }
            res[i] = pisoslibres;
        }


        return res;
    }

    public static void imprimirPisosLibresPorPlanta(int[] libres){
        for (int i = 0; i < libres.length; i++) {
            System.out.print("PLANTA: " + i + " -> " +  libres[i] + " pisos libres");
            System.out.println();
        }
    }

    public static boolean alquilarPiso(int[][] bloque, int planta, int num_piso, int numpersonas){
        boolean res = false;
        boolean disponibilidad = comprobarDisponibilidad(bloque, planta, num_piso);

        if (disponibilidad){
            bloque[planta][num_piso] = numpersonas;
        }

        return res;
    }
}
