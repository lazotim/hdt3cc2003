//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Hoja de Trabajo #3
//David Ytzen Hsieh Lo #08825


import java.util.Scanner;

/**
 *
 * @author David Hsieh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        InterfazCola cola = new ColaListasC();

        System.out.println("Ingrese: ");
        cola.agregar(lector.next());
        cola.agregar(lector.next());
        cola.agregar(lector.next());
        System.out.println(cola.remover());
        System.out.println(cola.remover());
        System.out.println(cola.remover());
    }

}
