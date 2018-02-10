/**
 * Clase encargada de realizar pruebas unitarias con los diferentes metodos.
 * @author: Oscar Juarez - 17315 / Guillermo Sandoval - 17577
 * @version: 9/02/17
 */

import hojatrabajo3.GRandom;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GRandomTest {
    
    private GRandom probar = new GRandom();
    int[] numDesord = probar.leerArchivo("numerosDesordenados.txt");
    
    public GRandomTest() {
    }
    
    @Test
    public void GnomeSort_QuickSort_Test(){                
        
        int[] listaGS = probar.GnomeSort(numDesord);
        int[] listaQS = probar.Quicksort(numDesord);                        
        
        assertEquals(listaGS,listaQS);
    }
    
    @Test
    public void MergeSort_QuickSort_Test(){                
                        
        int[] listaMS = probar.Mergesort(numDesord);         
        int[] listaQS = probar.Quicksort(numDesord);        
        
        assertEquals(listaMS,listaQS);        
    }
    
    @Test
    public void CocktailSort_MergeSort_Test(){                
                                        
        int[] listaQS = probar.Quicksort(numDesord); 
        int[] listaCS = probar.ordenadoCocktail(numDesord); 
        
        assertEquals(listaQS,listaCS);        
    }
    
    @Test
    public void CocktailSort_GnomeSort_Test(){                
                        
        int[] listaGS = probar.GnomeSort(numDesord);         
        int[] listaCS = probar.ordenadoCocktail(numDesord);        
        
        assertEquals(listaGS,listaCS);        
    }
    
    @Test
    public void QuickSort_RadixSort_Test(){                
                                      
        int[] listaQS = probar.Quicksort(numDesord);   
        int[] listaRS = probar.radixSort(numDesord);           
        
        assertEquals(listaQS,listaQS);        
    }
}
