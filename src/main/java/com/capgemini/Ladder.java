package com.capgemini;
/**
* Classe utilitária relacionada ao desenho de uma Escada
* @author Arthur Isvi
* @version 1.0.0
*/
public class Ladder {

/**
* Método sem retorno que recebe um int n que será 
* o tamanho da base e altura da escada.
* @param n Tamanho da base e altura.
* @return void.
* @exception InvalidStringNumberException Se o parâmetro não
* representar um int.
*/
    public static int printLadder(int n){
        int i = 0;
        while(i <= n){
             for(int j = 0;j < n-i;j++){
                    System.out.print("  ");
             }
             for(int k = 0; k < i; k++){
                    System.out.print("*" + " ");
             }
             i++;
            System.out.println();
      }
      return i;
     }
}
