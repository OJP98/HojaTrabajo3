/**
 * Clase que realiza las interacciones con el usuario.
 * @author: Oscar Juarez - 17315 / Guillermo Sandoval - 17577
 * @version: 9/02/17
 */

package hojatrabajo3;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;

public class GRandom {
    
    ArrayList<Integer> listaDesord = new ArrayList<Integer>();
    ArrayList<Integer> reareglo = new ArrayList<>();
    int[] listaD = new int[3000];    
   
    /**
     * Esta clase random va a generar los random y luego guardarlos en el que dice
     * Default Package que tiene un txt llamado datos que luego leera para ordenarlo.
    */        
    
    public void Escribir(String nombre) {
     //Seccion de definiciones para random
     
        Random rnd = new Random();
	int x=0;
        
     //Seccion  de escritura en txt
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try{
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);            
            
            for (int i =0; i<3000; i++){
		x = rnd.nextInt(5000-0)+0; 
                wr.println(x);
		System.out.println(x);
            }
            
           wr.close();
           bw.close();
                        
        }
        catch(Exception e)
        {
            System.err.println("Se produjo un error: " + e);
        }
        
        
    }
    
    /**
     * Metodo que lee un archivo txt e ingresa los valores numericos a un arraylist
     * @param numerosDesord: El archivo txt con los numeros
     * @return
     */
    public int[] leerArchivo(String numerosDesord){                
        
        String numeros = "";
        
        File f;
        FileReader fr;
        BufferedReader br;
        //En esta seccion va a procurar leer el archivo de numeros y convertirlos
        //A enteros al mismo tiempo para guardarlos en el ArrayList de los datos
        try {
            
            f = new File (numerosDesord);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            String linea;      
            
            while( (linea=br.readLine()) != null) {
                
                listaDesord.add(Integer.parseInt(linea));                                
                
            }
            
            for (int i = 0; i < listaD.length; i++) {
                listaD[i] = listaDesord.get(i).intValue();
            }
            
            br.close();
            fr.close();
                        
        }
        //En caso detecta algo que no es un numero convertible a entero
        //Aunque con el generador no deberia haber problema pero si en el 
        //Archivo de texto si se hace modifiaciones manuales por prevencion
        catch (Exception e) {
            
            System.err.println("Se produjo un error: " + e);
            
        }
        
        //Seccion de codigo que almaceno los elementos dentro de una cadena String
        
        for (int i = 0; i < listaDesord.size(); i++) {
            numeros = (numeros + listaDesord.get(i) + ", ");
        }
        
        return listaD;
        
    }
        
    /**
     * Metodo que ordena la lista de enteros de la forma Gnome.
     */
    public int[] GnomeSort (int[] lista){                
        
        int valorTemp = 0;
        
        for (int i = 1; i < lista.length;) {
            
            if (lista[i-1] <= lista[i]) {
                
                i++;
                
            } else {
                
                valorTemp = lista[i];
                
                lista[i] = lista[i-1];                
                lista[i-1] = valorTemp;                                
                --i;
                
                if (i==0) {
                    i=1;
                }                
            }            
        }
                
        return lista;
        
    }
    
    /**
     * Metodo que ordena la cadena de datos mediante el metodo Quicksort.
     */
    public int[] Quicksort (int[] lista){                
        
        int valorIzq = 0;
        int valorDer = lista[0];        
        
        if (valorIzq>=valorDer) {
            return lista;
        }
        
        if (valorIzq != valorDer) {
            
            int pivote = valorIzq;
            int valorTemp;
            
            while (valorIzq != valorDer) {                               
                
                while( lista[valorDer] >= lista[valorIzq] && valorIzq < valorDer){
                    valorDer--;                
                }
                
                while (lista[valorIzq] < lista[pivote] && valorIzq < valorDer) {
                    valorIzq++;
                }
                
                if (valorDer != valorIzq) {

                    valorTemp = lista[valorDer];
                    lista[valorDer] = lista[valorIzq];
                    lista[valorIzq] = valorTemp;                    
                }                          
            }                                                
        }       
        
        return lista;
    }
    
    /**
     * Metodo que une a los arrays creados en el MergeSort.
     * @param izquierda: El array del lado izquierdo.
     * @param derecha: El array del lado derecho.
     * @return: El array izquierdo y derecho unidos.
     */
    public int[] Merge(int[] izquierda, int[] derecha){
        
        int largoTotal = izquierda.length + derecha.length;
        int [] resultado = new int [largoTotal];
        int iD = 0;
        int iI = 0;
        int iR = 0;
        
     while (iI < izquierda.length || iD < derecha.length) {         
         
         if (iI < izquierda.length && iD < derecha.length) {
                          
             if (izquierda[iI] <= derecha[iD]) {
                 
                 resultado [iR] = izquierda[iI];
                 iI++;
                 iR++;
                 
             } else {
                 
                 resultado[iR] = derecha[iD];
                 iD++;
                 iR++;
                 
             }
             
         } else if (iI < izquierda.length){
             
             resultado [iR] = izquierda[iI];
             iI++;
             iR++;
             
         } else if (iD < derecha.length) {
             
             resultado [iD] = derecha.length;
             iD++;
             iR++;
             
         }                  
         
     }   
     
     return resultado;
        
    }
    
    /**
     * Metodo que realiza el ordenamiento mediante sorteo de listas.
     * @param lista: La lista a ordenar.
     * @return: La lista sorteada.
     */
    public int[] Mergesort(int[] lista){                           
        
        if (lista.length <= 1) {
            
            return lista;
            
        }
        
        //Variable que tiene como significado "Punto Medio"
        int PM = lista.length/2;
        
        int[] izq = new int [PM];
        int[] derecha;
        int[] resultado = new int [lista.length];
        
        if (lista.length %2 == 0 ){
            
            derecha = new int [PM];
            
        } else {
            
            derecha = new int [PM + 1];
        }                
        
        for (int i = 0; i < PM; i++) { 
            
            izq[i] = (int) lista[i];          
            
        }    
                        
        for (int j = 0; j < derecha.length; j++) {            
                                        
            derecha[j] = lista[j+PM];                                        
            
        }

        izq = Mergesort(izq);
        derecha = Mergesort(derecha);
        
        resultado = Merge(izq, derecha);
     
         return lista
;        
    }  
    
    public void imprimirLista(int[] lista , String metodo) {
        
        System.out.println("La lista ordenada con " + metodo + " es:\n");
        for (int i = 0; i < lista.length; i++) {            
            System.out.print(lista[i] + ", ");
        }
        
    }
    
    public int[] ordenadoCocktail(int[] lista){        
    
    //ArrayList<Integer> lista = listaDesord;
        
    boolean ordenado = true;
    int i =0;
    int j = lista.length-1;
    
    while (i<j && ordenado ){
    //Mientras no este ordenado
        ordenado = false;
        for (int k=i;k<j;k++){
            //Para recorrer de forma ascendente la lista buscando el mayor
            if(lista[i]>lista[i+1]){
                //En este segmento ocurre el intercambio de lugar solo si el elemento
                //Es mayor al que le sigue, para asi insertarlo al final de la lista
                //int temp = lista.get(k);
                //int post = lista.get(k+1);
                //lista.set(temp, post);
                int temp = lista[k];
                lista[k] = lista [k-1];
                lista [k-1] =temp;
                ordenado = true;
            }
           }
            j--;
        if(ordenado)
        {
            ordenado = false;
        
        for(int k=j;k>i; k--){
            //Para el recorrido descendente en el cual busca el menor numero y lo coloca a la izquierda
            if(lista[k]<lista[k-1]){
                //int temp = lista.get(k);
                //int pre = lista.get(k-1);
                //lista.set(pre,temp);
                int temp = lista[k];
                lista[k] = lista[k-1];
                lista[k-1] = temp;
                ordenado = true;
            }
        }
        }
        i++;
    }
    
        System.out.println("Con cocktail:\n");
        for (int k = 0; k < lista.length; k++) {
            System.out.print(lista[k] + ", ");
        }
        return lista;
    }
    
    public int[] radixSort(int[] lista){
            
        //Se necesitan en teoria 10 listas, una lista para cada digito y la
        //lista que mezcla todos los digitos ya ordenados por digito.
        int x;
        int i;
        int j;
        //Otro metodo de Ratix
        //int m=10;
        //int n=1;
        int listaOrdenada[] = new int[lista.length];
        for (x=Integer.SIZE-1; x>=0;x--){
            int auxiliar[] = new int[lista.length];
            //int dividido = lista.get(x)/n;
            //n=n*10;
            j=0;
            for (i=0;i<lista.length;i++){
                boolean mover = lista[i] << x>=0;
                
            //Operador Ternario (funciona como una condicion entre valores evaluados)
                if(x==0 ? !mover:mover){
                    auxiliar[j] = lista[i]; 
                    j++;
                }else{
                    lista[i-j] = lista[i];   
                }
            }
            //Cierre del for1
            for (i=j;i<auxiliar.length;i++){
                auxiliar[i] = lista[i-j];
            }
            lista = auxiliar;
            listaOrdenada=lista;
        }
     
        System.out.println("La lista ordenada con Radix:\n");
        for (int k = 0; k < lista.length; k++) {
            System.out.print(lista[k] + ", ");
        }
        return listaOrdenada;
    }
    
    
}

