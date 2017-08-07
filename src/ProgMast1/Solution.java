/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgMast1;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();
        if (string.length()>3) {
          string=string.substring(0, 3);
        }
        for (int i = 0; i < number; i++) {
          System.out.print(string);
        }
    }
}
