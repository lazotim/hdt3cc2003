/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class EventoSalida extends Evento {

    private int tPermanencia;

    public EventoSalida(int minEvento, int t1, int t2, String tiempos, int tPermanencia) {
        minutoEvento = minEvento;
        this.t1 = t1;
        this.t2 = t2;
        this.tiempos = tiempos;
        this.tPermanencia = tPermanencia;
    }

    @Override
    public String toString() {
        return "Minuto: " + minutoEvento + "| Cliente " + tiempos + " se ha retirado. Tiempo de permanencia" + tPermanencia;
    }
}
