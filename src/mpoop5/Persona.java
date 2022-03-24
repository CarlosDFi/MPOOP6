/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Permite creal personas
 * @author alumno
 */
public class Persona {
   
   private String nombre;
   private String apellido;
   private Fecha fNacimiento;
   private int edad;
   /**
    * Crea una persona que recibe 4 parametros
    * @param nombre Recibe el nombre de la persona. 
    * @param apellido Recibe el apellido de la persona. 
    * @param fnacimiento Asigna la fecha de nacimiento de la persona.
    * @param edad Recibe la edad de la persona
    */
    public Persona() {
        /**
         * constructor vacio
         */
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.edad = edad;
        /** 
         * Referenciamos las variables a ocupar asignandoles el tipo de caracter que recibe
         */
    }

    public Persona(String nombre, String apellido, int edad, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fNacimiento = new Fecha(dia,mes,anio);
       /** 
         * Referenciamos las variables a ocupar asignandoles el tipo de caracter que recibe de diferente manera
         */
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public int getEdad() {
        return edad;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + ", edad=" + edad + '}';
    }
    
}
