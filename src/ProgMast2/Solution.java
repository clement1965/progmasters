/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgMast2;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfNumbers = scanner.nextInt();
    int[] numberArray = new int[numberOfNumbers];
    for (int i = 0; i < numberOfNumbers; i++) {
      numberArray[i] = scanner.nextInt();
    }
    boolean isOK = true;
    int i = 0, aktNumber, count = 0;
    while (i < numberOfNumbers && isOK) {
      aktNumber = numberArray[i];
      while (i < numberOfNumbers && isOK && aktNumber == numberArray[i]) {
        i++;
        count++;
        if (count >= 3) {
          isOK = false;
        }
      }
      count = 0;
    }
    System.out.println(isOK);
  }
}
