/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minMaxSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long szam,osszeg=0;
    ArrayList<Long> lista=new ArrayList<>();
    for (int i = 1; i <=5; i++) {
      szam=in.nextLong();
      lista.add(szam);
      osszeg+=szam;
    }
    Collections.sort(lista);
    System.out.println(osszeg-lista.get(4) + " " + (osszeg-lista.get(0)) );
  }
}
