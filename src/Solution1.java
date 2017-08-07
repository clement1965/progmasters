import java.io.*;
import java.util.*;

public class Solution1 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    /* Enter your code here. Print output to STDOUT. */
    System.out.println(A);
    int i = 0;
    int j = A.length() - 1;
    while (A.charAt(i) == A.charAt(j) && !(i==j) && i<A.length() && j>=0) {      
      i++;
      j--;
    }
    System.out.println((i==j?"Yes":"No"));
  }
}
