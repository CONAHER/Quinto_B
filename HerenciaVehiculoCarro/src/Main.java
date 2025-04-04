// Clase principal que contiene el metodo main
public class Main {
    
    public static void main(String []arg){
        
        // Crear un objeto de la clase Carro con velocidad y marca
        Carro miCarro = new Carro(125, "Honda");
        
       // Llamar al metodo para mostrar la informacion del carro
        miCarro.mostrarInfo();
    }
}
