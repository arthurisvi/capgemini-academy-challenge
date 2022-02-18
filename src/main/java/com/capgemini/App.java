package com.capgemini;
import java.util.Scanner;
/**
* Classe principal da aplicação
* @author Arthur Isvi
* @version 1.0.0
*/
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Questão 1 - Digite o n (tamanho da base e altura) da escada: ");
        int n = input.nextInt();
        System.out.println("Saída:");
        Ladder.printLadder(n);
        System.out.print("Questão 2 - Digite a senha: ");
        String password = input.next();
        System.out.println("Saída: " + Password.validatePassword(password));
        System.out.print("Questão 3 - Digite a palavra desejada: ");
        String word = input.next();
        System.out.println("Saída: " + Anagram.getAnagramsQuantity(word));

        input.close();
    }
}