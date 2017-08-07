/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RansomNote;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
  public Solution(String magazine, String note) {
    if ( magazine==null || note==null) {
      throw new NullPointerException("Either string is null");
    }
    String[] magazineTomb = magazine.split(" ");
    magazineMap = new HashMap<String, Integer>(magazineTomb.length);
    for (String word : magazineTomb) {
      if (magazineMap.containsKey(word)) {
        magazineMap.replace(word, magazineMap.get(word) + 1);
      }else{
        magazineMap.put(word, 1);
      }
    }
    String[] noteTomb = note.split(" ");
    noteMap = new HashMap<String,Integer>(noteTomb.length);
    for (String word : noteTomb) {
      if (noteMap.containsKey(word)) {
        noteMap.replace(word, noteMap.get(word)+1 );
      }else{
        noteMap.put(word, 1);
      }
    }
  }
    
    public boolean solve() {
      for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
        String key=entry.getKey();
        if ( !magazineMap.containsKey(key) || entry.getValue()> magazineMap.get(key) ) {
          return false;
        }
      }
      return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}