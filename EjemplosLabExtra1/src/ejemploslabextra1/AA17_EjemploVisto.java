/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslabextra1;

import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class AA17_EjemploVisto {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("\nIngrese un numero");
            int numero1 = lector.nextInt();
            System.out.println("Ingrese otro numero");
            int numero2 = lector.nextInt();
            System.out.println("");
            System.out.println("Inserte una opción");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            
            opcion = lector.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(numero1+numero2);
                    break;
                case 2:
                    System.out.println(numero1-numero2);
                    break;
                case 3:
                    System.out.println(numero1*numero2);
                    break;
                case 4:
                    System.out.println(numero1/numero2);
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }        
        }while(opcion !=5);
    }
}
