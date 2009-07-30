
import java.util.Random;

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
    private Random random;

    public Cliente() {
        random = new Random();
        t1 = random.nextInt(480);
        t2 = random.nextInt(30);
    }

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

}
