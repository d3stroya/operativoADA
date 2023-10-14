/**
 * Ejercicio 1.4.a
 * Ejercicio 1.6
 */

package menu;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Main {

    public static void main(String[] args) {
        
        // EJERCICIO 1.4.a
        // Mostramos el menú de opciones
        System.out.println("Elige una opción:");
        System.out.println("1. Entrar al almacén");
        System.out.println("2. Entrar en la comisaría");
        System.out.println("3. Ir a zona de exclusión");
        System.out.println("4. Intervenir en el refugio");
        System.out.println("5. Salir");
        
        // Le pedimos al usuario que seleccione una opción
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        
        // Realizamos acciones en función de la opción elegida
        switch(opcion) {
            case 1:
                System.out.println("Aquí pediremos una contraseña.");
//                Password password = new Password();
//                password.pedirPassword();                
                break;
            case 2:
                System.out.println("Entrando en la comisaría...");
                Comisaria comisaria = new Comisaria();
                comisaria.mostrarMenu();
                break;
            case 3:
                System.out.println("¡Cuidado! Zona restringida. Alta radiación.");
                break;
            case 4: 
                System.out.println("Antes de entrar al refugio necesitas prepararte.");
                break;
            case 5:
                break;
            default:
                System.out.println("Por favor, elige una opción válida.");
        }
        
        
/*        
        // EJERCICIO 1.6. Expendedor de balas
        // 1. Creo las variables que necesito
        int cartucho50, cartucho20, cartucho10, balasSueltas, numBalas;
        Scanner entrada = new Scanner(System.in);
    
        // Le pido al usuario un dato de entrada
        System.out.println("¿Cuántas balas necesitas?");
        numBalas = entrada.nextInt();
        
        // Creo una copia del dato que ha insertado el usuario, para no perderlo.
        int copiaNumBalas = numBalas;
        
        // Ahora vamos descomponiendo el número de balas en cartuchos de la manera más óptima posible
        cartucho50 = numBalas / 50;
        numBalas %= 50;
        cartucho20 = numBalas / 20;
        numBalas %= 20;
        cartucho10 = numBalas / 10;
        balasSueltas = numBalas % 10;
        
        // Imprimimos el resultado para mostrárselo al usuario
        System.out.println("Aquí tienes:");
        
        if(cartucho50 != 0) {
            System.out.println(cartucho50 + " cartuchos de 50");
            
        }
        if(cartucho20 != 0) {
            System.out.println(cartucho20 + " cartuchos de 20");
        }
        if(cartucho10 != 0) {
            System.out.println(cartucho10 + " cartuchos de 10");
        }
        if(balasSueltas != 0) {
            System.out.println(balasSueltas + " bala(s) sueltas");
        }
*/
    }
}
