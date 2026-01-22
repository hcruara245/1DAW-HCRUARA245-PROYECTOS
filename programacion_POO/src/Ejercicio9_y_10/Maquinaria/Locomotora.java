package Ejercicio9_y_10.Maquinaria;

import Ejercicio9_y_10.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potenciaMotor;
    private int anyo_fabricacion;
    private Mecanico mecanicoAsignado;

    public Locomotora(String matricula, int potenciaMotor, int anyo_fabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anyo_fabricacion = anyo_fabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getAnyo_fabricacion() {
        return anyo_fabricacion;
    }

    public void setAnyo_fabricacion(int anyo_fabricacion) {
        this.anyo_fabricacion = anyo_fabricacion;
    }

    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }
}
