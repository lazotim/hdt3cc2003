/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @param <E> 
 * @author dvdhl89
 */
public interface InterfazCola<E> {

    /**
     *
     * @param dato
     */
    public void agregar(E dato);

    /**
     *
     * @return
     */
    public E retirar();

    /**
     *
     * @return
     */
    public E verPrimero();

}
