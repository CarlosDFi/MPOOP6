/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Nos permite obtener funciones de esta clase para aprovecharlas en la creacionde otras clases
 * @author alumno
 */
public class Fecha {
    
 private int dia;
 private int mes;
 private int anio;

 /**
  * Asigna una fecha
  * @param dia Recibe un dia
  * @param mes Recibe un mes
  * @param anio Recine un año 
  */
public Fecha() {
    /**
     * constructor vacio
     */
}

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        /** 
         * Referenciamos las variables a ocupar asignandoles el tipo de caracter que recibe
         */
    }

    public int getDia() {
        return dia;
        /**
         * Permite extraer dia de la clase
         */
    }

    public void setDia(int dia) {
        this.dia = dia;
        /**
         * Permite modificar dia desde otra clase
         */
    }

    public int getMes() {
        return mes;
        /**
         * Permite extraer mes de la clase
         */
    }

    public void setMes(int mes) {
        this.mes = mes;
        /**
        * Permite modificar mes desde otra clase
        */
    }

    public int getAnio() {
        return anio;
        /**
         * Permite extraer año de la clase
         */
    }

    public void setAnio(int anio) {
        this.anio = anio;
        /**
        * Permite modificar año desde otra clase
        */
    }

    @Override
    public String toString() {
        return dia+ "/"+mes+"/"+anio;
    }
    
   
}
