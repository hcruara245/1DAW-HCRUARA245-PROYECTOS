/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.ComparableYComparator;

import java.util.Comparator;

public class Coche implements Comparable, Comparator {
    
    private String marca;
    private String matricula;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnyoMatriculacion() {
        return anyoMatriculacion;
    }

    public void setAnyoMatriculacion(int anyoMatriculacion) {
        this.anyoMatriculacion = anyoMatriculacion;
    }
    int anyoMatriculacion;
    
    public Coche(String marca, int anyo){
        this.marca = marca;
        this.anyoMatriculacion = anyo;
    }
    
    public String toString(){
        return this.marca + " : " + this.matricula + " del año " + this.anyoMatriculacion;
    }


    @Override
    public int compareTo(Object o) {
        int res = 0;
        Coche other = (Coche) o;
        if (this.anyoMatriculacion > other.anyoMatriculacion){
            res = 1;
        }
        else {
            res = -1;
        }
        return res;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Coche c1 = (Coche) o1;
        Coche c2 = (Coche) o2;

        return c1.compareTo(c2);
    }
}
