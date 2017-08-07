//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution {

  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();
    HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String name = in.nextLine();
      int phone = in.nextInt();
      in.nextLine();
      phoneBook.put(name, phone);
    }
    Integer number = 0;
    while (in.hasNext()) {
      String s = in.nextLine();
      if (!((number = phoneBook.get(s)) == null)) {
        System.out.println(s + "=" + number);
      }else{
        System.out.println("Not found");
      }
    }
  }
}
