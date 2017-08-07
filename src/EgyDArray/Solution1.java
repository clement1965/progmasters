/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EgyDArray;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */

//5 3
//0 0 0 0 0
//  int[] tomb = {0,0,0,0,0};
//6 5
//0 0 0 1 1 1
//  int[] tomb = {0,0,0,1,1,1};
//3 1
//0 1 0    
//    int[] tomb = {0,1,0};
//6 3
//0 0 1 1 1 0
//      int[] tomb = {0, 0, 1, 1, 1, 0};
//18 7
//0 1 1 1 1 0 0 1 1 1 1 1 0 1 1 1 1 1
//    int[] tomb = {0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};

//44 15
//0 0 1 1 1 0 1 0 0 1 1 0 1 1 0 0 1 0 1 0 0 0 1 0 0 0 1 0 1 0 1 1 1 1 0 1 0 1 1 1 1 1 1 1    
//    int[] tomb = {0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0,
//      1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1};

//    58 27
//0 0 0 1 1 0 1 0 1 0 0 0 1 1 1 0 0 0 1 1 1 0 1 1 0 1 1 0 1 0 0 0 0 1 0 0 1 1 1 1 0 1 0 0 1 1 0 1 1 1 1 1 1 1 1 0 1 0
//    int[] tomb = {0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0,
//      1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1,
//      1, 1, 1, 1, 1, 1, 0, 1, 0};

    // 1 9 4 0 1 1 0 0 1 1 0 1


public class Solution1 {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    int testcases = scan.nextInt();
    for (int i = 1; i <= testcases; i++) {
      int tombHossz=scan.nextInt();
      int ugrasHossz=scan.nextInt();
      int[] tomb=new int[tombHossz];
      for (int j = 0; j < tombHossz; j++) {
        tomb[j]=scan.nextInt();
      }
      boolean checkOK = checkOK(0,ugrasHossz,tomb);
      System.out.println(checkOK?"YES":"NO");
    }
  }
  public static boolean checkOK (int pozico, int m,int [] tomb ){
    boolean pozicioOk = false;
    
    if (pozico<0){
      return false;
    }
    if (pozico>=tomb.length) {
      return true;
    }
    if(tomb[pozico]==1){
      return false;
    }
    if(tomb[pozico]==0){
      tomb[pozico]=1;
      pozicioOk=checkOK(pozico+1, m, tomb) || checkOK(pozico-1, m, tomb)|| checkOK(pozico+m, m, tomb);
    }
    return pozicioOk;
  }
}
