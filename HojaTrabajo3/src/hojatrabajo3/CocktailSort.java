/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

import java.util.ArrayList;

/**
 * @author Oscar Juarez 
 * @author Guillermo Sandoval
 */
public class CocktailSort {
    //Metodo 1 de cocktail sort (Pseudocodigo)
    //ArrayList<Integer> listaDesord = new ArrayList<Integer>();
    
    public void ordenadoCocktail(ArrayList<Integer> lista){
        
    /*    
    for (i=0;i<listaDesord.length()-2;i++){    
    
    if (listaDesord[i]>listaDesord[i+1]){
        swap(A[i],A[i+1]);
    }
    else {
        
    }
    for(i=listaDesord.length, i>listaDesord.length()-2;i--){
       if (A[i]<A[i+1]){
            swap(A[i],A[i-1]);
        }
        }    
    } */
    //Metodo 2 para hacer cocktail sort (Ayuda)
    //Definicion de las variables
    
    boolean ordenado = true;
    int i =0;
    int j = lista.size()-1;
    
    while (i<j && ordenado ){
    //Mientras no este ordenado
        ordenado = false;
        for (int k=i;k<j;k++){
            //Para recorrer de forma ascendente la lista buscando el mayor
            if(lista.get(i)>lista.get(i+1)){
                //En este segmento ocurre el intercambio de lugar solo si el elemento
                //Es mayor al que le sigue, para asi insertarlo al final de la lista
                int temp = lista.get(k);
                int post = lista.get(k+1);
                lista.set(temp, post);
                ordenado = true;
            }
           }
            j--;
        if(ordenado)
        {
            ordenado = false;
        
        for(int k=j;k>i; k--){
            //Para el recorrido descendente en el cual busca el menor numero y lo coloca a la izquierda
            if(lista.get(k)<lista.get(k-1)){
                int temp = lista.get(k);
                int pre = lista.get(k-1);
                lista.set(pre,temp);
                ordenado = true;
            }
        }
        }
        i++;
    }
    }
}