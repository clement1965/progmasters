import java.io.*;
import java.util.*;

public class Solution2 {

  

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        String toRepeat=s.substring(s.length()-n);
        for (int i = 1; i <=n; i++) {
          System.out.print(toRepeat);
      }
        System.out.println("");
    }
}