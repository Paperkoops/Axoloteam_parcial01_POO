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

    @Override
    public String toString() {
        return  System.lineSeparator() +
                "- Tipo Empleado: Servicio Profesional" + System.lineSeparator() +
                "- Meses de contrato: " + mesesContrato + System.lineSeparator() +
                "- Nombre: " + nombre + System.lineSeparator() +
                "- Puesto: " + puesto + System.lineSeparator() +
                "- Documentos: " + documentos.size() + System.lineSeparator() +
                "- Salario: " + salario + System.lineSeparator();
    }
}
