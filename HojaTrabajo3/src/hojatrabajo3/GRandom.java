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
    ArrayList<Integer> listaOrd = new ArrayList<Integer>();
   
    /**
     * Esta clase random va a generar los random y luego guardarlos en el que dice
     * Default Package que tiene un txt llamado datos que luego leera para ordenarlo.
    */
    
    String saltoLinea = System.getProperty("line.separator");
    
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
            
//            wr.println("Los valores random son:");
            
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
    public String leerArchivo(String numerosDesord){                
        
        String numeros = "";
        
        File f;
        FileReader fr;
        BufferedReader br;
        
        try {
            
            f = new File (numerosDesord);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            String linea;      
            
            while( (linea=br.readLine()) != null) {
                
                listaDesord.add(Integer.parseInt(linea));
                
            }
            
            br.close();
            fr.close();
                        
        } catch (Exception e) {
            
            System.err.println("Se produjo un error: " + e);
            
        }
        
        //Seccion de codigo que almaceno los elementos dentro de una cadena String
        
        for (int i = 0; i < listaDesord.size(); i++) {
            numeros = (numeros + listaDesord.get(i) + ", ");
        }
        
        return numeros;
        
    }
        
}

