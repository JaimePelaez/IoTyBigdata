package unidad02.clase01.interfaz;

public class Carro implements Rueda, Silla {

    @Override
    public void avanzar() {
        System.out.println("Estoy avanzando");
        
    }

    @Override  
    public void detenerse() {
        
        
    }

    @Override
    public void sentarse() {
        
        System.out.println("Me siento ");
    }
    
}
