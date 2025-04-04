// Clase base llamada Vehiculo
public class Vehiculo {
    
    // Atributo que almacena la velocidad del vehiculo
    int velocidad; 
    
    // Constructor que recibe un valor y lo asigna al atributo velocidad
    public Vehiculo(int velocidad){
        this.velocidad = velocidad;
    }
    
    // Metodo que muestra la velocidad del vehiculo
    public void mostrarVelocidad(){
        System.out.println("Velocidad:" + velocidad + "km/h");
    }
}
