/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgMast3;

import java.util.Arrays;
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
    int sum = 0;
    for (int i = 0; i < numberOfNumbers; i++) {
      numberArray[i] = scanner.nextInt();
      sum += numberArray[i];
    }
    Arrays.sort(numberArray);
    
    sum-=numberArray[numberArray.length-1];
    sum-=numberArray[numberArray.length-2];
    
    System.out.println(sum/(numberArray.length-2));
  }
}
