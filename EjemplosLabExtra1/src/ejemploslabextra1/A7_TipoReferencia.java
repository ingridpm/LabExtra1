package ejemploslabextra1;

public class A7_TipoReferencia {

    /*
        Podemos tener una cantidad ilimitada de tipos ya que nosotros los creamos
        Veremos el tipo String, que ya viene definido en Java
     */
    public static void main(String[] args) {
        String saludo = "Hola chicos!";
        String adios = "adios";
        String oracion = "Hoy es lunes 3 de agosto.";

        System.out.println(saludo);
        System.out.println(adios);
        System.out.println(oracion);
        
        
        System.out.println("------------");
        //Se pueden agregar ciertos caracteres especiales:
        String tab = "\tEste texto está tabulado";
        String salto = "Una línea\nOtra línea";
        System.out.println(tab);
        System.out.println(salto);
    }

}
