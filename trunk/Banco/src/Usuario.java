/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class Usuario {

    private int t1, t2;

    public Usuario() {
        t1 = (int) (Math.random() * 120 + 1);
        t2 = (int) (Math.random() * 30 + 1);
    }

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

}
