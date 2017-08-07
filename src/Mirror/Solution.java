/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mirror;

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
    
    int j,k, darab, maxMiror=1;
    for (int i = 0; i < tombMeret; i++) {
      j=tombMeret-1;
      while (j>i && szamTomb[j]!=szamTomb[i]) {        
        j--;
      }
      if (j>i) {
        k=i; darab=0;
        while (szamTomb[k]==szamTomb[j] && j>=k ) {          
          darab++;
          k++;
          j--;
          if (j==k) {
            darab++;
          }
        }
        if (j < k) {
          if ((k - j) <= 1) {
            if (darab > 1) {
              darab += 2;
            } else {
              darab++;
            }
          }else{
            if (darab>3) {
              darab++;
            }
          }
        }
        maxMiror=darab>maxMiror?darab:maxMiror;
      }
    }
    System.out.println(maxMiror);
  }
}
