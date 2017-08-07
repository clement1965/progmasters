/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makingAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

    public static int numberNeeded(String first, String second) {
      StringBuilder firstString=new StringBuilder(first);
      StringBuilder secondString= new StringBuilder(second);
      char aktChar;
      for (int i=0; i<first.length(); i++) {
        aktChar=first.charAt(i);
        if ( secondString.indexOf( ""+aktChar ) != -1 ) {
          firstString.deleteCharAt(firstString.indexOf(""+aktChar));
          secondString.deleteCharAt(secondString.indexOf(""+aktChar));
        }
      }
      return firstString.length()+secondString.length();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }  
  
}
