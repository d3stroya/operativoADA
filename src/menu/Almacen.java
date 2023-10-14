/**
 * Ejercicio 1.4.c
 */
package menu;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Almacen {
    Scanner entrada = new Scanner(System.in);
    
    void mostrarMenu() {
        System.out.println("1. Abrir armario 1");
        System.out.println("2. Abrir armario 2");
        System.out.println("3. Abrir armario 3");
        System.out.println("4. Abrir armario 4");
        System.out.println("5. Buscar arma");
        System.out.println("6. Buscar municion");
        System.out.println("7. Crear arma");
        System.out.println("8. Modificar arma");
        System.out.println("9. Eliminar arma");
        System.out.println("10. Salir");
        
        int opcion = entrada.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("abrirArmario1();");
                break;
            case 2:
                System.out.println("abrirArmario2();");
                break;
            case 3:
                System.out.println("abrirArmario3();");
                break;
            case 4:
                System.out.println("abrirArmario1();");
                break;
            case 5: 
                System.out.println("buscarArma();");
                break;
            case 6:
                System.out.println("buscarMunicion();");
                break;
            case 7:
                System.out.println("crearArma();");
                break;
            case 8:
                System.out.println("modificarArma();");
                break;
            case 9:
                System.out.println("eliminarArma();");
                break;
            case 10:
                break;
            default:
                System.out.println("Por favor, introduce una opcion valida.");
        }   
    }
}
