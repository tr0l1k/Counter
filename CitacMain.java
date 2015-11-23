/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citac;

import java.util.Scanner;

/**
 *
 * @author Jan
 */

public class CitacMain {
  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      
      Citac citac=new Citac(sc.nextInt(),sc.nextInt());
      
      for (int i=0;i<2000;i++){
          System.out.println(citac.toString());
      }
  }  
}
