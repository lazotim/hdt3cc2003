/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class Banco {

    private InterfazCola[] colas;

    public Banco() {
        colas = new ColaListasC[4];
        for(InterfazCola a: colas) {
            a = new ColaListasC();
        }
    }

}
