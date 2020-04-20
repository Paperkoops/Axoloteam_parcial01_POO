package com.LASA_AEAB.x00038419x00039619;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {

    protected String nombre;
    protected String puesto;
    protected ArrayList<Documento> documentos = new ArrayList<>();
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
        documentos.add(doc);
    }

    public void removeDocumento(String str){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static class CalculadoraImpuestos {

        private static double totalRenta = 0;
        private static double totalISS = 0;
        private static double totalAFP = 0;

        CalculadoraImpuestos(){

        }
        public static void agregar5(){
            totalRenta+=5;
            System.out.println(totalRenta);
        }

        public static double calcularPago(Empleado emp){
            if(emp instanceof ServicioProfesional){

            }else{

            }
            return 0.0;
        }

        public static String mostrarTotales(){

            return "asd";
        }

    }
}
