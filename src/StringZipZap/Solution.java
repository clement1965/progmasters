/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringZipZap;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    String szoveg = in.nextLine();
    String zp1 = szoveg.replaceAll("z.p", "zp");
    System.out.println(zp1);
  }
}
