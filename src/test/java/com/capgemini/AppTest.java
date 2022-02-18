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

    //A soma dos caracteres necessários para criar a senha forte + o tamanho da senha deve ser maior ou igual a 6
    @Test
    public void requiredCharactersMinSix(){
        String password = "Ya3";
        int countCharacters = Password.validatePassword(password);

        assertTrue(countCharacters + password.length() >= 6);
    }

    //A quantidade de vezes que o loop roda deve ser igual ao tamanho (n) + 1
    @Test 
    public void countLoop(){
        int n = 6;
        assertTrue(Ladder.printLadder(n) == n + 1);
    }



}
