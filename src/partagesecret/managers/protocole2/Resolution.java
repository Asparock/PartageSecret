/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partagesecret.managers.protocole2;

import static java.lang.Math.round;
import java.util.ArrayList;

/**
 *
 * @author Dimi
 */
public class Resolution {
    
    public Resolution(){
    }
    
    public long getDecFromKeys(ArrayList<Long> keys){
        long premier1 = keys.get(0); long premier2 = keys.get(2);
        
        long M = premier1 * premier2;
        long m1 = M / premier1; long m2 = M / premier2;
        
        long y1 = this.euclideEtendu(m2, premier2); 
        long y2 = this.euclideEtendu(m1, premier1);
        
        return (keys.get(1)*m1*y1 + keys.get(3)*m2*y2) % M ;
    }
    
    public final long euclideEtendu(long n, long b){
        long n0 = n; long b0 = b; long t0 = 0; long t = 1; 
        long q = round(n0/b0); long r = n0 - q * b0;      
        while(r > 0){
            long temps = t0 - q * t;
            
            while(temps < 0){
                temps += n;
            }

            if(temps >= 0){
                temps = temps % n;
            } else {
                temps = n -((-temps)% n);
            }
            t0 = t;
            t = temps;
            n0 = b0;
            b0 = r;
            q = round(n0/b0);
            r = n0 - q * b0;
        }   
        
        return t;
    }
    
}
