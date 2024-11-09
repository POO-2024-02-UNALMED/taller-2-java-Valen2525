package test;

public class Auto {
    String modelo;
    int precio;
    String marca;
    Asiento asientos [];
    Motor motor;
    int registro;
    static int cantidadCreados;

    void cantidadAsientos(){
    }

    void verificarIntegridad(){
        if (Auto.registro & Asiento.registro == Moto.registro){
            System.out.println("Auto original");
        }
        else:{
            System.out.println("Las piezas no son originales");
        }
    }
}
