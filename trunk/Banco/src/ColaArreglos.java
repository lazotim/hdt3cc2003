/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @param <E>
 * @author dvdhl89
 */
public class ColaArreglos<E> extends ColaAbstracta {

    private Object[] elementos;
    private int inicio, fin, indice;

    /**
     * 
     * @param limite
     */
    public ColaArreglos(int limite) {
        cantidad = 0;
        this.limite = limite;
        elementos = new Object[this.limite];
        elementos[0] = null;
        inicio = 0;
        fin = 0;

    }

    /**
     *
     * @param dato
     */
    @Override
    public void agregar(Object dato) {
        try {
            if(cantidad < limite) {
                if(fin >= limite)
                    fin = 0;
                elementos[fin] = dato;
                cantidad ++;
                fin++;
            } else if(cantidad >= limite) {
                throw new FullException("Cola llena");
            }
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
        if(cantidad > 0) {
            if(inicio >= limite)
                inicio = 0;
            inicio ++;
            cantidad --;
            return (E)elementos[inicio-1];
        }
        else
            return null;
    }

    /**
     *
     * @return
     */
    public E verPrimero() {
        if(vacio())
            return null;
        if(inicio >= limite)
            inicio = 0;
        return (E)elementos[inicio];
        
    }

    /**
     *
     * @return
     */
    public E verUltimo() {
        if(vacio())
            return null;
        return (E)elementos[fin-1];

    }

}
