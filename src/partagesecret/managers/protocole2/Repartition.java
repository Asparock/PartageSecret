package partagesecret.managers.protocole2;

import java.util.ArrayList;
import partagesecret.managers.StringManager;

public class Repartition {    
    
    private StringManager stringMan = new StringManager();    
    
    public Repartition(){   
    }
    
    public ArrayList<Long> getKeys(long decimal){
        ArrayList<Long> ret = new ArrayList<>();
        
        long premier1 = getPremier1(decimal); long premier2 = getPremier2(decimal);
        
        ret.add(premier1);
        ret.add(getKey_1(decimal,premier1));
        ret.add(premier2);
        ret.add(getKey_2(decimal,premier2));
        
        return ret;
    }
    
    public long getPremier1(long decimal){
        long res = 0;
        if(decimal < 100){
            res = 13;
        }else if(decimal<1000){
            res = 101;
        }else if(decimal<10000){
            res = 1009;
        }else if(decimal<100000){
            res = 10007;
        }else if(decimal<1000000){
            res = 100019; 
        }else{
            res = 1000253;
        }
        return res;
    }
    
    public long getPremier2(long decimal){
        long res = 0 ;
        if(decimal < 100){
            res = 17;
        } else if(decimal<1000){
            res = 103;
        } else if(decimal<10000){
            res = 1013;
        } else if(decimal<100000){
            res = 10009;
        } else if(decimal<1000000){
            res = 100003; 
        } else{
            res = 1951793;
        }
        return res;
    }
    
    
    public long getKey_1(long decimal, long premier1){
        return decimal%premier1;        
    }
    
    public long getKey_2(long decimal, long premier2){
        return decimal%premier2;        
    }
}
