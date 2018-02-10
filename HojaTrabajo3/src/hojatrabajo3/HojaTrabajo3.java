/**
 * Clase que realiza las interacciones con el usuario.
 * @author: Oscar Juarez - 17315 / Guillermo Sandoval - 17577
 * @version: 9/02/17
 */
package hojatrabajo3;

public class HojaTrabajo3 {    
    
    public static void main(String[] args) {                
        
        int[] numDesord;
        int[] numOrd;
        int[] ordGnomeSort;
        int[] ordQuickSort;
        int[] ordMergeSort;
        int[] ordRadixSort;
        int[] ordCocktailSort;
                
        GRandom prueba = new GRandom();
        prueba.Escribir("numerosDesordenados.txt");
        System.out.println("\nSe ha creado el txt con los 3000 numeros aleatorios\n");
        
        numDesord = prueba.leerArchivo("numerosDesordenados.txt");  
        System.out.println("Se ha leido el txt y se introdujo en un array\n");
        
        System.out.println("\nLos elementos existentes en el array son:");
        for (int i = 0; i < numDesord.length; i++) {
            
            System.out.print(numDesord[i] + ", ");            
        }
        
        System.out.println("\n\n____________________________________________________\n\n");

        //Se ordena la lista con el metodo Gnome
        ordGnomeSort = prueba.GnomeSort(numDesord);
        prueba.imprimirLista(ordGnomeSort, "GnomeSort"); 
        
        //Se lee la lista ordenada con su propio metodo
        numOrd = prueba.GnomeSort(ordGnomeSort);
        
        System.out.println("\n\n____________________________________________________\n\n");
     
        //Se ordena la lista con el metodo quicksort
        ordQuickSort = prueba.Quicksort(numDesord);
        prueba.imprimirLista(ordQuickSort, "QuickSort");
        
        //Se lee la lista ordenada con su propio metodo
        
        numOrd = prueba.Quicksort(numOrd);
        
        System.out.println("\n\n____________________________________________________\n\n");

        //Se ordena la lista con el metodo mergesort
        ordMergeSort = prueba.Mergesort(numDesord); 
        prueba.imprimirLista(ordMergeSort, "MergeSort");
        
        //Se lee la lista ya ordenada con su propio metodo
        numOrd = prueba.Mergesort(numOrd);
        
        System.out.println("\n\n____________________________________________________\n\n");
        
        //Se ordena la lista con el metodo Cocktail.
        ordCocktailSort = prueba.ordenadoCocktail(numDesord);
        prueba.imprimirLista(ordCocktailSort, "Cocktail Sort");
        
        //Se lee la lista ya ordenada con su propio metodo
        numOrd = prueba.ordenadoCocktail(numOrd);
        
        System.out.println("\n\n____________________________________________________\n\n");
        
        //Se ordena la lista con el metodo Radix
        ordRadixSort = prueba.radixSort(numDesord);
        prueba.imprimirLista(ordRadixSort, "RadixSort");
        
        //Se lee la lista ya ordenada con su propio metodo
        numOrd = prueba.radixSort(numOrd);
        
    }
    
}