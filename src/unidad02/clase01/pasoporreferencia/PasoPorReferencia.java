package unidad02.clase01.pasoporreferencia;


import unidad02.clase01.Ejemplo01;

public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Ejemplo01 persona = new Ejemplo01();
        persona.nombre= "Nicolas";// este atributo puede ser cambiado por ser public 
        System.out.println("El nombre es "+ persona.nombre);
        cambiaValor(persona);
        System.out.println("El nombre es "+ persona.nombre);
    }
    
    public static void cambiaValor(Ejemplo01 persona){
        persona.nombre="Ana";

    }
}
