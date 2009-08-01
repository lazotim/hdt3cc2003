/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @param <E>
 * @author dvdhl89
 */
public abstract class ColaAbstracta<E> implements InterfazCola{

    /**
     *
     */
    /**
     *
     */
    protected int limite, cantidad;

    /**
     *
     * @param dato
     */
    public void agregar(Object dato) {
        cantidad ++;
    }

    /**
     *
     * @return
     */
    public E retirar() {
        cantidad --;
        return null;
    }

    /**
     *
     * @return
     */
    public abstract E verPrimero();

    /**
     *
     * @return
     */
    public abstract E verUltimo();

    /**
     *
     * @return
     */
    public boolean lleno() {
        if(cantidad >= limite)
            return true;
        return false;
    }

    /**
     * 
     * @return
     */
    public boolean vacio() {
        if(cantidad == 0)
            return true;
        return false;
    }

    /**
     *
     * @return
     */
    public int cantidad() {
        return cantidad;
    }
}
