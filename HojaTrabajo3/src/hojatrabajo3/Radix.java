/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;
import java.util.ArrayList;

/**
 *
 * @author Guillermo Sandoval
 */
public class Radix {
    ArrayList<Integer> reareglo = new ArrayList<>();
    
    public void radixSort(ArrayList<Integer> lista){
        //Se necesitan en teoria 10 listas, una lista para cada digito y la
        //lista que mezcla todos los digitos ya ordenados por digito.
        int x;
        int i;
        //Otro metodo de Ratix
        //int m=10;
        //int n=1;
        
        for (x=Integer.SIZE-1; x>=0;x++){
            
            int j=0;
            //int dividido = lista.get(x)/n;
            //n=n*10;
            for (i=0;i<lista.size();i++){
                boolean mover = lista.get(i)<< x>=0;
                
            //Operador Ternario (funciona como una condicion entre valores evaluados)
            if(x==0 ? !mover:mover){
                
                reareglo.add(j, lista.get(i)); 
                j++;
            }else{
                reareglo.add(i-j,lista.get(i));
                
            }
            }
            for (i=j;i<reareglo.size();i++){
                reareglo.add(i, lista.get(i-j));
            }
            lista = reareglo;
        }
        
    }
}
