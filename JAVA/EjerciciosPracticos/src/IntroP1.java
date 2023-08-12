//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class IntroP1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        int num1, num2, suma; // Declarar variables enteras
        System.out.println("Introduce el primer número:"); // Mostrar mensaje por pantalla
        num1 = sc.nextInt(); // Leer el primer número por teclado y asignarlo a num1
        System.out.println("Introduce el segundo número:"); // Mostrar mensaje por pantalla
        num2 = sc.nextInt(); // Leer el segundo número por teclado y asignarlo a num2
        suma = num1 + num2; // Calcular la suma de num1 y num2 y asignarla a suma
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma); // Mostrar el resultado de la suma por pantalla
    }
}
