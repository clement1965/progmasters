/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindThree;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    int tombMeret = scan.nextInt();
    boolean OK=false;
    int darab=0;
    int[] szamTomb = new int[tombMeret];
    for (int i = 0; i < tombMeret; i++) {
      szamTomb[i] = scan.nextInt();
    }
    if (szamTomb[0]==3) {
      OK=true;
      darab++;
    }
    for (int i = 1; i < szamTomb.length - 1; i++) {
      if (szamTomb[i] == 3) {
        darab++;
        if (!(szamTomb[i - 1] == 3) && !(szamTomb[i + 1] == 3)) {
          OK = true;
        } else {
          OK = false;
        }
      }
    }
    if (szamTomb[szamTomb.length - 1] == 3) {
      darab++;
      if (szamTomb[szamTomb.length - 2] == 3) {
        OK = false;
      } else {
        OK = true;
      }
    }
    if (darab == 3 && OK) {
      System.out.println(OK);
    } else {
      System.out.println(false);
    }
  }

}
