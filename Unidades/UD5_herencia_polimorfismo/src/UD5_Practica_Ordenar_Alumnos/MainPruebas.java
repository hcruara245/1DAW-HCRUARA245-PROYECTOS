package UD5_Practica_Ordenar_Alumnos;

import java.util.Arrays;

public class MainPruebas {
    public static void main(String[] args) {
        Alumno[] clase1 = {
                new Alumno(Ciclo.DAM,Curso.Primero,"VICTOR LOSADA","9999X",58,7.875),
                new Alumno(Ciclo.DAM,Curso.Segundo,"ALEJANDRO GRAU","73149Y",45,4.55),
                new Alumno(Ciclo.DAW,Curso.Primero,"MANUEL PEREZ","E51580H",42,10),
                new Alumno(Ciclo.DAW,Curso.Segundo,"HUGO CRUZ","28983W",18,6.125),
                new Alumno(Ciclo.SMR,Curso.Primero,"ADAM ORTA","0414OO",19,7.99),
                new Alumno(Ciclo.SMR,Curso.Segundo,"JUAN JOSE","01235T",20,9.63),
                new Alumno(Ciclo.NA,Curso.NA,"JUAN MALAGA", "I8175X",25,9.99)
        };

        Arrays.sort(clase1);

        Alumno[] clase2 = {
            new Alumno(Ciclo.SMR,Curso.Primero,"A","0414OO",19,7.99),
            new Alumno(Ciclo.SMR,Curso.Segundo,"D","01235T",20,9.63),
            new Alumno(Ciclo.SMR,Curso.Primero,"B","0414OO",19,1.53),
            new Alumno(Ciclo.SMR,Curso.Segundo,"E","01235T",20,8.56),
            new Alumno(Ciclo.SMR,Curso.Primero,"C","0414OO",19,3.6),
            new Alumno(Ciclo.SMR,Curso.Segundo,"F","01235T",20,4.75)
        };

        Arrays.sort(clase2);

        Alumno[] clase3 = {
                new Alumno(Ciclo.DAM,Curso.Primero,"VICTOR LOSADA","9999X",58,9.75),
                new Alumno(Ciclo.DAM,Curso.Segundo,"ALEJANDRO GRAU","73149Y",45,1.55),
                new Alumno(Ciclo.DAW,Curso.Primero,"MANUEL PEREZ","E51580H",42,5.67),
                new Alumno(Ciclo.DAW,Curso.Segundo,"HUGO CRUZ","28983W",18,7.25)
        };

        Arrays.sort(clase3);
    }
}
