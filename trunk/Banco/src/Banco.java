/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class Banco {

    private ColaAbstracta[] colas;
    private Cliente[] clientes;
    private final int LIMITECOLA = 5;
    private Cliente clienteT;


    public Banco() {
        colas = new ColaListasC[4];
        clientes = new Cliente[10];
        for(int i = 0; i < colas.length; i++) {
            colas[i] = new ColaListasC(LIMITECOLA);
        }

        for(int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
        }

        for(int i=0; i < clientes.length - 1; i++)
            for(int j = i+1; j < clientes.length; j++) {
                
                if(clientes[i].getT1() > clientes[j].getT1()) {
                    System.out.println(clientes[i].getT1());
                   
                   
                    
                    
                    clientes[i] = clientes[j];
                    clientes[j] = clientes[i];
                }
            }

        

        for(Cliente c: clientes) {
            int menor = 0;
            for(int i = 0; i < colas.length; i++) {
                if(colas[i].cantidad() < menor)
                    menor = i;
                colas[i].agregar(c);
            }
        }

        for(int i = 0; i < clientes.length; i++)
            System.out.println(clientes[i].getT1());

        /*

            Para i=0\, hasta n-2\, haga lo siguiente:

        Para j=i+1\, hasta n-1\, haga lo siguiente:

            Si a_i>a_j\, entonces:

                \left(a_i,a_j\right)\gets\left(a_j,a_i\right)


        */
    }

}
