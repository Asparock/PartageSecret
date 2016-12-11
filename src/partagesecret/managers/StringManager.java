/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partagesecret.managers;

import java.util.ArrayList;

/**
 *
 * @author aspar
 */
public class StringManager {
    public StringManager(){
        
    }
    
    /**
     * 
     * @param s Le String à convertir en binaire
     * @return La traduction en binaire 
     */
    public String stringToBin(String s){
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }			
        }
        return binary.toString();
    } 
        
    /**
     * 
     * @param s Le String en binaire 
     * @return 
     */
    public String binToString(String s){
        ArrayList<String> decode = new ArrayList<>();              
        for (int i=0; i<s.length();i+=8){
            decode.add(s.substring(i,i+8));    
        }
        String chainecar="";
        for(String str : decode){            
            chainecar += (char)Integer.parseInt(str, 2);            
        }
        return chainecar;
    }
    
    
}
