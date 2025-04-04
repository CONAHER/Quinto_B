
public class Carro extends Vehiculo{
    // Atributo propio de la clase carro
    String marca;
    
    // Constructor que recibe velocidad y marca como parametros
    public Carro(int velocidad, String marca){
        // Llama al constructor de la clase padre Vehiculo
        super(velocidad);
        // Inicializa el atributo propio
        this.marca = marca;
    }
    // Metodo que muestra la informacion completa del carro
    public void mostrarInfo(){
        // Llama al metodo heredado de Vehiculo
        mostrarVelocidad();
        // Muestra la marca
        System.out.println("Marca: " + marca);
    }
    
}


