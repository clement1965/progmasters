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
public class Solution { 
  
static boolean won=false; 
public static void main(String[] args) { 
  Scanner scan = new Scanner(System.in); 
  int testcases = scan.nextInt(); 
  if(testcases <1 || testcases>5000)return; 
  scan.nextLine(); 
  for(int i=0;i<testcases; i++){
        String str1=scan.nextLine().trim();
        String[] inputs = str1.split("\\s");
        String str=scan.nextLine();
        String[] data = str.trim().split("\\s");
        int jump=new Integer(inputs[1]);
        int n=new Integer(inputs[0]);
        if(n<2 || n>100) return;
        if(jump<0 || jump >100) return;
        int pos=0;
        boolean[] visited = new boolean[data.length];

        won=false;
        play(pos,jump,data,visited); 

        if(won){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
static void play(int pos, int jump, String[] data, boolean[] visited){

    visited[pos]=true;
    if((pos+jump)>=data.length || (pos+1)>=data.length){
        won=true;           
    }
    else if(!visited[pos+jump] && data[pos+jump].equalsIgnoreCase("0")){
        int hoppos=pos+jump;
        play(hoppos,jump,data,visited);
        if(!(hoppos>=(data.length-1))){
            if(!visited[hoppos-1] && data[hoppos-1].equalsIgnoreCase("0")){
                play(hoppos-1,jump,data,visited);
            }
            if(!visited[hoppos+1] && !((hoppos+1)>=data.length) && data[hoppos+1].equalsIgnoreCase("0")){
                play(hoppos+1,jump,data,visited);
            }
        }
    }
    if(pos < (data.length-1) && !visited[pos+1] && data[pos+1].equalsIgnoreCase("0")) {
        play(pos+1,jump,data,visited);
    }
    if(pos>0 && pos < (data.length-1) && !visited[pos-1] && data[pos-1].equalsIgnoreCase("0")) {
        play(pos-1,jump,data,visited);
    }

}
}