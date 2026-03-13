public class RedElectrica {
    ComponenteDeRed[] componenteDeReds;

    public RedElectrica() {
        this.componenteDeReds = new ComponenteDeRed[12];
    }

    public void anadirComponenteDeRed(ComponenteDeRed componenteDeRed) throws RedSobrecargadaException{
        boolean anadido = false;
        for (int i = 0; i < this.componenteDeReds.length || !anadido; i++){
            if (this.componenteDeReds[i] == null){
                this.componenteDeReds[i] = componenteDeRed;
                anadido = true;
            }
        }
        if (!anadido){
            throw new RedSobrecargadaException("ERROR: RED SOBRECARGADA, NO HAY ESPACIO PARA MÁS COMPONENTES");
        }
    }

    public void retirarComponentesDestruidos(){
        for (int i = 0; i < this.componenteDeReds.length; i++){
            if (this.componenteDeReds[i].desgaste >= 100){
                this.componenteDeReds[i] = null;
            }
        }
    }

    public void mostrarEstado(){
        for (int i = 0; i < this.componenteDeReds.length; i++){
            System.out.println(this.componenteDeReds[i].toString());
        }
    }

    public void ultimoComponenteVitalCritico(){
        int contadorComponentesVitalesCriticos = 0;
        int posUltimoCompVital = 0;

        for (int i = 0; i < this.componenteDeReds.length; i++){
            if (this.componenteDeReds[i] != null && this.componenteDeReds[i].prioridad || this.componenteDeReds[i].energiaAcum <= 100){
                contadorComponentesVitalesCriticos++;
                posUltimoCompVital = i;
            }
        }

        if (contadorComponentesVitalesCriticos == 1){
            System.out.println("EL ÚLTIMO COMPONENTE VITAL CRÍTICO ES: ");
            System.out.println(this.componenteDeReds[posUltimoCompVital].toString());
        }
        else if (contadorComponentesVitalesCriticos == 0){
            System.out.println("NO HAY COMPONENTES VITALES CRITICOS");
        }
        else {
            System.out.println("HAY MÁS DE UN COMPONENTE VITAL CRÍTICO");
        }
    }
}
