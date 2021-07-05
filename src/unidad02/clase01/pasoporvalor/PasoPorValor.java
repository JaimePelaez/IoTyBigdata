package unidad02.clase01.pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        int z = 100;
        System.out.println("El numero es:"+ z);
        cambiaValor(z);
        System.out.println("El numero es:"+ z);
    }

    public static void cambiaValor (int arg){
        System.out.println("El numero es:"+ arg);

        arg=150;
    }
}
