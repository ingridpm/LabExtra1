package ejemploslabextra1;


public class A6_TiposPrimitivos {
    public static void main(String[] args) {
        /*
            Existen 8 tipos de datos primitivos:
                *valores enteros
                -  int
                -  long
                -  byte
                -  short
                *valores flotantes (decimales)
                -  float
                -  double
                *valores de caracteres 
                -  char
                *valores lógicos 
                -  boolean
        */
        
        /*El día de hoy vamos a usar solamente 4 tipos*/
        int entero = 44;
        double decimal = 56.15;
        char caracter = 'a';
        boolean logico = true; 
        
        //Accediendo a sus valores
        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(caracter);
        System.out.println(logico);
        
        
        System.out.println("\nEstos datos se pueden usar sin almacenarlos"
                + " en variables");
        System.out.println(156);
        System.out.println(35.89);
        System.out.println('b');
        System.out.println(false);
    }
}
