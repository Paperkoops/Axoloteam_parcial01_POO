package com.LASA_AEAB.x00038419x00039619;

public class Documento {

    private String nombre;
    private String numero;

    Documento(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }
}
