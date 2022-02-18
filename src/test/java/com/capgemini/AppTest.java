package com.capgemini;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    //Quando não existir letras repetidas na palavra, deve retornar 0
    @Test
    public void countAnagramsReturnZero(){
        int testResult = Anagram.getAnagramsQuantity("oi");

        assertEquals(0, testResult);
    }

    //Caso 1 de teste no contador de anagrama
    @Test
    public void countAnagramsOneCase(){
        int testResult = Anagram.getAnagramsQuantity("ovo");

        assertEquals(2, testResult);
    }

    //Caso 2 de teste no contador de anagrama
    @Test
    public void countAnagramsTwoCase(){
          int testResult = Anagram.getAnagramsQuantity("ifailuhkqq");
  
          assertEquals(3, testResult);
    }

    //A soma dos caracteres necessários para criar a senha forte + o tamanho da senha deve ser maior ou igual a 6
    @Test
    public void requiredCharactersMinSix(){
        String password = "Ya3";
        int countCharacters = Password.validatePassword(password);

        assertTrue(countCharacters + password.length() >= 6);
    }

      //Caso 1 de teste no contador de caracteres para senha forte
      @Test
      public void requiredCharactersCase(){
          String password = "Ya3";
          int countCharacters = Password.validatePassword(password);
  
          assertEquals(3, countCharacters);
      }

    //A quantidade de vezes que o loop roda deve ser igual ao tamanho (n) + 1, para representar a altura do triangulo
    @Test 
    public void countLoop(){
        int n = 6;
        assertTrue(Ladder.printLadder(n) == n + 1);
    }



}
