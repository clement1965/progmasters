/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringMixTogether;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    String szoveg1= in.nextLine();
    String szoveg2= in.nextLine();
    char[] osszefesult = new char[szoveg1.length()+szoveg2.length()];
    int kisebb = szoveg1.length()<=szoveg2.length()?szoveg1.length():szoveg2.length();
    String maradek = szoveg1.length()<=szoveg2.length()?
            szoveg2.substring(kisebb):szoveg1.substring(kisebb);
      //System.out.println(maradek);
      int i=0, j=0;
      while (i<kisebb) {        
          osszefesult[j]=szoveg1.charAt(i);
          j++;
          osszefesult[j]=szoveg2.charAt(i);
          j++;
          i++;
      }
//      for (char c : osszefesult) {
//        System.out.print(c);
//      }
//      for (i = 0; i < kisebb; i++) {
//        System.out.print(osszefesult[i]);
//      }
//      System.out.println(maradek);
//      
      for (i = 0; i < kisebb*2; i++) {
        System.out.print(osszefesult[i]);
      }
      System.out.println(maradek);    
    }
}
