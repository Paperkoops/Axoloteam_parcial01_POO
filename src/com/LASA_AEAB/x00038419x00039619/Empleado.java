package com.LASA_AEAB.x00038419x00039619;

import java.util.List;

public abstract class Empleado {

    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos;
    protected double salario;

    Empleado(String nombre, String puesto, double salario){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void addDocumento(Documento doc) {
        this.documentos.add(doc);
    }

    public void removeDocumento(String str){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
