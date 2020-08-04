package ejemploslabextra1;

public class AA11_SentenciaIf {

    public static void main(String[] args) {
        /*
        Dependiendo de la condición, ejecuta cierta acción
        */
        int edad = 33;
        if (edad >= 18) { //Si la edad es mayor o igual a 18
            //Se ejecuta esto si es verdadero
            System.out.println("Es mayor de edad");
        } else { //Si no (opcional)
            //Se ejecuta esto si es falso
            System.out.println("Es menor de edad");
        }

        System.out.println("\n---------------Entrada-------------------");
        edad = 17;
        double dinero = 192.50;
        if (edad >= 18 && dinero >= 200) {
            System.out.println("Pase a VIP");
        } else if (edad >= 18) {
            System.out.println("Pase a la zona general");
        } else {
            System.out.println("No puede entrar");
        }
        
        System.out.println("\n---------------Ya entro-------------------");
        boolean quiere_comida = true;
        if (quiere_comida){
            if(dinero>10){
                System.out.println("Darle comida");
            } else {
                System.out.println("No le alcanza :(");
            }
        }
        
    }
}
