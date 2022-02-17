package com.capgemini;

/**
* Classe utilitária relacionada a validação de senha forte
* @author Arthur Isvi
* @version 1.0.0
*/
public class Password {
    
/**
* Método que recebe uma String que é uma senha
* e retorna um int que representa a quantidade
* de caracteres necessários para tornar a senha forte.
* @param password Senha inserida.
* @return Contador com a quantidade de caracteres necessários.
* @exception InvalidStringNumberException Se algum parâmetro não
* representar uma String.
*/
    public static int validatePassword(String password){
        int minCharacters = 6;
        int requiredCharacters = 0;
        int specialChar = 0;
        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int validation = 0;
        char[] verify = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };

        if(password.replaceAll("\\s+","").isEmpty()){
            return minCharacters;
        }else{
            for (int i = 0; i< password.length(); i++){
                if (password.length() < minCharacters){
                    requiredCharacters =  minCharacters - password.length();
                    return requiredCharacters;
                }else{
                    char character = password.charAt(i);
                  
                    for (int j = 0; j<verify.length; j++){
                        if(character == verify[j]){
                            specialChar++;
                        }
                    }
    
                    if(Character.isDigit(character)){
                        digit++;
                    }
    
                    if(Character.isUpperCase(character)){
                        upperCase++;
                    }
    
                    if (Character.isLowerCase(character)){
                        lowerCase++;
                    }  
                }
            }
    
            if(digit == 0)
                validation++;
            if(specialChar == 0)
                validation++;
            if(upperCase == 0)
                validation++;
            if (lowerCase == 0)
                validation++;

        }
        return validation;
    }
}
