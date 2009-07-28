/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public interface InterfazCola<E> {

    public void agregarPrimero(E dato);


    public void agregarUltimo(E dato);

    public E removerUltimo();

}
