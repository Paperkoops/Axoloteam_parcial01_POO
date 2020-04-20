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

        public static double calcularPago(Empleado emp){
            double renta = 0;
            double isss = 0;
            double afp = 0;
            double sueldo = 0;
            double restante = 0;
            if(emp instanceof ServicioProfesional){
                renta = emp.getSalario() * 0.1;
                sueldo = emp.getSalario() - renta;

            }else{
                afp = 0.0625 * emp.getSalario();
                isss = 0.03 * emp.getSalario();
                restante = emp.getSalario() - afp - isss;
                if(restante > 0 && restante <= 472){
                    renta = 0;
                }else if(restante > 472.01 && restante <= 895.24){
                    renta = 0.1 * (restante - 472) + 17.67;
                }else if(restante > 895.25 && restante <= 2038.10){
                    renta = 0.2 * (restante - 895.24) + 60;
                }else if(restante > 2038.11){
                    renta = 0.3 * (restante - 2038.10) + 288.57;
                }
                sueldo = restante - renta;
            }
            return sueldo;
        }

        public static String mostrarTotales(ArrayList<Empleado> empleados){
            totalISS = 0;
            totalRenta = 0;
            totalAFP = 0;

            for (Empleado empAux :empleados){
                double renta = 0;
                double isss = 0;
                double afp = 0;
                double sueldo = 0;
                double restante = 0;

                if(empAux instanceof ServicioProfesional){
                    renta = empAux.getSalario() * 0.1;
                    sueldo = empAux.getSalario() - renta;

                }else{
                    afp = 0.0625 * empAux.getSalario();
                    isss = 0.03 * empAux.getSalario();
                    restante = empAux.getSalario() - afp - isss;
                    if(restante > 0 && restante <= 472){
                        renta = 0;
                    }else if(restante > 472.01 && restante <= 895.24){
                        renta = 0.1 * (restante - 472) + 17.67;
                    }else if(restante > 895.25 && restante <= 2038.10){
                        renta = 0.2 * (restante - 895.24) + 60;
                    }else if(restante > 2038.11){
                        renta = 0.3 * (restante - 2038.10) + 288.57;
                    }
                    sueldo = restante - renta;
                }
                totalAFP += afp;
                totalRenta += renta;
                totalISS += isss;
            }
            return "Los totales son:" + System.lineSeparator() + "Total AFP: " +totalAFP+ System.lineSeparator() + "Total ISSS: " +totalISS+ System.lineSeparator() + "Total renta: " +totalRenta+ System.lineSeparator();
        }

    }
}
