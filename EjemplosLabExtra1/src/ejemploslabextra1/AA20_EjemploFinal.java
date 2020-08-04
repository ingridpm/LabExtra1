/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslabextra1;

import java.util.Scanner;

public class AA20_EjemploFinal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cantidad_de_dos;
        System.out.println("Ingrese el numero de filas para la figura");
        int altura = lector.nextInt();
        for (int fila = 1; fila <= altura; fila++) {
            if (fila == 1) {
                System.out.println("*");
            } else {
                cantidad_de_dos = "";
                int contador = 0;
                while (contador <= fila - 3) {
                    cantidad_de_dos = cantidad_de_dos + "2";
                    contador++;
                }
                System.out.println("*" + cantidad_de_dos + "\\");
            }
        }
    }
}
