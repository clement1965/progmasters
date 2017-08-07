/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumTorles;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner scanner = new Scanner(System.in);
    int darab = scanner.nextInt();
    int[] szamok = new int[darab];
    for (int i = 0; i < darab; i++) {
      szamok[i] = scanner.nextInt();
    }
    HashMap<Integer, Integer> szamokDarab = new HashMap<>();
    for (Integer i : szamok) {
      if (szamokDarab.get(i)!=null) {
        szamokDarab.put(i, szamokDarab.get(i)+1);
      }else{
        szamokDarab.put(i, 1);
      }
    }
    int maxDarab=0;
    for ( Integer szamDarab : szamokDarab.values() ) {
      if (maxDarab<szamDarab) {
        maxDarab=szamDarab;
      }
    }
    System.out.println(darab-maxDarab);
  }
}
