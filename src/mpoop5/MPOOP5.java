/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 * Clase principal 
 * @author alumno
 */
public class MPOOP5 {

    public static void main(String[] args) {
      Circulo cir= new Circulo();
      cir.SetRadio(5);
      cir.area();
      cir.perimetro();
      double radio= cir.getRadio();
      System.out.println("Radio"+radio);
      System.out.println(cir);
      System.out.println("##############################");
      /**
       * Imprime el radio del circulo
       */
        
      Circulo cir2 = new Circulo();
      cir2.SetRadio(-15);
      System.out.println("cir2"+cir2);
      System.out.println("############################");
      /**
       * Imprime el radio de un circulo con undoferente valor 
       */  
       
        Persona per1= new Persona();
        System.out.println(per1);
        per1.setNombre("Jorge");
        per1.setApellido("Ramirez");
        System.out.println(per1);
        Fecha fecha = new Fecha(2,3,1998);
        System.out.println(fecha);
        per1.setfNacimiento(fecha);
        System.out.println(per1);
        per1.setEdad(24);
        System.out.println(per1);
        System.out.println("###########################");
        /**
         * Asigna las caracteristicas a una persona
         */
        
        Fecha fecha2 = new Fecha(1,2,1997);
        Persona per2 = new Persona("Carlos","Gutierrez",fecha2,25);
        System.out.println("###################");
        /**
         * asigna una edad a las personas
         */
        
        Persona per3 = new Persona("Fernanda","Perez", new Fecha(3,3,2001),21);
        System.out.println("##########################");
        /**
         * Trabaja con la segunda forma de asignar una persona
         */
       Persona per4 = new Persona("Julieta","Anaya",21,4,9,200);
        System.out.println(per4);
    }
    
}
