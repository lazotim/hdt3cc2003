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
    private final int LIMITECOLA = 10, CANTIDADCLIENTES = 1000;
    private Cliente clienteT;
    private int clientesEspera, clientesEnBanco;


    public Banco() {
        colas = new ColaListasC[4];
        colaTemp = new ColaListasC(CANTIDADCLIENTES);
        clientes = new Cliente[CANTIDADCLIENTES];
        clientesEspera = CANTIDADCLIENTES;
        clientesEnBanco = 0;
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

        
        
    }

    public void agregarCliente(Cliente cliente) {

        int colaVacia = 0;
        
        if(clientesEspera >0) {
            try {
            if(clientesEnBanco < 40) {
                for(int i =0; i < colas.length; i++) {
                    if(colas[i].cantidad() < colas[colaVacia].cantidad()) {
                        colaVacia = i;
                    }
                }

                colas[colaVacia].agregar(cliente);
                clientesEspera --;
                clientesEnBanco ++;

                System.out.println("Cliente " + cliente + " ingresado en cola #" + (colaVacia+1) );
            }
            else
            {
                while(clientesEspera > 0) {
                    colaTemp.retirar();
                    clientesEspera --;
                }
                throw new FullException("FullException");


            }
            }
            catch (FullException FE) {
                System.out.println("El banco se ha llenado");
                System.out.println("Todos los clientes que quedaron fuera se han ido");
            }

        }
        
    }

    public void sacarCliente() {
        if(clientesEnBanco > 0) {
            for(ColaAbstracta<Cliente> c: colas) {
                if(!c.vacio()) {
                    if(clientesEspera >0) {
                        if((c.verPrimero().getT1() + c.verPrimero().getT2()) < colaTemp.verPrimero().getT1()) {
                            System.out.println("Cliente " + c.verPrimero() + " se ha retirado");

                            c.retirar();
                            clientesEnBanco --;
                        }
                    }
                    else {
                        System.out.println("Cliente " + c.verPrimero() + " se ha retirado");
                        c.retirar();
                        clientesEnBanco--;
                        
                    }
                }

            }
        }
    }

    public void avanzar() {
        
         while(clientesEnBanco + clientesEspera > 0) {
            //sacarCliente();
            agregarCliente(colaTemp.retirar());
            sacarCliente();
            
        }
        

        
    }

    


}
