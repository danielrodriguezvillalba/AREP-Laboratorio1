package edu.escuelaing.arem.ASE.app;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;



/**
 * Unit test for simple App.
 */
public class LinkedListsTest {
    Aplicacion aplicacion = new Aplicacion();
    
    /**
     * Iniciacion de pruebas
     */
    @Before
    public void setUpClass() {
        
    }
    
    /**
     * Prueba calcula la media de los datos dados
     * @exception LinkedListException
     */
    @Test
    public void testDeberiaCalcularMedia() throws LinkedListException {
        double resultadoReal = 550.6;
        aplicacion.agregarElemento(160);
        aplicacion.agregarElemento(591);
        aplicacion.agregarElemento(114);
        aplicacion.agregarElemento(229);
        aplicacion.agregarElemento(230);
        aplicacion.agregarElemento(270);
        aplicacion.agregarElemento(128);
        aplicacion.agregarElemento(1657);
        aplicacion.agregarElemento(624);
        aplicacion.agregarElemento(1503);
        double resProgram = aplicacion.media();
        assertTrue(resultadoReal == resProgram);
    }
    
    /**
     * Puebra que muestra que la media no se puede sacar en una lista vacia
     */
    @Test
    public void testNoDeberiaCalcularMediaListaVacia(){
        try {
            double media = aplicacion.media();
            fail("Se esperaba excepcion LinkedListException");
        } catch (LinkedListException ex) {
            
        }
    }
    
    /**
     * Prueba que calcula la desviacion estandar de los datos dados
     * @exception LinkedListException
     */
    @Test
    public void testDeberiaCalcularLaDesvEstandar() throws LinkedListException{
        double resultadoReal = 572.026844746915;
        aplicacion.agregarElemento(160);
        aplicacion.agregarElemento(591);
        aplicacion.agregarElemento(114);
        aplicacion.agregarElemento(229);
        aplicacion.agregarElemento(230);
        aplicacion.agregarElemento(270);
        aplicacion.agregarElemento(128);
        aplicacion.agregarElemento(1657);
        aplicacion.agregarElemento(624);
        aplicacion.agregarElemento(1503);
        double resProgram = aplicacion.desviacionEstandar();
        assertTrue(resultadoReal == resProgram);
    }
    
    /**
     * Puebra que muestra que la media no se puede sacar en una lista vacia
     */
    @Test
    public void testNoDeberiaCalcularDesviacionEstandarListaVacia(){
        try {
            double des = aplicacion.desviacionEstandar();
            fail("Se esperaba excepcion LinkedListException");
        } catch (LinkedListException ex) {
            
        }
    }
}
