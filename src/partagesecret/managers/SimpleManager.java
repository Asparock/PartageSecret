/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partagesecret.managers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author aspar
 */
public class SimpleManager {
    
    private StringManager sm;
    
    public SimpleManager(){
        this.sm = new StringManager();
    }
    
    //Permet de séparer le code binaire en 2 clés
    private ArrayList<String> getKeysFromBin(String s){
        String first="";
        String second="";
        
        for (int i=0; i<s.length(); i++){
            if(i%2==0){
                first+=s.substring(i,i+1);
            }else if (i%2!=0){
                second+=s.substring(i,i+1);
            }
        }         
        return new ArrayList<>(Arrays.asList(new String[]{first,second}));
    }

    //Permet de réassembler les 2 clés pour reformer le code binaire originel
    public String getBinFromKeys(String s1, String s2){
        String recomposition="";              
        for (int i=0; i<s1.length() ; i++){
            recomposition += s1.charAt(i);
            recomposition += s2.charAt(i);                  
        }         
        return recomposition;
    }
    
    //Permet de passer du message directement aux clés (ensemble de 2 fonctions)
    public ArrayList<String> getKeysFromSecret(String s){
        String str = sm.stringToBin(s);
        return getKeysFromBin(str); 
    }  
   
    //Permet de passer des clés au message orgiginel (ensemble de 3 fonctions)
    public String getSecretFromKeys(String s1, String s2){
        String str = getBinFromKeys(s1, s2);
        str = sm.binToString(str);
        return str;  
    }   
}
