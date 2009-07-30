/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public abstract class ColaAbstracta<E> implements InterfazCola{

    protected int limite, cantidad;

    public void agregar(Object dato) {
        cantidad ++;
    }

    public E retirar() {
        cantidad --;
        return null;
    }

    public abstract E verPrimero();

    public boolean lleno() {
        if(cantidad >= limite)
            return true;
        return false;
    }

    public boolean vacio() {
        if(cantidad == 0)
            return true;
        return false;
    }

    public int cantidad() {
        return cantidad;
    }
}
