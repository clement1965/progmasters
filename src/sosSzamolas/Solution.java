/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosSzamolas;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int sosDarab=S.length()/3;
    int roszDarab=0;
    for (int i = 0; i <= S.length()-3; i+=3) {
      String split=S.substring(i, i+3);
      if ( !(split.equals("SOS")) ) {
        if (split.charAt(0)!='S') {
          roszDarab++;
        }
        if (split.charAt(1)!='O') {
          roszDarab++;
        }
        if (split.charAt(2)!='S') {
          roszDarab++;
        }
      }
    }
    System.out.println(roszDarab);
  }
}
