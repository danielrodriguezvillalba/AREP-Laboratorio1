/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.util.ArrayList;



/**
 * Clase LinkedList
 * @author 2115253
 */
public class LinkedLists {
    private Nodo head, tail;
    private int longitud;

    public LinkedLists() {
        longitud = 0;
    }
    
    public void agregarNodo( int dato ) {
        Nodo temporal = new Nodo(dato);
        if(longitud == 0){
            head = temporal;
            tail = temporal;
        }
        else{
            tail.addNext(temporal);
            tail = temporal;
        }
        longitud++;
    }
    
    public void eliminarNodo() throws LinkedListException{
        if(longitud == 1){
            tail = null;
            head = null;
        }
        else if(longitud == 0){
            throw new LinkedListException("Lista vacia, no se puede eliminar nada");
        }
        else{
            
            Nodo fin = getElemento(longitud-1);
            tail = fin;
            fin.addNext(null);
        }
        longitud--;
    }
    
    public int cantidad(){
        return longitud;
    }
    
    public Nodo getElemento( int pos ) throws LinkedListException{
        if (pos == 0){
            return head;
        }
        else if (pos < longitud){
            Nodo temp = head;
            for(int i=0; i< pos ;i++){
                temp = temp.getNext();
            }
            return temp;
        }
        else{
            throw new LinkedListException("Esta pidiendo un numero fuera de la Lista");
        }
        
    }
}