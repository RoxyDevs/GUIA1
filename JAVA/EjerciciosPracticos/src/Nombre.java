//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

/**
 *
 * @author RoxDev
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Nombre {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        String nombre; // Declarar una variable de tipo String
        System.out.println("Introduce tu nombre:"); // Mostrar mensaje por pantalla
        nombre = sc.nextLine(); // Leer el nombre por teclado y asignarlo a la variable nombre
        System.out.println("Hola, " + nombre); // Mostrar el nombre por pantalla
    }
}

