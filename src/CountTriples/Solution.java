/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountTriples;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    String szoveg=scan.nextLine();
    int tripleDarab=0;
      for (int i = 0; i < szoveg.length()-2; i++) {
        if (szoveg.charAt(i)==szoveg.charAt(i+1) && szoveg.charAt(i)==szoveg.charAt(i+2)) {
          tripleDarab++;
        }
      }
      System.out.println(tripleDarab);
    }
}
