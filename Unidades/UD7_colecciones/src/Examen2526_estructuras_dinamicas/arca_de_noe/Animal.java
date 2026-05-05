package Examen2526_estructuras_dinamicas.arca_de_noe;

import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private String especie;
    private Sexo sexo;

    public Animal(String especie, Sexo sexo) {
        this.especie = especie;
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public int compareTo(Animal o) {
        int res = 0;

        res = this.especie.compareTo(o.getEspecie());
        if (res == 0) {
            res = this.sexo.compareTo(o.getSexo());
        }

        return res;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(getEspecie(), animal.getEspecie()) && getSexo() == animal.getSexo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEspecie(), getSexo());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
