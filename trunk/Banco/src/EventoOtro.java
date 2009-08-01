/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class EventoOtro extends Evento {

    String descripcion;

    /**
     * 
     * @param descripcion
     */
    public EventoOtro(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
