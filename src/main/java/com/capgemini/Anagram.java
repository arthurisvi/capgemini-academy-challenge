package com.capgemini;

import java.util.Arrays;
import java.util.HashMap;

/**
* Classe utilitária relacionada a obter um contador de Anagrama
* @author Arthur Isvi
* @version 1.0.0
*/
public class Anagram {

/**
* Método que recebe uma String que será uma palavra
* e retorna um HashMap que tem um elemento String
* e uma chave do tipo Integer.
* @param word Palavra inserida.
* @return Lista com todas as substrings da palavra recebida.
* @exception InvalidStringNumberException Se o parâmetro não
* representar uma String.
*/
    public static HashMap<String, Integer> getAllSubstrings(String word){

        HashMap<String, Integer> substrings= new HashMap<>();

        for(int i =0; i<word.length(); i++){
            for(int j = i +1; j< word.length() + 1; j++){
                char[] result = word.substring(i,j).toCharArray();
                Arrays.sort(result);
                String newString = new String (result);
                
                if(substrings.containsKey(newString)){
                    substrings.put(newString, substrings.get(newString)+1);
                }else
                substrings.put(newString, 1);
            }
        }

       return substrings;
    }
   
/**
* Método que recebe um HashMap (lista de substrings)
* e retorna um inteiro que representa o contador da
* quantidade de anagramas naquela lista.
* @param substrings Lista de substrings.
* @return Quantidade de anagramas presentes na lista.
* @exception InvalidStringNumberException Se o parâmetro não
* representar um HashMap.
*/
    public static int countAnagrams(HashMap<String, Integer> substrings){
        int count = 0;

        for(String key: substrings.keySet()){
            int nChar = substrings.get(key);
            count += (nChar * (nChar-1))/2;
        }

        return count;
    }

/**
* Método que recebe uma palavra e verifica se existe caracteres repetidos,
* caso nao haja letras duplicadas, retorna zero e nao continua, caso tenha duplicadas,
* retorna uma chamada a outro metodo 
* @param word Palavra inserida.
* @return Metodo com a Quantidade de anagramas presentes na palavra
* @exception InvalidStringNumberException Se o parâmetro não
* representar uma String.
*/
    public static int getAnagramsQuantity(String word){

        HashMap<String, Integer> listSubstrings = getAllSubstrings(word);
        
        if(!(word.length() != word.chars().distinct().count())) return 0;
        else return countAnagrams(listSubstrings);
    }

    
}
