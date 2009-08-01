/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class EventoEntrada extends Evento {

    private int cola;

    public EventoEntrada(int minEvento, int t1, int t2, String tiempos, int cola) {
        minutoEvento = minEvento;
        this.t1 = t1;
        this.t2 = t2;
        this.tiempos = tiempos;
        this.cola = cola;

    }

    @Override
    public String toString() {
        return "Minuto: " + minutoEvento + "| Cliente " + tiempos + " ha ingresado a la cola #" + cola;
    }
}
