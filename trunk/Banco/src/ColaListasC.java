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

    public ColaListasC(int limite) {
        cantidad = 0;
        this.limite = limite;
        cola = null;
    }

    @Override
    public void agregar(Object dato) {

        if(!lleno()) {
            Nodo<E> temp = new Nodo<E>((E) dato);

            if(cola == null) {
                cola = temp;
                cola.setProximo(cola);
            }
            else {
                temp.setProximo(cola.getProximo());
                cola.setProximo(temp);
            }

            cantidad ++;
        }
    }

    
    @Override
    public void agregarPrimero(Object dato) {
        agregar(dato);
        cola = cola.getProximo();
    }

    @Override
    public E retirar() {

        if(vacio())
            return null;

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

        cantidad --;

        return temp.dato();
    }



}
