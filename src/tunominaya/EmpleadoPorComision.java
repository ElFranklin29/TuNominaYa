package TuNominaYa;
// La clase EmpleadoPorComision que extiende a Empleado.

import javax.swing.JOptionPane;


public class EmpleadoPorComision extends Empleado {
   private double ventasTotales;      // ventas totales por semana
   private double tasaComision;  // porcentaje de comisi�n

   // constructor
   public EmpleadoPorComision( String nombre, String apellido, String numeroSeguroSocial, 
           double ventasTotalesSemana, double porcentaje){
      super( nombre, apellido, numeroSeguroSocial );
      establecerVentasTotales( ventasTotalesSemana );
      establecerTasaComision( porcentaje );
   } 
   
   public EmpleadoPorComision(){
       this.tasaComision=0;
       this.ventasTotales=0;
   }

   // establecer la tasa de comisi�n del empleado
   public void establecerTasaComision( double tasa )
   {
      tasaComision = ( tasa > 0.0 && tasa < 1.0 ) ? tasa : 0.0;
   } 

   // devolver la tasa de comisi�n del empleado
   public double obtenerTasaComision()
   {
      return tasaComision;
   } 

   // establecer salario base semanal del empleado por comisi�n
   public void establecerVentasTotales( double ventas )
   {
      ventasTotales = ventas < 0.0 ? 0.0 : ventas;
   } 

   // devolver cantidad de ventas totales del empleado por comisi�n
   public double obtenerVentasTotales()
   {
      return ventasTotales;
   } 

   // calcular pago del empleado por comisi�n;
   // sobrescribir el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      return obtenerTasaComision() * obtenerVentasTotales();
   } 
   
   @Override
   public void infoEmpleado(){
       super.infoEmpleado();
       this.establecerVentasTotales(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas totales: "
               , "Ventas Totales", 1)));
       this.establecerTasaComision(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tasa de la comision: "
               , "Tasa Comision", 1)));
   }
   

   // devolver la representaci�n String del objeto EmpleadoPorComision
   @Override
   public String toString()
   {
      return "\nempleado por comisi�n: " + super.toString()+
              "Gano: "+ingresos()+"\n";
   } 
   
} // fin de la clase EmpleadoPorComision

