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
private String minutyS;
private int hodiny=0;
private String hodinyS;

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
         minutyS="0"+minuty;    
         }
         else {
             minutyS=""+minuty;
         }
         if (hodiny<10){
             hodinyS="0"+hodiny;
         }
         else{
             hodinyS=""+hodiny;
         }
        return "Čas: " + hodinyS + ":" + minutyS;
    }


}
