package Subida_de_notas_2526.Parking;

import java.time.LocalDateTime;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anyo;
    private String matricula;

    public Vehiculo(String marca, String modelo, int anyo, String matricula) {
        if (marca != null) {
            this.marca = marca;
        } else {
            this.marca = "Marca generica";
        }

        if (modelo != null) {
            this.modelo = modelo;
        } else {
            this.modelo = "Modelo generico";
        }

        if (anyo < 0) {
            this.anyo = anyo;
        } else {
            this.anyo = LocalDateTime.now().getYear();
        }

        if (matricula != null) {
            this.matricula = matricula;
        } else {
            this.matricula = "Matricula desconocida";
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                ", matricula='" + matricula + '\'' +
                '}';
    }


    public void mostrarDetalles(){
        System.out.println(this);
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public int getAnyo() {
        return anyo;
    }


    public String getMatricula() {
        return matricula;
    }

}
