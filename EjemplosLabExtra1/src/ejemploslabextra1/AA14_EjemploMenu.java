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
public class AA14_EjemploMenu {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("");
        System.out.println("Rombo");
        System.out.println("Ingrese 1 para mostrar el cuadrante superior izquierdo");
        System.out.println("Ingrese 2 para mostrar el cuadrante superior derecho");
        System.out.println("Ingrese 3 para mostrar el cuadrante inferior izquierdo");
        System.out.println("Ingrese 4 para mostrar el cuadrante inferior derecho");
        System.out.println("Ingrese 5 para la opcion el rombo completo");
        System.out.println("Ingrese 6 para salir");
        System.out.println("");

        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Imprime el cuadrante 1");
                break;
            case 2:
                System.out.println("Imprime el cuadrante 2");
                break;
            case 3:
                System.out.println("Imprime el cuadrante 3");
                break;
            case 4:
                System.out.println("Imprime el cuadrante 4");
                break;
            case 5:
                System.out.println("Imprime el rombo completo");
                break;
            case 6:
                System.out.println("Ha salido");
                System.exit(0);
                break;
        }
    }
}
