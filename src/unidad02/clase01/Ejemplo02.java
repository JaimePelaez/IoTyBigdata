package unidad02.clase01; // sobrecarga de constructores

public class Ejemplo02 {
    int a;
    int b; 

    public Ejemplo02(){
        System.out.println("Constructor #1"); // sobrecarga de constructores
    }
    public Ejemplo02(int a , int b ){ // var no esta permitido para definir argumentos de los metodos 
        this.a=a;
        this.b=a;
        System.out.println("Constructor #2");
    }
    public int sumar(){
        return a+b;
    }
    
}
