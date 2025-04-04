// Clase base llamada Animal
public class Animal {
    String nombre; // Atributo comun
    
    // Constructor
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    // Metodo que sera sobreescrito
    public void hacerSonido(){
        System.out.println(nombre + "hace un sonido");
    }
}
