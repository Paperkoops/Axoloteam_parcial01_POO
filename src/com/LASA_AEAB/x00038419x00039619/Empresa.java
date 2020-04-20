package com.LASA_AEAB.x00038419x00039619;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla = new ArrayList<>();

    Empresa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado empleado){
        this.planilla.add(empleado);
    }

    public void quitEmpleado(String nomb){

        boolean found = false;
        for (Empleado empAux :planilla){
            if(empAux.getNombre().equals(nomb)){
                found = true;
            }
        }
        if(found){
            String finalName = nomb;
            planilla.removeIf(itemm -> (itemm.getNombre().equals(finalName)));
            JOptionPane.showMessageDialog( null, "Empleado despedido excitosamente", "Despedido", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog( null, "Empleado no encontrado", "404", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
