/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepetedString;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    long N = scanner.nextLong();
    int aCount=0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'a') {
        aCount++;
      }
    }
//    System.out.println("A szó hossza: "+S.length());
//    System.out.println("A szóban az a  betük száma= "+aCount );
    long szoSzam=N/S.length();
//    System.out.println("Szo szam = "+szoSzam);
    long maradek=N%S.length();
//    System.out.println("Maradék: " + maradek);
    long egeszDarab=szoSzam*aCount;
//    System.out.println("Egész darabszám= "+egeszDarab);
    aCount=0;
    for (int i = 0; i < maradek; i++) {
      if (S.charAt(i) == 'a') {
        aCount++;
      }
    }
    System.out.println(egeszDarab+aCount);
  }
}
