package partagesecret.managers;

import java.util.Arrays;
import java.util.HashMap;

public class AdvancedManager {
    private StringManager sm;
    
    public AdvancedManager(){
        this.sm = new StringManager();
    }
    
    
    //Permet d'avoir 1 clé par personne. Renvoi un tableau de HashMap contenant les 5 clés
    public HashMap[] getKeysFromBin(String s){   
        //Division de code binaire en 10 morceaux
        String[] tabPart = new String[10];
        Arrays.fill(tabPart, "");
        for (int i=0; i<s.length();i++){
            tabPart[i % 10] += s.substring(i, i+1);
        }          
        
        //On réparti les 10 morceaux aux 5 clés. Chaque couple aura un morceau manquant. Si on réuni 3 clés on doit avoir tous les morceaux
        HashMap<String, String> first = new HashMap<>();
        first.put("E", tabPart[4]);
        first.put("F", tabPart[5]);
        first.put("G", tabPart[6]);
        first.put("H", tabPart[7]);
        first.put("I", tabPart[8]);
        first.put("J", tabPart[9]);

        HashMap<String, String> second = new HashMap<>();
        second.put("B", tabPart[1]);
        second.put("C", tabPart[2]);
        second.put("D", tabPart[3]);
        second.put("H", tabPart[7]);
        second.put("I", tabPart[8]);
        second.put("J", tabPart[9]);

        HashMap<String, String> third = new HashMap<>();
        third.put("A", tabPart[0]);
        third.put("C", tabPart[2]);
        third.put("D", tabPart[3]);
        third.put("F", tabPart[5]);
        third.put("G", tabPart[6]);
        third.put("J", tabPart[9]);

        HashMap<String, String> fourth = new HashMap<>();
        fourth.put("A", tabPart[0]);
        fourth.put("B", tabPart[1]);
        fourth.put("D", tabPart[3]);
        fourth.put("E", tabPart[4]);
        fourth.put("G", tabPart[6]);
        fourth.put("I", tabPart[8]);

        HashMap<String, String> fifth = new HashMap<>();
        fifth.put("A", tabPart[0]);
        fifth.put("B", tabPart[1]);
        fifth.put("C", tabPart[2]);
        fifth.put("E", tabPart[4]);
        fifth.put("F", tabPart[5]);
        fifth.put("H", tabPart[7]);

        HashMap<String, String> tabKeys[] = new HashMap[5];
        tabKeys[0]=first;
        tabKeys[1]=second;
        tabKeys[2]=third;
        tabKeys[3]=fourth;
        tabKeys[4]=fifth;

        return tabKeys;   
    }
   
    //Renvoi un binaire à partir des clés (HashMap). On rentre 3 clés pour avoir un résultat.
    public String keysToBin(HashMap<String,String> hm1, HashMap<String,String> hm2, HashMap<String,String> hm3){
        String lettre="";
        String[] keys = new String[10];
        int i=0;
        //Parcours les morceaux des HashMap afin de récuperer dans un tableau les 10 morceaux orginaux
        for(char alphabet = 'A'; alphabet <= 'J';alphabet++) {
            lettre=Character.toString(alphabet);
            if (hm1.containsKey(lettre)){
                keys[i] = hm1.get(lettre);
            }else if (hm2.containsKey(lettre)){
                keys[i] = hm2.get(lettre);
            }else if(hm3.containsKey(lettre)){
                keys[i] = hm3.get(lettre);
            }  
            i++;
        }
        //Reconstitution du binaire.
        String resultat="";        
        for (int j=0; j<keys[9].length();j++){
            for(String str : keys){
                resultat+=str.substring(j,j+1);
            }
        }
        for (int k=0; k<keys.length; k++){
            if (keys[k].length()-keys[9].length()==1){
                resultat+=keys[k].substring(keys[9].length(),keys[9].length()+1);
            }   
        }        
        return resultat;
    }
        
    //Permet de passer du message directement aux clés (ensemble de 2 fonctions)        
    public HashMap[] getKeysFromSecret(String s){
        String str = sm.stringToBin(s);
        return getKeysFromBin(str); 
    }  
    //Permet de passer des clés au message orgiginel (ensemble de 3 fonctions)    
    public String getSecretFromKeys(HashMap<String,String> hm1, HashMap<String,String> hm2, HashMap<String,String> hm3){
        String str = keysToBin(hm1,hm2, hm3);
        str = sm.binToString(str);
        return str;  
    }
}
