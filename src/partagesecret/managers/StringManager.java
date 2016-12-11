package partagesecret.managers;

import java.util.ArrayList;

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
    
    public String StringToBinary(String s){
        byte[] bytes = s.getBytes();
        StringBuilder binaire = new StringBuilder();
            for (byte b : bytes)
            {
               int val = b;
               for (int i = 0; i < 8; i++)
               {
                  binaire.append((val & 128) == 0 ? 0 : 1);
                  val <<= 1;
               }
            }
        String res = binaire.toString();
        return res;
    }
    
    public long BinaryToDecimal(String str){         
        double j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
                j=j+ Math.pow(2,str.length()-1-i);
            }
        }
        return (long) j;
    }
    

    public String convertBinaryStringToString(Long n){
        String res = Long.toBinaryString(n);

        int decalage = 8 - res.length() % 8;
        if(decalage!=0){
            for(int i = 0 ; i < decalage ; i++){
                res = "0" + res;
            }
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = res.replaceAll("\\s", "").toCharArray();
        int [] mapping = {1,2,4,8,16,32,64,128};

        for (int j = 0; j < chars.length; j+=8) {
            int idx = 0;
            int sum = 0;
            for (int i = 7; i>= 0; i--) {
                if (chars[i+j] == '1') {
                    sum += mapping[idx];
                }
                idx++;
            }
            sb.append(Character.toChars(sum));
        }
        return sb.toString();
    }
    
    
}
