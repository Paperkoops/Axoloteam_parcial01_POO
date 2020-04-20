package com.LASA_AEAB.x00038419x00039619;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    static String[] cmbMenu = {"Agregar empleado", "Despedir empleado", "Ver lista de empleados", "Calcular sueldo", "Mostrar totales", "Salir"};
    static String[] cmbTipoEmpleado = {"Plaza fija","Servicio profesional"};
    static String[] cmbDecision = {"No","Sí"};
    public static void main(String[] args) {

         Empresa emp = new Empresa("Carnitas mamachuz");
        JComboBox jcb;
        int opcion = 0;

        do{
            jcb = new JComboBox(cmbMenu);
           opcion = mostrarInput(jcb,"Menu principal");
           switch (opcion)
           {
               case 0 :
                   Empleado nuevoEmpleado;
                   jcb = new JComboBox(cmbTipoEmpleado);
                   int tipoEmpleadoNuevo = mostrarInput(jcb,"Seleccione tipo de empleado");
                   if(tipoEmpleadoNuevo == 0){
                       nuevoEmpleado = new PlazaFija(mostrarInput("Ingrese nombre del empleado", "Nombre del empleado"), mostrarInput("Ingrese puesto del empleado", "Puesto"), Double.parseDouble(mostrarInput("Ingrese el salario del empleado","Salario")), Integer.parseInt(mostrarInput("Ingrese la extension del empleado","Extensión")));

                   }else{
                       nuevoEmpleado = new ServicioProfesional(mostrarInput("Ingrese nombre del empleado", "Nombre del empleado"), mostrarInput("Ingrese puesto del empleado", "Puesto"), Double.parseDouble(mostrarInput("Ingrese el salario del empleado","Salario")), Integer.parseInt(mostrarInput("Ingrese meses de contrato","Meses")));
                   }
                   jcb = new JComboBox(cmbDecision);
                   int decisionDocumento = mostrarInput(jcb,"Documentos");
                   if(decisionDocumento == 1){
                       do{
                           Documento nuevoDoc= new Documento(mostrarInput("Ingrese nombre del documento","Nombre"),mostrarInput("Ingrese número del documento","Número"));
                           nuevoEmpleado.addDocumento(nuevoDoc);
                           decisionDocumento = mostrarInput(jcb,"Documentos");
                       }while(decisionDocumento == 1);
                   }
                   emp.addEmpleado(nuevoEmpleado);
                   JOptionPane.showMessageDialog( null, "Empleado agregado excitosamente", "Agregado", JOptionPane.INFORMATION_MESSAGE);
                   break;
               case 1 :
                   emp.quitEmpleado(mostrarInput("Ingrese nombre del empleado a despedir","Despedir empleado"));
                   break;
               case 2 :

                   break;
               case 3 :
                  // ArrayList<Empleado> plan = emp.getPlanilla();
                   //plan.get(0).CalculadoraImpuestos.agregar5();
                   break;

               default:
           }
        }while(opcion != 5);

    }
    public static int mostrarInput(JComboBox jcb, String titulo){
        JOptionPane.showMessageDialog( null, jcb, titulo, JOptionPane.QUESTION_MESSAGE);
        return jcb.getSelectedIndex();
    }
    public static String mostrarInput(String jcb, String titulo){
        return JOptionPane.showInputDialog( null, jcb, titulo, JOptionPane.QUESTION_MESSAGE);
    }

}
