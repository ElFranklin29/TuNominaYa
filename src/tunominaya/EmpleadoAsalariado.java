package TuNominaYa;

// La clase EmpleadoAsalariado que extiende a Empleado.

import javax.swing.JOptionPane;


public class EmpleadoAsalariado extends Empleado {
   private double salarioSemanal;
   

   // constructor
   public EmpleadoAsalariado( String nombre, String apellido, String numeroSeguroSocial, double salario ){
      super( nombre, apellido, numeroSeguroSocial ); 
      establecerSalarioSemanal( salario );
   } 
   

    public EmpleadoAsalariado(){
        this.salarioSemanal=0;
    
    }

   // establecer el salario del empleado asalariado
   public void establecerSalarioSemanal( double salario )
   {
      salarioSemanal = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario del empleado asalariado
   public double obtenerSalarioSemanal()
   {
      return salarioSemanal;
   } 

   @Override
   public void infoEmpleado(){
       super.infoEmpleado();
       this.establecerSalarioSemanal(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario"
               + " semanal del empleado: ", "Empleado Asalariado", 1)));
   } 
   
   public void modificar(){
       PruebaSistemaNomina obj= new PruebaSistemaNomina();
       System.out.println("Modificar");
       obj.menuPrincipal();
       
   }
   
   
   // sobrescribir el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      return obtenerSalarioSemanal();
   } 
   
   
   // devolver la representaci�n String del objeto EmpleadoAsalariado
   @Override
   public String toString()
   {
      
      return "\nEmpleado Asalariado: " + super.toString()+
              "Gano: "+ingresos()+"\n";
   } 
   
} // fin de la clase EmpleadoAsalariado