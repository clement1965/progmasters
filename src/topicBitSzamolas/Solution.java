/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topicBitSzamolas;

import java.util.Scanner;

/**
 *
 * @author Karoly
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numPeople= scanner.nextInt();
    int numberOfTopics= scanner.nextInt();
    String[] emberekTudasa = new String[numPeople];
    scanner.nextLine();
    for (int i = 0; i < numPeople; i++) {
      emberekTudasa[i]=scanner.next();
    }
//    for (String string : emberekTudasa) {
//      System.out.println(string);
//    }
    int maxTopicCount=0, topicCount=0;
    int teamCoutn=0;
    for (int i = 0; i < numPeople; i++) {
      for (int j = i+1; j < numPeople; j++) {
        for (int k = 0; k < numberOfTopics; k++) {
          if (emberekTudasa[i].charAt(k) == '1' || emberekTudasa[j].charAt(k) == '1' ) {
            topicCount++;
          }
        }
        if (topicCount>maxTopicCount) {
          maxTopicCount=topicCount;
          teamCoutn=1;
        }else if (topicCount==maxTopicCount) {
          teamCoutn++;
        }
        topicCount=0;
      }
    }
    System.out.println(maxTopicCount);
    System.out.println(teamCoutn);
  }
}
