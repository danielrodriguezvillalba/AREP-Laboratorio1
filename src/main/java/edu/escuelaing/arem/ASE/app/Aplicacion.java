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
    
    public int media() throws LinkedListException{
        if(lista.cantidad() == 0){
            throw new LinkedListException("Lista vacia para sacar la media");
        }
        else{
            for(Node actual: lista){
                
            }
        }
    }
}
