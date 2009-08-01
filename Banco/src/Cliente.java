
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

    private int t1, t2, minutoSalida, tiempoEspera;
    private Random random;

    /**
     *
     */
    public Cliente() {
        
        random = new Random();
        t1 = random.nextInt(480) + 1;
        t2 = random.nextInt(30) + 1;
        tiempoEspera = t2;
    }

    /**
     *
     * @return
     */
    public int getT1() {
        return t1;
    }

    /**
     * 
     * @return
     */
    public int getT2() {
        return t2;
    }

    @Override
    public String toString() {
        return "("+t1 +", " + t2 + ")";
    }

    /**
     *
     * @param tS
     */
    public void setMinutoSalida(int tS) {
        minutoSalida = tS;
    }

    /**
     *
     * @return
     */
    public int getMinutoSalida() {
        return minutoSalida;
    }

    /**
     *
     * @param tE
     */
    public void setTiempoEspera(int tE) {
        tiempoEspera = tE;
    }

    /**
     *
     * @return
     */
    public int getTiempoEspera() {
        return tiempoEspera;
    }

    /**
     *
     * @return
     */
    public String getTiempos() {
        return "(" + t1 + ", " + t2 + ")";
    }
/*
    public void setT1(int t1) {
        this.t1 = t1;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public void copiar(Cliente c) {
        t1 = c.getT1();
        t2 = c.getT2();
    }
*/
}
