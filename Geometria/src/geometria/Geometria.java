/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase publica llamada Geometria que implementa el metodo FiguraGeometrica
 * 
 * @author Daniel Salatti Barroso
 * @version 1.0
 * @since 13/12/2021
 */
public class Geometria {

    /**
     * Constructor del constructor principal
     * @param args Programa principal
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas 
        /**
         * Metodo consultor del atributo areaCuadrado
         * @return areaCuadrado area del cuadrado
         */
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        /**
         * Metodo consultor del atributo AreaRadio
         * @return AreaRadio del circulo
         */
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        /**
         * Metodo consultor del atributo AreaRectangulo
         * @return AreaRectangulo area del rectangulo
         */
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());
        /**
         * Metodo consultor del atributo areaTriangulo
         * @return areaTriangulo area del triangulo
         */
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
