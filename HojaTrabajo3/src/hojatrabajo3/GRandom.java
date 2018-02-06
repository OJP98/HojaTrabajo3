/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;
import java.util.Random;
import java.io.*;

/**
 * 
 * @author Oscar 
 * @author Guillermo Sandoval
 */
public class GRandom {
    /**
     * Esta clase random va a generar los random y luego guardarlos en el que dice
     * Default Package que tiene un txt llamado texto que luego leera para ordenarlo.
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
            
            wr.write("Los valores random es:");
            for (int i =0; i<3000; i++){
		x = (int)(rnd.nextInt()); 
                wr.append("\n" + x);
		System.out.println(x);
            }
           wr.close();
           bw.close();
            
            
        }
        catch(Exception e)
        {
            System.out.println("Se produjo un error");
        }
        
        
    }
        
}
