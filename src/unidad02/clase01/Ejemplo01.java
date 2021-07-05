package unidad02.clase01;

public class Ejemplo01 {
    int edad = 10;
    static final int maximoDeVida=100;
    public static String nombre;         // El atributo puede ser instanciado desde cualquier clase.
    public static String apellido;

    

    public void saludar(){
        System.out.println("Hola "+ nombre +" "+ apellido);
        
    }

    public static void saludar1( String nombre1, String apellido1){
        System.out.println("Hola "+ nombre1 +" "+ apellido1);
    }

    public static final void saludar2( ){
        System.out.println("Hola "+ nombre +" "+ apellido);
    }
    
}
