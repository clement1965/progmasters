package zoknik;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int c[] = new int[n];
    for (int c_i = 0; c_i < n; c_i++) {
      c[c_i] = in.nextInt();
    }
    int[] coloursDB = new int[n];
    for (int i = 0; i < coloursDB.length; i++) {
      coloursDB[i]=0;
    }
    int k = 0;
    for (int i = 0; i < c.length; i++) {
      int aktColor = c[i];
      if (aktColor != 0) {
        for (int j = 0; j < c.length; j++) {
          if (aktColor == c[j]) {
            coloursDB[k]++;
            c[j] = 0;
          }
        }
        k++;
      }
    }
    k=0;
    int pairs=0;
    while (k<coloursDB.length && coloursDB[k]!=0) {      
      pairs+=coloursDB[k]/2;
      k++;
    }
    System.out.println(pairs);
  }
}
