package Fest1;

import java.time.LocalDate;

public class Artista {
    private String nombre;
    private String NIF;
    private LocalDate nacimiento;
    private String discografía;
    private boolean grupo;

    public Artista(String nombre, String NIF, String discografía, LocalDate nacimiento, boolean grupo) {

        /*COMPROBACIÓN DE NIF CORRECTO y ASIGNACIÓN DEL NOMBRE*/
        if (NIF.length() == 9){
            this.NIF = NIF;
            this.nombre = nombre;
        } else if (NIF.length() > 9) {
            System.out.println("El NIF no puede ser mayor a 9");
            this.NIF = "*********";
            this.nombre = nombre;
        } else {
            this.NIF += NIF;
            this.nombre = nombre;
            for (int i = 0; i < 9 - NIF.length();i++){
                this.NIF += "*";
            }
        }

        /*COMPROBACIÓN DE AÑO CORRECTO*/
        if (nacimiento.getYear() > 1900 && nacimiento.getYear() < 2026){
            this.nacimiento = nacimiento;
        }
        else {
            System.out.println("FECHA DE NACIMIENTO INCORRECTA");
            this.nacimiento = LocalDate.of(1901,1,1);
        }

        /*COMPROBACIÓN DE DISCOGRAFÍA CORRECTO*/
        if (discografía != null){
            if (discografía.length() < 20 && discografía.length() >= 5){
                this.discografía = discografía;
            }
            else if (discografía.length() >= 20){
                this.discografía = discografía.substring(0,20);
            } else if (discografía.length() < 5) {
                this.discografía = "";
            }
        }
        else {
            this.discografía = "";
        }

        this.grupo = grupo;
    }
    /*Los dos constructores llaman al constructor principal pasandole parametros de entrada predeterminados*/
    public Artista(String nombre, String NIF, String discografía){
        this(nombre,NIF,discografía, LocalDate.of(1901,1,1),false);
    }

    public Artista(String nombre, String NIF){
        this(nombre,NIF,"", LocalDate.of(1901,1,1),false);
    }

    /*Getters útiles*/
    public String getNombre() {
        return nombre;
    }

    public boolean isGrupo() {
        return grupo;
    }

    public String getDiscografía() {
        return discografía;
    }

    public String getNIF() {
        return NIF;
    }


}
