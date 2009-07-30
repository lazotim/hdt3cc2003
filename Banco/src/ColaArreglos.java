/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class ColaArreglos<E> extends ColaAbstracta {

    private Object[] elementos;
    private int inicio, fin, indice;

    public ColaArreglos(int limite) {
        cantidad = 0;
        this.limite = limite;
        elementos = new Object[this.limite];
        elementos[0] = null;
        inicio = 0;
        fin = 0;

    }

    @Override
    public void agregar(Object dato) {
        if(cantidad < limite) {
            if(fin >= limite)
                fin = 0;
            elementos[fin] = dato;
            cantidad ++;
            fin++;
        }
        for(Object o: elementos)
            System.out.println(o);
        
        
    }

    @Override
    public Object retirar() {
        if(cantidad > 0) {
            if(inicio >= limite)
                inicio = 0;
            inicio ++;
            cantidad --;
            return elementos[inicio-1];
        }
        else
            return null;
    }

}