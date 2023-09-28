package TuNominaYa;
// La clase EmpleadoBaseMasComision que extiende a EmpleadoPorComision.

import javax.swing.JOptionPane;


public class EmpleadoBaseMasComision extends EmpleadoPorComision {
   private double salarioBase;  // salario base por semana

   // constructor
   public EmpleadoBaseMasComision( String nombre, String apellido, String numeroSeguroSocial, double cantidadVentasTotales, 
           double tasa, double cantidadSalarioBase){
      super( nombre, apellido, numeroSeguroSocial, cantidadVentasTotales, tasa );
      establecerSalarioBase( cantidadSalarioBase );
   } 
   
   public EmpleadoBaseMasComision(){
       this.salarioBase=0;
   }
   // establecer el salario base del empleado con salario base m�s comisi�n
   public void establecerSalarioBase( double salario )
   {
      salarioBase = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario base del empleado con salario base m�s comisi�n
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } 

   // calcular los ingresos del empleado con salario base m�s comisi�n;
   // sobrescribir el m�todo ingresos en EmpleadoPorComision
   @Override
   public void infoEmpleado(){
       super.infoEmpleado();
        this.establecerSalarioBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario base: "
               , "Tasa Comision", 1)));
   }
    
   @Override
   public double ingresos()
   {
      return obtenerSalarioBase()*1.10+ super.ingresos();
   } 

   // devolver la representaci�n String de EmpleadoBaseMasComision
   @Override
   public String toString()
   {
      return "\nEmpleado con salario base mas comision: " + 
              super.obtenerPrimerNombre() + " " + super.obtenerApellidoPaterno() +
            "\nNumero de seguro social: " + super.obtenerNumeroSeguroSocial()+
            "\nGano: "+ingresos();
   } 
   
} // fin de la clase EmpleadoBaseMasComision

