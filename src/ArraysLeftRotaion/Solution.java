/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysLeftRotaion;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static int[] arrayLeftRotation(int[] a, int n, int rotations) {
    int[] temp = new int[rotations];
    System.arraycopy(a, 0, temp, 0, rotations);
    System.arraycopy(a, rotations, a, 0, n - rotations);
    System.arraycopy(temp, 0, a, n - rotations, rotations);
    return a;
  }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
