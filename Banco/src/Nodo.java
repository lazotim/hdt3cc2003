
public class Nodo<E> {
    private E dato;
    private Nodo<E> proxElemento;

    public Nodo(E proxDato, Nodo<E> proxElemento) {
        dato = proxDato;
        this.proxElemento= proxElemento;
    }

    public Nodo(E dato) {
        this(dato, null);
    }

    public Nodo<E> getProximo() {
        return proxElemento;
    }

    public void setProximo(Nodo<E> proxElemento) {
        this.proxElemento = proxElemento;
    }

    public E dato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

}
