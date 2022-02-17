package com.capgemini;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {


    static HashMap<String, Integer> getAllSubstrings(String word){

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

    static int countAnagrams(HashMap<String, Integer> substrings){
        int count = 0;

        for(String key: substrings.keySet()){
            int nChar = substrings.get(key);
            count += (nChar * (nChar-1))/2;
        }

        return count;
    }

    static int getAnagramsQuantity(String word){

        HashMap<String, Integer> listSubstrings = getAllSubstrings(word);
        
        return countAnagrams(listSubstrings);
    }

    
}
