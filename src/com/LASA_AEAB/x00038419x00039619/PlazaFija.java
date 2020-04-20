package com.LASA_AEAB.x00038419x00039619;

public class PlazaFija extends Empleado {
    private int extension;

    PlazaFija(String nombre, String puesto, double salario, int extension){
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
            this.extension = extension;
    }

    @Override
    public String toString() {
        return  System.lineSeparator() +
                "- Tipo Empleado: Plaza Fija" + System.lineSeparator() +
                "- Extension: " + extension + System.lineSeparator() +
                "- Nombre: " + nombre + System.lineSeparator() +
                "- Puesto: " + puesto + System.lineSeparator() +
                "- Documentos: " + documentos.size() + System.lineSeparator() +
                "- Salario: " + salario + System.lineSeparator();
    }
}
