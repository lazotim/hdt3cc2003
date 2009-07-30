/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public class Banco {

    private ColaAbstracta<Cliente>[] colas;
    private ColaAbstracta<Cliente> colaTemp;
    private Cliente[] clientes;
    private final int LIMITECOLA = 5;
    private Cliente clienteT;


    public Banco() {
        colas = new ColaListasC[4];
        colaTemp = new ColaListasC(50);
        clientes = new Cliente[10];
        for(int i = 0; i < colas.length; i++) {
            colas[i] = new ColaListasC(LIMITECOLA);
        }

        for(int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
        }

        for(int i=0; i < clientes.length - 1; i++) {
            for(int j = i+1; j < clientes.length; j++) {
                
                if(clientes[i].getT1() > clientes[j].getT1()) {
                    
                    clienteT = clientes[i];
                    clientes[i] = clientes[j];
                    clientes[j] = clienteT;
                }
            }
        }

        
        
        for(Cliente c: clientes)
            colaTemp.agregar(c);

        
        
        for(int i =0; i < clientes.length; i++)
            System.out.println(colaTemp.retirar().getT1());
        

        
        
    }

    


}
