/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citac;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jan
 */
public class Citac {
private int minuty=0;
private String minutyString;
private int hodiny=0;
private String hodinyString;

    public Citac(int hodiny,int minuty) {
        this.hodiny=hodiny;
        this.minuty=minuty;
    }

   

    @Override
    public String toString() {
         if (minuty==59){
        minuty=0;
         hodiny++;
        if (hodiny==24)
        hodiny=0;
    }
    else{
        minuty++;
    }
         if (minuty<10){
         minutyString="0"+minuty;    
         }
         else {
             minutyString=""+minuty;
         }
         if (hodiny<10){
             hodinyString="0"+hodiny;
         }
         else{
             hodinyString=""+hodiny;
         }
        return "Čas: " + hodinyString + ":" + minutyString;
    }


}
