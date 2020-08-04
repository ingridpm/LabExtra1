/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslabextra1;

/**
 *
 * @author ingri
 */
public class AA18_For {

    public static void main(String[] args) {
        /*
        for (instrucción 1; instrucción 2; instrucción 3) {
            // bloque de código
        }
        
        La instrucción 1 se ejecuta (una vez) antes de la ejecución del bloque de código.
        La instrucción 2 define la condición para ejecutar el bloque de código.
        La instrucción 3 se ejecuta (cada vez) después de que se haya ejecutado el bloque de código.
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        
        
        //Numeros de 1 a 20 de 2 en 2
        System.out.println("\nNumeros de 0 a 20 de 2 en 2");
        for (int i = 0; i <= 20; i = i+2) {
            if(i==8){
                System.out.println("Es ocho");
            } else {
                System.out.println("No es ocho");
            }
        }
    }
}
