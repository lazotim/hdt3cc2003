/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dvdhl89
 */
public class ColaArreglosTest {

    /**
     *
     */
    public ColaArreglosTest() {
    }

    /**
     *
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        ColaAbstracta instance = new ColaArreglos(3);
        instance.agregar("PRIMERO");
        instance.agregar("SEGUNDO");
        instance.agregar("TERCERO");
        Object result = instance.lleno();
        Object expResult = true;
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        ColaAbstracta instance = new ColaArreglos(3);
        instance.agregar("PRIMERO");
        instance.agregar("SEGUNDO");
        instance.retirar();
        instance.retirar();
        Object result = instance.vacio();
        Object expResult = true;
        assertEquals(expResult, result);
    }
    
    /**
     * 
     */
    @Test
    public void testAgregarRetirar() {
        System.out.println("Agregar y Retirar");
        ColaAbstracta instance = new ColaArreglos(3);
        instance.agregar("PRIMERO");
        instance.agregar("SEGUNDO");
        instance.agregar("TERCERO");
        Object result = instance.retirar();
        Object expResult = "PRIMERO";
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void verPrimero() {
        System.out.println("verPrimero");
        ColaArreglos instance = new ColaArreglos(3);
        instance.agregar("PRIMERO");
        instance.agregar("SEGUNDO");
        instance.agregar("TERCERO");
        Object result = instance.verPrimero();
        Object expResult = "PRIMERO";
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void verUltimo() {
        System.out.println("VerUltimo");
        ColaArreglos instance = new ColaArreglos(5);
        instance.agregar("PRIMERO");
        instance.agregar("SEGUNDO");
        instance.agregar("TERCERO");
        instance.agregar("CUARTO");
        instance.agregar("QUINTO");
        Object result = instance.verUltimo();
        Object expResult = "QUINTO";
        assertEquals(expResult, result);
    }

}