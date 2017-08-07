/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terfogatSzamolas;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate{
  static Scanner scanner = new Scanner(System.in);
  static Calculate instance;
  Output output= new Output();
  
  public static int get_int_val() throws IOException{
    int szam = scanner.nextInt();
   return szam; 
  }

  double get_double_val() throws IOException {
    double szam = scanner.nextDouble();
    return szam;
  }

  static Calculate do_calc() {
    if (instance == null) {
      instance = new Calculate();
    }
    return instance;
  }

  double get_volume(int a) {
    if (a <= 0) {
      throw new NumberFormatException(" All the values must be positive");
    }
    return a * a * a;
  }

  double get_volume(double r) {
    if (r <= 0) {
      throw new NumberFormatException(" All the values must be positive");
    }
    return ((4*Math.pow(r, 3)*Math.PI)/3)/2 ;
  }

  double get_volume(double r, double h) {
    if (r<=0 || h<=0) {
      throw new NumberFormatException(" All the values must be positive");
    }
    return r*r*Math.PI*h;
  }

  double get_volume(int l, int b, int h) {
    if (l<=0 || b<=0 || h<=0) {
      throw new NumberFormatException(" All the values must be positive");
    }
    return l * b * h;
  }



  static class Output {

    static void display(double volume) {
      System.out.println(String.format("%.3f", volume));
    }
  }
}


public class Solution {

 public static void main(String[] args) {
   DoNotTerminate.forbidExit();
   try {
    Calculate cal = new Calculate();
    int T = cal.get_int_val();
    while (T--> 0) {
     double volume = 0.0;
     int ch = cal.get_int_val();
     if (ch == 1) {
      int a = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(a);
     } else if (ch == 2) {
      int l = cal.get_int_val();
      int b = cal.get_int_val();
      int h = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(l, b, h);

     } else if (ch == 3) {
      double r = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r);

     } else if (ch == 4) {
      double r = cal.get_double_val();
      double h = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r, h);

     }
     cal.output.display(volume);
    }

   } catch (NumberFormatException e) {
    System.out.print(e);
   } catch (IOException e) {
    e.printStackTrace();
   } catch (DoNotTerminate.ExitTrappedException e) {
    System.out.println("Unsuccessful Termination!!");
   }


  } //end of main
} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {}

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
} //end of Do_Not_Terminate

