/**
 * Ejercicio 1.4.b
 */
package menu;
import java.util.Scanner;

/** En esta clase vamos a crear varios personajes Policía
 * y crearemos un método para elegir a uno de ellos a través de un menú.
 *
 * @author anabel
 */
public class Comisaria {
    Scanner scanner = new Scanner(System.in);
    DescifrarMensaje cifrado = new DescifrarMensaje();
    
    public Comisaria() {
    }
    
    void mostrarMenu() {
        System.out.println("Elige acción:");
        System.out.println("1. Elegir personaje");
        System.out.println("2. Descifrar mensaje");
        System.out.println("3. Salir");
        
        int accion = scanner.nextInt();
        
        switch(accion) {
            case 1:
                System.out.println("TODO: modelar policías");
                break;
            case 2:
                cifrado.solicitarRotacion();
                break;
            case 3:
                break;
            default:
                System.out.println("Por favor, introduce un valor correcto.");
        }
    }
    
}
