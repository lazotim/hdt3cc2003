/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class Cliente {

    private int t1, t2;

    public Cliente() {
        t1 = (int) (Math.random() * 480 + 1);
        t2 = (int) (Math.random() * 30 + 1);
    }

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

}
