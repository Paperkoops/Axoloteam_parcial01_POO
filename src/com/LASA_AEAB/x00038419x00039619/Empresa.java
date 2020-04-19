package com.LASA_AEAB.x00038419x00039619;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla;

    Empresa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado empleado){
        this.planilla.add(empleado);
    }

    public void quitEmpleado(String nomb){

    }
}
