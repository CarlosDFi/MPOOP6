/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Este metodo nos servira para calcular el radio y el perimetro y el area de un circulo
 * @author Carlos Daniel Santiago López
 */
public class Circulo {

 static double PI = 3.1416;

 private double radio;
/**
 * Crea un circulo que recibe dos parametros 
 * @param PI valor constante de pi
 * @param radio radio del circulo 
 */
   public Circulo() {
   /**
    * consturctor vacio 
    */
   }   
 
    public Circulo(double radio){
        this.radio = radio;
        /**
         * asigna los valores que recibira radio
         */
    }
    
    
   public void perimetro(){
   
       double perimetro = 2 * PI * radio;
       System.out.println("Perimetro:"+perimetro);
       /**
        * Utilliza el parametro recibido y ejecuta la formula para obtener el perimtro
        * @param radio Radio recibido
        */
   }
   
   public void area(){
   
       double area= PI * radio * radio;
       System.out.println("Area:"+area);
       /**
        * Utiliza el parametro recibido y ejecuta la formula para obtener el area del circulo
        * @param radio Radio recibido
        */
    }
   public double getRadio(){
   return radio;
   /**
    * Permite que trabajemos con radio en el main
    */
   }
   
   public void SetRadio(double radio){
       if(radio<0){
     radio = 1;
    }
       this.radio= radio;
       /**
        * Devuelve el valor modificado en el main
        */
   }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

 
 
    
}
