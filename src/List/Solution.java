/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> szamLista = new ArrayList<>();
    int N = in.nextInt();
    for (int i = 1; i <= N; i++) {
      int szam = in.nextInt();
      szamLista.add(szam);
    }
    int Q = in.nextInt();
    for (int i = 0; i < Q; i++) {
      in.nextLine();
      String muvelet = in.nextLine();
      switch (muvelet) {
        case "Insert":
          int hova = in.nextInt();
          int mit = in.nextInt();
          szamLista.add(hova, mit);
          break;
        case "Delete":
          int honnan = in.nextInt();
          szamLista.remove(honnan);
          break;
        default: ;
          break;
      }
    }
    for (Integer integer : szamLista) {
      System.out.print(integer+" ");
    }
    System.out.println("");
  }
}
