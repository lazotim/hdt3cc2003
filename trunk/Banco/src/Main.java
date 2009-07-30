//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Hoja de Trabajo #3
//David Ytzen Hsieh Lo #08825


import java.util.Random;
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
        Banco banco = new Banco();

        Random random = new Random();
        
        //for(int i = 0; i < 10; i++)
        //    System.out.println(random.nextInt(200));


        /*
        InterfazCola<String> cola = new ColaListasC(7);
        int opcion = ' ';

        

        while (opcion != 's') {



          System.out.println("a: Agregar, r: Retirar, s: Salir");
          opcion = lector.next().charAt(0);

          switch(opcion) {
              case 'a':
                  cola.agregar(lector.next());
              break;

              case 'r':
                  System.out.println(cola.retirar());
              break;

              default:
                  System.out.println("O incorrecta");
          }
    
        }*/
    }

}
