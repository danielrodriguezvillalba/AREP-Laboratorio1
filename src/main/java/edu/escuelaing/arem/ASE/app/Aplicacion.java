/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author 2115253
 */
public class Aplicacion {
    LinkedLists lista ;

    public Aplicacion() {
        lista = new LinkedLists();
    }
    
    public void agregarElemento( int dato ) {
        lista.agregarNodo(dato);
    }
    
    public void eliminarElemento( ) throws LinkedListException{
        lista.eliminarNodo();
    }
    
    public double media() throws LinkedListException{
        double med = 0;
        if(lista.cantidad() == 0){
            throw new LinkedListException("Lista vacia para sacar la media");
        }
        else{
            for(int i=0 ;i<lista.cantidad() ; i++){
                med += lista.getElemento(i).getDato();
            }
        }
        med = med/lista.cantidad();
        return med;
    }
    
    public double desviacionEstandar() throws LinkedListException{
        double med = media();
        double desvEst = 0;
        for(int i=0 ;i<lista.cantidad() ; i++){
            desvEst += Math.pow(Math.abs(lista.getElemento(i).getDato()-med),2);
        }
        desvEst = desvEst/(lista.cantidad()-1);
        desvEst = Math.pow(desvEst,0.5);
        System.out.println("Dato " + desvEst);
        return desvEst;
    }
}
