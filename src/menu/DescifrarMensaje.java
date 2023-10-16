/** Ejercicio 1.7
 * Esta función nos permite rotar los caracteres de un mensaje hacia la derecha
 * o hacia la izquierda para cifrar o descifrar respectivamente.
 * Trabajaremos con cadenas de caracteres, bucles y entrada y salida por teclado y pantalla.
 *
 * Source: https://parzibyte.me/blog/2019/05/23/cifrado-cesar-java-algoritmo/
 * Source: https://puntocomnoesunlenguaje.blogspot.com/2016/02/cifrado-cesar-java.html
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class DescifrarMensaje {

    Scanner entrada = new Scanner(System.in);

    /* Definimos las constantes que nos permitan trabajar con el alfabeto
    *  El abecedario tiene 26 letras. Si la rotación nos lleva a números superiores,
    *  usaremos el módulo para volver al 1 (en lugar del 27), ya que 27 % 26 = 1 --> A.
    *  Por ejemplo, el código 103 es 103 - 97 = 6 minúscula, es decir, g.
    */
    final static int LONGITUD_ALFABETO = 26, INICIO_MINUS = 97, INICIO_MAYUS = 65;
    
    // Creamos una variable vacía donde almacenaremos sucesivamente los caracteres una vez rotados
    // Declaramos las variables donde almacenaremos los mensajes cifrados y no cifrados.
    static String mensajeRotado = "";
    String mensajeOriginal;
    int rotacion, accion;

    /**
     * En esta primera parte del programa interactuamos con el usuario para que
     * nos dé las órdenes que quiere ejecutar.
     */
    void solicitarRotacion() {
        // Le pedimos al usuario que introduzca el mensaje y lo almacenamos
        do {
            System.out.println("Escribe el mensaje que quieras rotar:");

            mensajeOriginal = entrada.nextLine();
        } while (mensajeOriginal.isEmpty());

        // Le pedimos la rotación que quiere emplear
        do {
            System.out.print("Introduce el desplazamiento del cifrado César:");
            System.out.println(" (introduce un número entero, ya sea para cifrar o descifrar).");

            rotacion = entrada.nextInt();
        } while (rotacion <= 1 && rotacion > 26);

        // Y ahora le preguntamos si quiere cifrar o descrifrar
        do {
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("  1. Cifrar");
            System.out.println("  2. Descifrar");

            accion = entrada.nextInt();
        } while (accion > 2 || accion < 1);

        // Ejecutamos la rotación en función de la elección del usuario
        if (accion == 1) {
            rotar(mensajeOriginal, rotacion);
        } else {
            rotar(mensajeOriginal, -(rotacion));
        }
    }

    /**
     * En esta segunda parte del programa diseñamos el cifrado en sí
     *
     * @param mensajeOriginal
     * @param rotacion
     * @return cadena de caracteres rotada
     */
    public static String rotar(String mensajeOriginal, int rotacion) {
        // Recorremos caracter a caracter el mensaje introducido por el usuario,
        // almacenando cada caracter en la variable homónima.
        for (int i = 0; i < mensajeOriginal.length(); i++) {
            char caracter = mensajeOriginal.charAt(i);

            // Si el caracter no es una letra, lo agregamos a mensajeRotado tal cual
            if (!Character.isLetter(caracter)) {
                mensajeRotado += caracter;
                continue;
            }

            // Pasamos el caracter actual a código ascii
            // Y determinamos si el caracter es mayúscula o minúscula.
            int caracterAscii = (int) caracter;
            boolean esMayus = Character.isUpperCase(caracter);

            // Ahora rotamos la cadena caracter a caracter a partir de INICIO_MAYUS o INICIO_MINUS
            // dependiendo de si el caracter es mayúscula o minúscula.
            // Por ejemplo, B es 98. Su posición es 1 mayúscula (97 - 98). Si rotamos +3, 
            // su nueva posición es 4 en int, que equivale a D en ascii.
            int nuevaPos = ((caracterAscii
                    - (esMayus ? INICIO_MAYUS : INICIO_MINUS))
                    + rotacion) % LONGITUD_ALFABETO;

            // Arreglamos posiciones negativas
            if (nuevaPos < 0) {
                nuevaPos += LONGITUD_ALFABETO;
            }

            // Ahora volvemos a pasar los datos a ascii para poder escribir la cadema de caracteres
            int nuevaPosAscii = (esMayus ? INICIO_MAYUS : INICIO_MINUS) + nuevaPos;

            // Añadimos el caracter a la cadena
            mensajeRotado += Character.toString(nuevaPosAscii);
        }
        System.out.println(mensajeRotado);
        return mensajeRotado;
    }
}
