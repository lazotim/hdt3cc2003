/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class ColaListasC<E> extends ColaAbstracta<E> {

    private Nodo<E> cola;
    private int cont;

    public ColaListasC() {
        cola = null;
        cont = 0;
    }

    @Override
    public void agregarPrimero(Object dato) {
        Nodo<E> temp = new Nodo<E>((E) dato);

        if(cola == null) {
            cola = temp;
            cola.setProximo(cola);
        }
        else {
            temp.setProximo(cola.getProximo());
            cola.setProximo(temp);
        }
    }

    @Override
    public void agregarUltimo(Object dato) {
        agregarPrimero(dato);
        cola = cola.getProximo();
    }

    @Override
    public E removerUltimo() {
        Nodo<E> finger = cola;

        while(finger.getProximo() != cola) {
            finger = finger.getProximo();
        }

        Nodo<E> temp = cola;
        if(finger == cola) {
            cola = null;
        }
        else {
            finger.setProximo(cola.getProximo());
            cola = finger;
        }

        cont --;

        return temp.dato();
    }



}
