/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete06.Imprimir;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, 
                                                                valorB);
        /*
        importo a la clase imprimir que se encientra en el paquete06
        la cual tiene un metodo llamado imprimirMensaje que resive 4 parametros 
        y los presemta en pantalla en un mensaje construido
        */
        
        Imprimir.imprimirMensaje(valorA, valorB,suma,multiplicacion);
    }

    
}
