
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author Bela
 */
public class HolaMundo {

    
     public static void main(String[] args) {
          
         //se crea una variable Scanner que se utiliza para leer datos del usuario
         Scanner leer = new Scanner(System.in);
         
         //se crea una variable cadena (String) que lee los datos del usuario
         String nombre; 
         
         //muestra un mje por pantalla
          System.out.println("Ingrese su nombre: ");
         
         //Leemos el nombre de la persona en la variable nombre
         nombre = leer.next();
         
         //mostramos por consola un saludo personalizado
          System.out.println("¡Hola mundo!, soy " + nombre + " y estoy programando en Java. ");
     }
     
}
