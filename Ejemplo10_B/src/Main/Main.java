
package Main;

public class Main {

    public static void main(String[] args) {
        //Declacion de Vectores
        // Tipo1 : TipoDato indentificador [] = new TipoDato [ tamaño ]; 
        int vector1 [] = new int [10];
        //Tipo2 : TipoDato indentificador [] = {1,2,3,4,5};
        int vector2 [] = {1,2,3,4,5};
        //Llenado de Vectores
        // Tipo 1 : Individual
        vector1[0] = 0;
        vector1[8] = 5;
        vector1[4] = 6;
        // Tipo 2: Masivo (Recorrido)
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (100+i);
        }
        // Mostrar Elementos del vector
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i]+"  ");
        }
    }
    
}
