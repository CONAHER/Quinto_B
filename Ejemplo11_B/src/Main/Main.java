
package Main;

public class Main {

    public static void main(String[] args) {
       //Declaraciones:
       // Tipo1 : TipoDato identificador [][] = new TipoDato [filas][cols]
       int m1 [][] = new int [100][100];
       // Tipo2: TipoDato identificador [][] = {{1,2},{3,4} }
       int m2 [][] = {{1,2},{3,4}};
       
       //LLenado:
       // Tipo1 : Individual
       m1[0][1] = 3;
       m1[0][0] = 2;
       // Tipo2 : Masivo
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = j;
            }
        }
        
        // Recorrido para Mostrar
        // Tipo1 : individual
        System.out.println(m1[0][0]);
        System.out.println(m1[0][1]);
        // TIpo2 : Masivo
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
