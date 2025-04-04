// Perro hereda de Animal
public class Perro extends Animal{
    
    // constructor
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de Animal
    }
    
    // Metodo sobreescrito
    @Override
    public void hacerSonido(){
        System.out.println(nombre + "dice: Guau");
    }
}
