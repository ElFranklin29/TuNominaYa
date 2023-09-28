package TuNominaYa;
// Programa de prueba de la jerarqu�a Empleado.

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PruebaSistemaNomina {

    public PruebaSistemaNomina() {

    }

    EmpleadoAsalariado asalariado = new EmpleadoAsalariado();
    ArrayList<String> infoAsalariado = new ArrayList<>();

    EmpleadoPorComision porComision = new EmpleadoPorComision();
    ArrayList<String> infoPorComision = new ArrayList<>();

    EmpleadoBaseMasComision BaseMasComision = new EmpleadoBaseMasComision();
    ArrayList<String> infoBaseMasComision = new ArrayList<>();

    EmpleadoPorHoras porHoras = new EmpleadoPorHoras();
    ArrayList<String> infoPorHoras = new ArrayList<>();

    int opcion = 0;

    public void menuPrincipal() {
        do {
            String[] opciones = {"Administrativo", "Empleado", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Seleccione rol: ", "Rol",
                    0, 1, null, opciones, null);

            switch (opcion) {
                case 0:
                    menuAdministrativo();
                    break;
                case 1:
                    menuEmpleado();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } while (opcion != 9);
        JOptionPane.showInputDialog(null, "¡Hasta luego!", "Salir", 1);

    }

    public void menuEmpleado() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar Empleado Asalariado"
                    + "\n2. Agregar Empleado Por Comision"
                    + "\n3. Agregar Empleado Base Mas Comision"
                    + "\n4. Agregar Empleado Por Hora"
                    + "\n5. Regresar al Menu Principal", "Agregar Empleado", 1));
            switch (opcion) {
                case 1:
                    asalariado.infoEmpleado();
                    infoAsalariado.add(" " + asalariado.toString());
                    break;
                case 2:
                    porComision.infoEmpleado();
                    infoPorComision.add(porComision.toString());
                    break;
                case 3:
                    BaseMasComision.infoEmpleado();
                    infoBaseMasComision.add(BaseMasComision.toString() + "\n");
                    break;
                case 4:
                    porHoras.infoEmpleado();
                    infoPorHoras.add(porHoras.toString());
                    break;
                case 5:
                    menuPrincipal();
                    break;
            }

        } while (opcion != 6);
    }

    public void menuAdministrativo() {
        String[] opciones = {"Eliminar", "Regresar"};
        int opcion, Asalariado, porcomision, mascomision, porhora;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Mostrar Empleado Asalariado"
                    + "\n2. Mostrar Empleado Por Comision"
                    + "\n3. Mostrar Empleado Base Mas Comision"
                    + "\n4. Mostrar Empleado Por Hora"
                    + "\n5. Mostrar al Menu Principal",
                    "Administrativo", 1));

            switch (opcion) {
                case 1:
                    Asalariado = JOptionPane.showOptionDialog(null, infoAsalariado, "Empleado Asalariado",
                            0, 1, null, opciones, null);
                    if (Asalariado == 0) {
                        int valor;
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que empleado desea eliminar"
                                + "\n" + infoAsalariado, "Eliminar",
                                1));
                        infoAsalariado.remove(valor - 1);
                    }
                    break;
                case 2:
                    porcomision = JOptionPane.showOptionDialog(null, infoPorComision, "Empleado Por Comision",
                            0, 1, null, opciones, null);
                    if (porcomision == 0) {
                        int valor;
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que empleado desea eliminar"
                                + "\n" + infoPorComision, "Eliminar",
                                1));
                        infoPorComision.remove(valor - 1);
                    }
                    break;
                case 3:
                    mascomision = JOptionPane.showOptionDialog(null, infoBaseMasComision, "Empleado Base Mas Comision",
                            0, 1, null, opciones, null);
                    if (mascomision == 0) {
                        int valor;
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que empleado desea eliminar"
                                + "\n" + infoBaseMasComision, "Eliminar",
                                1));
                        infoBaseMasComision.remove(valor - 1);
                    }
                    break;
                case 4:
                    porhora = JOptionPane.showOptionDialog(null, infoPorHoras, "Empleado Por Hora",
                            0, 1, null, opciones, null);
                    if (porhora == 0) {
                        int valor;
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que empleado desea eliminar"
                                + "\n" + infoPorHoras, "Eliminar",
                                1));
                        infoPorHoras.remove(valor - 1);
                    }
                    break;
                case 5:
                    menuPrincipal();
                    break;
            }
        } while (opcion != 6);

    }

    public static void main(String[] args) {
        PruebaSistemaNomina obj = new PruebaSistemaNomina();
        obj.menuPrincipal();

    }// fin de main

} // fin de la clase PruebaSistemaNomina
