
/**
 *
 * @author dvdhl89
 * @param <E>
 */
public class Nodo<E> {
    private E dato;
    private Nodo<E> proxElemento;

    /**
     *
     * @param proxDato
     * @param proxElemento
     */
    public Nodo(E proxDato, Nodo<E> proxElemento) {
        dato = proxDato;
        this.proxElemento= proxElemento;
    }

    /**
     *
     * @param dato
     */
    public Nodo(E dato) {
        this(dato, null);
    }

    /**
     *
     * @return
     */
    public Nodo<E> getProximo() {
        return proxElemento;
    }

    /**
     * 
     * @param proxElemento
     */
    public void setProximo(Nodo<E> proxElemento) {
        this.proxElemento = proxElemento;
    }

    /**
     *
     * @return
     */
    public E dato() {
        return dato;
    }

    /**
     *
     * @param dato
     */
    public void setDato(E dato) {
        this.dato = dato;
    }

}
