package unidad02.clase01.encapsulamiento_y_metodosaccesores;

public class Setters_Getters {
    private int edad;

    public void SetEdad(int edad){
        if (edad>=0 && edad <=150){
            this.edad= edad;
        }else{
            System.out.println("Valor no adecuador");
        }
        
    }

    public int GetEdad(){
        return this.edad;
    }
    
}
