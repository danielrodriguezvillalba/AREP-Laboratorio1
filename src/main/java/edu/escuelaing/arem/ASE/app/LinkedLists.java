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
    private ArrayList<Nodo> lista;

    public LinkedLists() {
        lista = new ArrayList<Nodo>();
    }
    
    public void agregarNodo( int dato ) {
        Nodo temporal = new Nodo(dato);
        if(lista.size() == 0){
            head = temporal;
            tail = temporal;
        }
        else{
            tail = temporal;
            Nodo fin = lista.get(lista.size()-1);
            fin.addNext(temporal);
        }
        lista.add(temporal);
    }
    
    public void eliminarNodo() throws LinkedListException{
        if(lista.size() == 1){
            lista.remove(lista.size()-1);
            tail = null;
            head = null;
        }
        else if(lista.size() == 0){
            throw new LinkedListException("Lista vacia, no se puede eliminar nada");
        }
        else{
            lista.remove(lista.size()-1);
            Nodo fin = lista.get(lista.size()-1);
            tail = fin;
        }
    }
}
