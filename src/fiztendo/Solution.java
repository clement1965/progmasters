/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiztendo;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int orderedItemsN=scanner.nextInt();
    int notEatenK = scanner.nextInt();
    int[] orderedItems = new int[orderedItemsN];
    int annaOssz=0;
    for (int i = 0; i < orderedItemsN; i++) {
      orderedItems[i]=scanner.nextInt();
      if (i!=notEatenK) {
        annaOssz+=orderedItems[i];
      }
    }
    int fizetett = scanner.nextInt();
    System.out.println((annaOssz/2)==fizetett?"Bon Appetit":fizetett-(annaOssz/2));
  }
}
