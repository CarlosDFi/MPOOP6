/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Nos permite conocer las caracteristicas de un coche y de sus pasajeros
 * @author Carlos Daniel Santiago
 * 
 */
public class Coche {
     String color, marca, placa;
    int modelo, numdeasiento;
    private Persona persona;
    /**
     * Describe las caracteristicas de un coche y sus pasajeros
     * @param color Describe el color del carro
     * @param marca Describe la marca del coche
     * @param placa Amota las placas del vehiculo 
     * @param modelo Describe el modelo del carro 
     * @param numdeasiento Enumera el asiento sobre el que se encuentran
     * @param Persona Toma una clase persona para que pueda ser asignada al coche
     */
    public Coche() {
       /**
        * constructor vacio
        */ 
    }

    public Coche(String color, String marca, String placa,int modelo, int numdeasiento ) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.numdeasiento = numdeasiento;
        this.persona = new Persona();
        /** 
         * Referenciamos las variables a ocupar asignandoles el tipo de caracter que recibe
         */
    }

    public Persona getPersona() {
        return persona;
        /**
         * Permite traer la clase Persona 
         */
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
