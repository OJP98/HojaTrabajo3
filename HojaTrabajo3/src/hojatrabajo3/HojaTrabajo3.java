/**
 * Clase que realiza las interacciones con el usuario.
 * @author: Oscar Juarez - 17315 / Guillermo Sandoval - 17577
 * @version: 9/02/17
 */
package hojatrabajo3;

public class HojaTrabajo3 {    
    
    public static void main(String[] args) {                
        
        String numDesord;
        
        GRandom prueba = new GRandom();
//        prueba.Escribir("numerosDesordenados.txt");
        
        numDesord = prueba.leerArchivo("numerosDesordenados.txt");        
        
        System.out.println("Los elementos existentes en el arraylist son:");
        System.out.println(numDesord);
        
    }
    
}
