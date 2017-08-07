/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scores;

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
    int i=0;
    boolean OK=false;
    while (i<(szamTomb.length-2) && !OK) {      
      if ( (szamTomb[i+1]-szamTomb[i]) <=2 && szamTomb[i+2]-szamTomb[i]<=2 ) {
        OK=true;
      }
      i++;
    }
    System.out.println(OK);
  }
}
