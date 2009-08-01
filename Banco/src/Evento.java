/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public abstract class Evento {

    protected String tiempos;
    protected int minutoEvento, t1, t2;

    public void setT1(int t1) {
        this.t1 = t1;

    }

    public void setT2(int t2) {
        this.t2 = t2;

    }

    public void setMinutoEvento(int minutoEvento) {
        this.minutoEvento = minutoEvento;
    }



}
