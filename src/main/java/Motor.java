package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    
    void cambiarRegistro(int numeroRegistro){
        this.registro = numeroRegistro;
    }

    void asignarTipo(String tipoMotor){
        if (tipoMotor == "electrico" || tipoMotor == "gasolina"){
            this.tipo = tipoMotor;
        }
    }

}