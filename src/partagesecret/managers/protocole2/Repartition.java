/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partagesecret.managers.protocole2;

import java.util.ArrayList;
import partagesecret.managers.StringManager;

public class Repartition {    
    
    private long premier1 = 1000253;
    private long premier2 = 1951793;
    
    private StringManager stringMan = new StringManager();    
    
    public Repartition(){   
    }
    
    public ArrayList<Long> getKeys(long decimal){
        ArrayList<Long> ret = new ArrayList<>();
        
        ret.add(getPremier1());
        ret.add(getKey_1(decimal));
        ret.add(getPremier2());
        ret.add(getKey_2(decimal));
        
        return ret;
    }
    
    
    public long getKey_1(long decimal){
        return decimal%premier1;        
    }
    
    public long getKey_2(long decimal){
        return decimal%premier2;        
    }
    
    public long getPremier1(){
        return this.premier1;
    }
    
    public long getPremier2(){
        return this.premier2;
    }
}
