/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanSum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] szamLista = new int[3];
    int eredmeny = 0;
    for (int i = 0; i <= 2; i++) {
      int szam = scanner.nextInt();
      szamLista[i]=szam;
    }
    for (int i = 0; i < 2; i++) {
      int szam=szamLista[i];
      for (int j = i+1; j < 3; j++) {
        if (szam==szamLista[j]) {
          szamLista[i]=0;
          szamLista[j]=0;
        }
      }
    }

    for (int i : szamLista) {
      eredmeny+=i;
    }
    System.out.println(eredmeny);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  }
}
