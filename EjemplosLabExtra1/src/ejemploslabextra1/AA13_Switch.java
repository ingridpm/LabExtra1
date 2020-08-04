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
public class AA13_Switch {
    public static void main(String[] args) {
        /*
        switch(expresion) {
            case x:
              // codigo
              break;
            case y:
              // codigo
              break;
            default:
              // codigo
        }
        */
        
        char clasificacion = 'c';
        switch(clasificacion){
            case 'a':
                System.out.println("La pelicula es para todo público");
                break;
            case 'b':
                System.out.println("La pelicula es para personas de 12 años en adelante.");
                break;
            case 'c':
                System.out.println("La película es para adultos mayores de 18");
                break;
        }
        
        System.out.println("\nLibreria---------------------------");
        //Si no se incluye el break, continua:
        int nivel_socio = 2;
        System.out.println("El socio es nivel: " + nivel_socio);
        switch(nivel_socio){
            case 1:
                System.out.println("El socio puede recibir libros gratis");
            case 2:
                System.out.println("El socio puede alquilar por un mes el libro");
            case 3:
                System.out.println("El socio puede descargar el pdf");
            case 4:
                System.out.println("El socio puede obtener una copia alquilada");
            case 5:
                System.out.println("El socio puede ver el libro online sin descargar");
        }
    }
}
