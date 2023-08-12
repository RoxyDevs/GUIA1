//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

/**
 *
 * @author RoxDev
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        double celsius, fahrenheit; // Declarar variables de tipo double
        System.out.println("Introduce una temperatura en grados centígrados:"); // Mostrar mensaje por pantalla
        celsius = sc.nextDouble(); // Leer la temperatura en grados centígrados por teclado y asignarla a la variable celsius
        fahrenheit = 32 + (9 * celsius / 5); // Calcular la temperatura en grados Fahrenheit usando la fórmula y asignarla a la variable fahrenheit
        System.out.println(celsius + " grados centígrados son " + fahrenheit + " grados Fahrenheit"); // Mostrar el resultado por pantalla
    }
}

