package UD5_Practica1_COAC;

import java.util.Arrays;

public class COAC {
    protected AgrupacionOficial[] agrupacionOficiales;

    public COAC() {
        agrupacionOficiales = new AgrupacionOficial[0];
    }

    void inscribir_agrupacion(AgrupacionOficial agrupacion){
        agrupacionOficiales = Arrays.copyOf(agrupacionOficiales, agrupacionOficiales.length + 1);
        agrupacionOficiales[agrupacionOficiales.length - 1] = agrupacion;
    }

    boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        boolean eliminado = false;

        for (int j = 0; j < agrupacionOficiales.length; j++){
            if (agrupacionOficiales[j].equals(agrupacion)){
                agrupacionOficiales[j] = null;
                eliminado = true;
            }
        }

        return eliminado;
    }

    @Override
    public String toString() {
        return "COAC{" + "agrupacionOficiales=" + Arrays.toString(agrupacionOficiales) +'}';
    }
}
