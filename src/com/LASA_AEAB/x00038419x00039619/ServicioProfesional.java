package com.LASA_AEAB.x00038419x00039619;

public class ServicioProfesional extends Empleado{
    private int mesesContrato;

    ServicioProfesional(String nombre, String puesto, double salario, int meses ){
        super(nombre, puesto,salario);
        this.mesesContrato = meses;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
