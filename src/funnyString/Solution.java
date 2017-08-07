/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funnyString;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    scanner.nextLine();
    boolean notFunny = false;
    for (int i = 0; i < T ; i++) {
      String S = scanner.nextLine();
      for (int j = 0; j < S.length() - 1; j++) {
        if (Math.abs(S.charAt(j) - S.charAt(j + 1)) != Math.abs(S.charAt(S.length() -j-1) - S.charAt(S.length() -j-2))) {
          notFunny = true;
        }
      }
      System.out.println(notFunny?"Not Funny":"Funny");
      notFunny=false;
    }
  }
}
