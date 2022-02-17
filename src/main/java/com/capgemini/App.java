package com.capgemini;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Questão 1: ");
        System.out.println("------------------------------");
        Ladder.printLadder(6);
        System.out.println("------------------------------");
        System.out.println("Questão 2: " + Password.validatePassword("1eeeeeDee"));
        System.out.println("------------------------------");
    }
}
