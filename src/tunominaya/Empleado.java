package TuNominaYa;
// La superclase abstracta Empleado.

import javax.swing.JOptionPane;


public abstract class Empleado {
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;

   // constructor
   public Empleado( String nombre, String apellido, String ssn )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = ssn;
   } 
   
   public Empleado()
   {
      primerNombre = " ";
      apellidoPaterno = " ";
      numeroSeguroSocial = " ";
   } 

   // establecer el primer nombre
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } 

   // devolver el primer nombre
   public String obtenerPrimerNombre()
   {
      return primerNombre;
   } 

   // establecer el apellido
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } 

   // devolver el apellido
   public String obtenerApellidoPaterno()
   {
      return apellidoPaterno;
   } 

   // establecer el n�mero de seguro social
   public void establecerNumeroSeguroSocial( String numero )
   {
      numeroSeguroSocial = numero;  // deber�a validarse
   } 

   // devolver el n�mero de seguro social
   public String obtenerNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } 
   
   public void infoEmpleado(){
       this.establecerPrimerNombre(JOptionPane.showInputDialog(null, "Ingrese nombre del empleado: ", 
               "Nombre", 1));
       this.establecerApellidoPaterno(JOptionPane.showInputDialog(null, "Ingrese apellido del"
               + "empleado: ", "Apellido", 1));
       this.establecerNumeroSeguroSocial(JOptionPane.showInputDialog(null, "Ingrese numero seguro social: ", 
               "Numero Seguro Social", 1));
   }
   

   // devolver representaci�n String del objeto Empleado
   @Override
   public String toString()
   {
      return obtenerPrimerNombre() + " " + obtenerApellidoPaterno() +
         "\nNumero de Seguro Social: " + obtenerNumeroSeguroSocial()+"\n";
   } 

   // m�todo abstracto sobrescrito por las subclases
   public abstract double ingresos();
   
} // fin de la clase abstracta Empleado

