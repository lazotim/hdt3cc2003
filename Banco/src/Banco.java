


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
    private ColaAbstracta<Evento> listaEventos;
    private Cliente[] clientes;
    private final int LIMITECOLA = 10, CANTIDADCLIENTES = 50;
    private Cliente clienteT;
    private int clientesEspera, clientesEnBanco, minutoActual, totalPermanencia;


    /**
     *
     */
    public Banco() {
        totalPermanencia = 0;
        listaEventos = new ColaArreglos(CANTIDADCLIENTES *2);
        minutoActual = 0;
        colas = new ColaArreglos[4];
        colaTemp = new ColaArreglos(CANTIDADCLIENTES);
        clientes = new Cliente[CANTIDADCLIENTES];
        clientesEspera = CANTIDADCLIENTES;
        clientesEnBanco = 0;
        for(int i = 0; i < colas.length; i++) {
            colas[i] = new ColaArreglos(LIMITECOLA);
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

    /**
     *
     * @param cliente
     */
    public void agregarCliente(Cliente cliente) {

        int colaVacia = 0;
        
        if(clientesEspera >0) {
            try {
                if(clientesEnBanco < 30) {
                    for(int i =0; i < colas.length; i++) {
                        if(colas[i].cantidad() < colas[colaVacia].cantidad()) {
                            colaVacia = i;
                        }
                    }
                    if(colas[colaVacia].vacio()) {
                        cliente.setMinutoSalida(cliente.getT1() + cliente.getT2());
                        cliente.setTiempoEspera(cliente.getT2());
                        totalPermanencia += cliente.getTiempoEspera();
                    }
                    else {
                        cliente.setMinutoSalida(colas[colaVacia].verUltimo().getMinutoSalida()+cliente.getT2());
                        cliente.setTiempoEspera(cliente.getMinutoSalida()-cliente.getT1());
                        totalPermanencia += cliente.getTiempoEspera();

                    }
                    //System.out.println(cliente.getTiempoSalida());
                    minutoActual = cliente.getMinutoSalida();
                    colas[colaVacia].agregar(cliente);
                    clientesEspera --;
                    clientesEnBanco ++;


                    //System.out.println("Cliente " + cliente + " ingresado en cola #" + (colaVacia+1) );
                    //listaEventos.agregar("Minuto " + cliente.getT1() + ": Cliente " + cliente + " ingresado en cola #" + (colaVacia+1) );
                    listaEventos.agregar(new EventoEntrada(cliente.getT1(), cliente.getT1(), cliente.getT2(), cliente.getTiempos(), colaVacia+1));
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
                //System.out.println("El banco se ha llenado");
                //listaEventos.agregar("El banco se ha llenado");
                listaEventos.agregar(new EventoOtro("El banco se ha llenado."));
                //System.out.println("Todos los clientes que quedaron fuera se han ido");
                //listaEventos.agregar("Todos los clientes que quedaron fuera se han ido");
                listaEventos.agregar(new EventoOtro("Todos los clientes que quedaron fuera se han ido"));

            }

        }
        
    }

    /**
     *
     */
    public void sacarCliente() {
        if(clientesEnBanco > 0) {
            for(ColaAbstracta<Cliente> c: colas) {
                if(!c.vacio()) {
                    if(clientesEspera >0) {                        
                        
                        //if((c.verPrimero().getT1() + c.verPrimero().getT2()) < colaTemp.verPrimero().getT1()) {
                        //minutoActual = c.verUltimo().getTiempoSalida();
                        
                        if(c.verPrimero().getMinutoSalida() <= colaTemp.verPrimero().getT1()) {
                            minutoActual = c.verPrimero().getMinutoSalida();

                            //System.out.println("Minuto " + (c.verPrimero().getT1() + c.verPrimero().getT2()) + ": Cliente " + c.verPrimero() + " se ha retirado");
                            //listaEventos.agregar("Minuto " + minutoActual + ": Cliente " + c.verPrimero() + " se ha retirado. Tiempo de permanencia: " + c.verPrimero().getTiempoEspera());
                            listaEventos.agregar(new EventoSalida(minutoActual, c.verPrimero().getT1(), c.verPrimero().getT2(), c.verPrimero().getTiempos(), c.verPrimero().getTiempoEspera()));
                            c.retirar();
                            clientesEnBanco --;
                        }
                    }
                    else {
                        //System.out.println("Cliente " + c.verPrimero() + " se ha retirado");
                        //listaEventos.agregar("Minuto " + minutoActual + ": Cliente " + c.verPrimero() + " se ha retirado");
                        listaEventos.agregar(new EventoSalida(minutoActual, c.verPrimero().getT1(), c.verPrimero().getT2(), c.verPrimero().getTiempos(), 0));
                        c.retirar();
                        clientesEnBanco--;
                        
                    }
                }

            }
        }
    }

    /**
     *
     */
    public void iniciar() {

        minutoActual = clientes[0].getT1();
        
         while(clientesEnBanco + clientesEspera > 0) {
            sacarCliente();
            agregarCliente(colaTemp.retirar());

        }

         while(!listaEventos.vacio())
             System.out.println(listaEventos.retirar());

         System.out.println("Promedio de permanencia del clente en el banco: " + totalPermanencia/CANTIDADCLIENTES);
         

        
    }

    


}
