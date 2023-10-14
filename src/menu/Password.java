/**
 * Ejercicio 1.5
 */
package menu;
import java.util.Scanner;

/** En esta clase pediremos al usuario que introduzca una contraseña para acceder al almacén.
 * Solo podrá entrar si acierta la contraseña en un máximo de 3 intentos.
 *
 * @author anabel
 */
public class Password {
    int pass = 740951;
    
    Scanner scanner = new Scanner(System.in);
    
    public void pedirPassword() {
        int intentos = 0;
        do {
            int in = scanner.nextInt();
            if(in == pass) {
                System.out.println("Contraseña correcta. Puerta desbloqueada.");
                break;
            }
            intentos++;
            System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            System.out.println("Restan " + (3 - intentos) + " intentos");
        } while(intentos < 3);
    }
}
