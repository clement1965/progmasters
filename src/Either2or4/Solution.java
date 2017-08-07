/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Either2or4;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tombMeret = scan.nextInt();
    boolean kettesek=false;
    boolean negyesek=false;
    int darab=0;
    int[] szamTomb = new int[tombMeret];
    for (int i = 0; i < tombMeret; i++) {
      szamTomb[i] = scan.nextInt();
    }
    for (int i = 0; i < tombMeret-1; i++) {
      if( szamTomb[i]==2 && szamTomb[i+1]==2){
        kettesek=true;
      }
    }
    for (int i = 0; i < tombMeret-1; i++) {
      if( szamTomb[i]==4 && szamTomb[i+1]==4){
        negyesek=true;
      }
    }
    if (kettesek ^ negyesek) {
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
