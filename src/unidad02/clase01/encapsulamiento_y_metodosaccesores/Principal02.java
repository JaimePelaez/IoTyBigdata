package unidad02.clase01.encapsulamiento_y_metodosaccesores;


public class Principal01 {
    public static void main(String[] args) {
        
        Setters_Getters set1 = new Setters_Getters();
        set1.SetEdad(-5);
        System.out.println(set1.GetEdad());            // Como mi atributo es de tipo private solo se puede tener referencial al valor mediante el metodo Get
    }
}
