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
    private int inicio, fin;

    public ColaArreglos(int limite) {
        cantidad = 0;
        this.limite = limite;
        elementos = new Object[limite];
        inicio = 0;
        fin = 0;

    }

    @Override
    public void agregar(Object dato) {
        if(inicio < limite) {
            elementos[fin] = dato;
            fin++;
        }
        
    }

    @Override
    public Object remover() {
        if(inicio >= 0)
            return elementos[fin];
    }

}
