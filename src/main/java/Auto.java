package test;

public class Auto {
    String modelo;
    int precio;
    String marca;
    Asiento[] asientos;
    Motor motor;
    int registro;
    static String cantidadCreados;

    int cantidadAsientos(){
        int cantAsientos = 0;
        for(int x = 0; x<asientos.length; x++) {
            if (asientos[x] != null){
                cantAsientos++;
            }
        }
        return cantAsientos;
    }

    String verificarIntegridad(){
        for(Asiento asiento : asientos){
            if (this.registro != motor.registro || this.registro != asiento.registro){
                return "Las piezas no son originales";

            } 
        } 
        return "Auto original";
    }
}