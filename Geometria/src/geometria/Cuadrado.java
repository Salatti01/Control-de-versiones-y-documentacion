/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase publica llamada Cuadrado que implementa el metodo FiguraGeometrica
 * @author Daniel Salatti Barroso
 * @version 1.0
 * @since 13/12/2021
 */
public class Cuadrado implements FiguraGeometrica
{
    /*Atributo que contiene el lado del Cuadrado*/
    private double lado;
    /*Atributo que contiene el area del Cuadrado*/
    private double areaCuadrado;
    /*Constructor que pone la base y la altura*/
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
   /**
    *Metodo consultor del atributo lado
    * @return lado del cuadrado
    */
    public double getLado() 
    {
        return lado;
    }
    /**
     * Metodo modificador del atributo lado 
     * @param lado lado del cuadrado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Metodo consultor del atributo area
     * @return area del cuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}