
package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejemplo para Ingreso de datos por consola
        // TipoDato Identificado = Valor;
        // Objeto de tipo Scanner en otras es la instancia de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/*/* PROGRAMA USUARIO /*/*/*/*/*");
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("Hola Usuario "+nombre+" Su Edad es: "+edad);
    }
}
