/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import clasesAbstractas.PoligonoAbstracto;
import clasesAbstractas.TrianguloA;
import Interfaces.Flauta;
import Interfaces.InstrumentoMusical;
import calendario.Meses;

/**
 *
 * @author alumno
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("####Las Clases se comportan como  sus padres####");
        Poligono poligono = new Poligono();
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Object objeto = new Object();
        
        objeto = poligono;
        System.out.println(objeto);
        
        poligono = triangulo;
        System.out.println(poligono);
        
        poligono = cuadrilatero;
        System.out.println(poligono);
        
        //triangulo = poligono; -> no se puede
        //triangulo = cuadrilatero; -> no se puede
        
        objeto = triangulo;
        System.out.println(objeto);
        */
        System.out.println("####Clases Abstractas####");
        //PoligonoAbstracto pol = new PoligonoAbstracto(); -> No se puede
        PoligonoAbstracto pol;
        pol = new TrianguloA();
        System.out.println(pol);
        
        System.out.println("####Interfaces####");
        
        InstrumentoMusical instrumento;
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        
        System.out.println("####Interfaces como almacenes");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-33));
        
        System.out.println("El mes " + Meses.DOS + " corresponde a " + Meses.NOMBRES_MESES[Meses.DOS]);
        
    }
    
}
