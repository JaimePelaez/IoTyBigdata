package unidad02.clase01;
//import unidad02.clase01.Ejemplo01;
//import unidad02.clase01.Ejemplo02;   como estan dentro del mismo paquete no es necesario importar 

public class Principal01 {
    
    public static void main(String[] args){
        String a= "Jaime";
        String b= "Pelaez";

        Ejemplo01 ej = new Ejemplo01();  // instancia de objeto con constructor
        Ejemplo01 ej1 = new Ejemplo01(); // instancia de objeto
        ej.nombre = "Andres";            // Con el objeto ej se cambia el valor del atributo nombre por Andres
        ej.edad = 50;
        System.out.println("Atributo nombre modidifado por el objeto ej->  "+ ej.nombre);  
        System.out.println("Atributo edad modidifado por el objeto ej->  "+ ej.edad);  
        ej1.nombre = "Pedro";            // Con el objeto ej1 se cambia el valor del atributo nombre  por Pedro
        ej1.edad =70; 
        System.out.println("Atributo nombre modidifado por el objeto ej1 pro se imprime el objeto ej->  "+ ej.nombre);   // se imprimero ej y este fue
        System.out.println("Se imprime el atributo edad de los objetos ej y ej1->  "+ej.edad+ " y "+ ej.edad);   // se imprimero ej y este fue   
        //ej.maximoDeVida = 150; 
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        ej.saludar();
        Ejemplo01.saludar1(a,b);
        Ejemplo01.saludar2();

        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        Ejemplo02 suma = new Ejemplo02();
        Ejemplo02 suma1 = new Ejemplo02(10, 10);
        System.out.println(suma.sumar());
        System.out.println(suma1.sumar());
        
    }
    
}
