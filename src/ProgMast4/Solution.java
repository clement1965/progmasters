/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgMast4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  private static void printSpace(int i) {

    for (int j = 1; j <=i; j++) {
      System.out.print(" ");
    }
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 1; i <= number; i++) {
      printSpace(number-i);
      System.out.print("/");
      
      printSpace(i-1);
      System.out.println("|");
    }
    for (int i = 1; i <=number; i++) {
      printSpace(number);
      System.out.println("|");
    }
  }
}
