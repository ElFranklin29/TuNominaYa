package TuNominaYa;
// La clase EmpleadoPorHoras que extiende a Empleado.

import javax.swing.JOptionPane;


public class EmpleadoPorHoras extends Empleado {
   private double sueldo;   // sueldo por hora
   private double horas;  // horas trabajadas en la semana

   // constructor
   public EmpleadoPorHoras(String nombre, String apellido,  String numeroSeguroSocial, 
           double sueldoPorHora, double horasTrabajadas)
   {
      super( nombre, apellido, numeroSeguroSocial );
      establecerSueldo( sueldoPorHora );
      establecerHoras( horasTrabajadas );
   } 
   
    public EmpleadoPorHoras(){
        this.horas=0;
        this.sueldo=0;
   } 

   // establecer sueldo de empleado por horas
   public void establecerSueldo( double cantidadSueldo )
   {
      sueldo = cantidadSueldo < 0.0 ? 0.0 : cantidadSueldo;
   } 

   // devolver sueldo
   public double obtenerSueldo()
   {
      return sueldo;
   } 

   // establecer horas trabajadas del empleado por horas
   public void establecerHoras( double horasTrabajadas )
   {
      horas = ( horasTrabajadas >= 0.0 && horasTrabajadas <= 168.0 ) ?
         horasTrabajadas : 0.0;
   } 

   // devolver horas trabajadas
   public double obtenerHoras()
   {
      return horas;
   } 

   // calcular pago del empleado por horas;
   // sobrescribir el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      if ( horas <= 40 )  // sin tiempo extra
         return sueldo * horas;
      else
         return 40 * sueldo + ( horas - 40 ) * sueldo * 1.5;
   } 
   
   @Override
   public void infoEmpleado(){
       super.infoEmpleado();
       this.establecerSueldo(Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Ingrese el sueldo por hora: ", "Sueldo Por Hora", 1)));
       this.establecerHoras(Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Ingrese las horas trabajadas: ", "Horas Trabajadas", 1)));
       
   
   }

   // devolver la representaci�n String del objeto EmpleadoPorHoras
   @Override
   public String toString()
   {
      return "\nEmpleado por Horas: " + super.toString()+
              "Gano: "+ ingresos();
   } 
   
} // fin de la clase EmpleadoPorHoras
