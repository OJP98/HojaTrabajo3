/**
 * Clase que realiza las interacciones con el usuario.
 * @author: Oscar Juarez - 17315 / Guillermo Sandoval - 17577
 * @version: 9/02/17
 */
package hojatrabajo3;

public class HojaTrabajo3 {    
    
    public static void main(String[] args) {                
        
        int[] numDesord;
        int[] ordGnomeSort;
        int[] ordQuickSort;
        int[] ordMergeSort;
        int[] ordRadixSort;
        int[] ordCocktailSort;
        
        GRandom prueba = new GRandom();
//        prueba.Escribir("numerosDesordenados.txt");
        
        numDesord = prueba.leerArchivo("numerosDesordenados.txt");        
        
        System.out.println("Los elementos existentes en el array son:");
        for (int i = 0; i < numDesord.length; i++) {
            
            System.out.print(numDesord[i] + ", ");
            
        }
        
        System.out.println("\n\n____________________________________________________\n\n");

        ordGnomeSort = prueba.GnomeSort(numDesord);
        prueba.imprimirLista(ordGnomeSort, "GnomeSort");
        
        System.out.println("\n\n____________________________________________________\n\n");

        ordQuickSort = prueba.Quicksort(numDesord);        
        prueba.imprimirLista(ordQuickSort, "QuickSort");
        
        System.out.println("\n\n____________________________________________________\n\n");

        ordMergeSort = prueba.Mergesort(numDesord);  
        prueba.imprimirLista(ordMergeSort, "MergeSort");
        
        System.out.println("\n\n____________________________________________________\n\n");
        ordCocktailSort = prueba.ordenadoCocktail(numDesord);
        prueba.imprimirLista(ordCocktailSort, "Cocktail Sort");
        
        System.out.println("\n\n____________________________________________________\n\n");
        ordRadixSort = prueba.radixSort(numDesord);
        prueba.imprimirLista(ordRadixSort, "RadixSort");
        
    }
    
}