package unidad02.clase01.abstracta;

import unidad02.clase01.interfaz.Rueda;  // como rueda esta en otro paquete se debe importar 

public  class Planta extends Servivo  {    // implementar mas adelante la interfaz rueda aqui

    @Override                    //Decorador
    public void alimentarse() {
        System.out.println("La planta hace fotosintesis.");
        
    }
}
