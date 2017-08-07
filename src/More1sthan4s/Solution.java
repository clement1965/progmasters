/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package More1sthan4s;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    int tombMeret = scan.nextInt();
    int[] szamTomb = new int[tombMeret];
    for (int i = 0; i < tombMeret; i++) {
      szamTomb[i] = scan.nextInt();
    }
    int egyesDb=0, negyesDb=0;
    for (int szam : szamTomb) {
      if (szam==1) {
        egyesDb++;
      }
      if (szam==4) {
        negyesDb++;
      }
    }
    System.out.println(egyesDb>negyesDb);

  }

}
