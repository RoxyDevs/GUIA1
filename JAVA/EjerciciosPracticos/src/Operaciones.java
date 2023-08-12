//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Operaciones {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        int numero, doble, triple; // Declarar variables enteras
        
        double raiz; // Declarar una variable de tipo double
        
        System.out.println("Introduce un número entero:"); // Mostrar mensaje por pantalla
        
        numero = sc.nextInt(); // Leer el número entero por teclado y asignarlo a la variable numero
        
        doble = numero * 2; // Calcular el doble del número y asignarlo a la variable doble
        
        triple = numero * 3; // Calcular el triple del número y asignarlo a la variable triple
        
        raiz = Math.sqrt(numero); // Calcular la raíz cuadrada del número usando la función Math.sqrt() y asignarla a la variable raiz
        
        System.out.println("El doble de " + numero + " es " + doble); // Mostrar el doble por pantalla
        
        System.out.println("El triple de " + numero + " es " + triple); // Mostrar el triple por pantalla
        
        System.out.println("La raíz cuadrada de " + numero + " es " + raiz); // Mostrar la raíz cuadrada por pantalla
    }
}
