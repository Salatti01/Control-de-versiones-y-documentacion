/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Circulo implements FiguraGeometrica 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

public Circulo(double radio) 
    {
        this.radio = radio;
    }
/**
*Metodo consultor del atributo radio
*@return Radio del cicurlo
 */
    public double getRadio() 
    {
        return radio;
    }
/**
 * Metodo modificador del atributo radio
 * @param radio Radio del circulo asociado
*/
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
/**
 * Metodo consultor del atributo areaRadio
 * @return areaRadio  del circulo
 */
    public double getAreaRadio() 
    {
        return areaRadio;
    }

    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
