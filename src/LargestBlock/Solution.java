/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargestBlock;

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
    int largestBlock=0, aktDarab;
    int i=0;
      while (i<szoveg.length()) {        
        char aktCahr=szoveg.charAt(i);
        aktDarab=0;
        while (i<szoveg.length() && aktCahr==szoveg.charAt(i)) {          
          i++;
          aktDarab++;
        }
        if (aktDarab>largestBlock) {
          largestBlock=aktDarab;
        }
      }
      System.out.println(largestBlock);
    }
}
