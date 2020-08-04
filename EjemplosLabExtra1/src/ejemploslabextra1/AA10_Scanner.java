/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslabextra1;

/*
Se debe importar la clase para poder utilizarlo
*/
import java.util.Scanner;

public class AA10_Scanner {
    public static void main(String[] args) {
        /*
            Para poder usar la clase scanner se crea una instancia con la 
            siguiente sintaxis:
        */
        Scanner leer = new Scanner(System.in);
        
        /*
        Métodos que están disponibles a través de la clase Scanner:
            Para leer un byte - nextByte()
            Para leer un short - nextShort()
            Para leer un int - nextInt()
            Para leer un long- nextLong()
            Para leer un float - nextFloat()
            Para leer un double - nextDouble()
            Para leer un boolean - nextBoolean()
            Para leer una línea completa - nextLine()
            Para leer una palabra - next()
        */
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su año de nacimiento");
        int ano = leer.nextInt();
        int edad = 2020-ano;
        System.out.println(nombre + " tiene " + edad + " años de edad.");
    }
}
