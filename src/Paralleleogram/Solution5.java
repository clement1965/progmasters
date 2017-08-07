import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

 static boolean flag=false;
 static int B, H;
 static {
    Scanner scanner = new Scanner(System.in);
    int B = scanner.nextInt();
    int H = scanner.nextInt();
    if (B<=0 || H <=0) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }else{
      flag=true;
      Solution5.B=B;
      Solution5.H=H;
    }
 }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class



