/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @param <E>
 * @author dvdhl89
 */
public class ColaListasC<E> extends ColaAbstracta<E> {

    private Nodo<E> cola;

    /**
     *
     * @param limite
     */
    public ColaListasC(int limite) {
        cantidad = 0;
        this.limite = limite;
        cola = null;
    }

    /**
     *
     * @param dato
     */
    @Override
    public void agregar(Object dato) {

        try {
            if(!lleno()) {
                Nodo<E> temp = new Nodo(dato);

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
        
            else if(lleno())
                throw new FullException("Cola llena");
        }
        
        catch (FullException fe) {
            System.out.println("ERROR, cola  llena");
            
        }
    }

    /**
     *
     * @return
     */
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

        return (E)temp.dato();
    }

    /**
     *
     * @return
     */
    public E verPrimero() {
        if(vacio())
            return null;

        return (E)cola.dato();
    }

    /**
     * 
     * @return
     */
    public E verUltimo() {

        Nodo<E> temp = cola;
        if(cantidad == 1)
            return (E)cola.dato();
        if(vacio())
            return null;
        temp = temp.getProximo();
        return  (E) cola.getProximo().dato();
    }



}
