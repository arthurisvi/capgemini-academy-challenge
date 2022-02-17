package com.capgemini;

public class Ladder {
    static void printLadder(int n){
        int i = 0;
        while(i <= n){
             for(int j = 1;j <= n-i;j++){
                    System.out.print("  ");
             }
             for(int k = 1; k <= i; k++){
                    System.out.print("*" + " ");
             }
             i++;
            System.out.println();
      }
     }
}
