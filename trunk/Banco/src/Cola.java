/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class Cola<E> {

    private Nodo<E> cola;
    private int cont;

    public Cola() {
        cola = null;
        cont = 0;
    }

    public void agregar(E dato) {
        Nodo<E> temp = new Nodo<E>(dato);

        if(cola == null) {
            cola = temp;
            cola.setProximo(cola);
        }
        else {
            temp.setProximo(cola.getProximo());
            cola.setProximo(temp);
        }
    }
}
