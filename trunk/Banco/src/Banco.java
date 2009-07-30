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
    private Cliente[] clientes;
    private final int LIMITECOLA = 5;

    public Banco() {
        colas = new ColaListasC[4];
        clientes = new Cliente[10];
        for(InterfazCola a: colas) {
            a = new ColaListasC(LIMITECOLA);
        }
        for(Cliente c: clientes) {
            c = new Cliente();
        }

        
    }

}
