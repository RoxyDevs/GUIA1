//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

/**
 *
 * @author RoxDev
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Frase {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        String frase; // Declarar una variable de tipo String
        System.out.println("Introduce una frase:"); // Mostrar mensaje por pantalla
        frase = sc.nextLine(); // Leer la frase por teclado y asignarla a la variable frase
        System.out.println("La frase en mayúsculas es: " + frase.toUpperCase()); // Mostrar la frase en mayúsculas por pantalla
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase()); // Mostrar la frase en minúsculas por pantalla
    }
}
