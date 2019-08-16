/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 * Clase Nodo
 * @author 2115253
 */
public class Nodo {
    private Nodo next;
    private int dato;

    public Nodo( int dato ) {
        this.dato = dato;
    }
    
    /**
     * Metodo que cambia el apuntador siguiente del nodo
     * @param next Nodo por el cual se va a cambiar el apuntador Siguiente
     */
    public void addNext( Nodo next){
        this.next = next;
    }
    
    public int getDato(){
        return dato;
    }
    
    public Nodo getNext(){
        return next;
    }
}
