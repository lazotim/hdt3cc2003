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
        elementos[0] = null;
        inicio = 0;
        fin = 0;

    }

    @Override
    public void agregar(Object dato) {
        if(inicio == fin && cantidad == 0) {
            elementos[inicio] = dato;
        } else if(fin >= limite) {
            if(elementos[0] == null) {
                inicio = fin;
                fin = 0;
            }
        } else {
            fin ++;
            inicio ++;
        }
        
    }

    @Override
    public Object remover() {
        if(inicio >= 0)
            return elementos[fin];
    }

}
