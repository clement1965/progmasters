/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innom1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Karoly
 */

class Car implements Comparable<Car>{
  String valami;
  int plateNumber;
  Date datum;

  @Override
  public int compareTo(Car otherCar) {
   return (""+plateNumber+datum.getTime()).compareTo(""+otherCar.plateNumber+datum.getTime());
  }
  
}
public class Solution {
  public static int faktorialis(int number){
    return number==1?1:number*faktorialis(number-1);
  }
  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(1);
    lista.add(2);
    ArrayList<Integer> secondList = lista;
    secondList.add(3);
    secondList.removeAll(lista);
    
    StringBuilder sb = new StringBuilder("NewJAVACode");
    StringBuffer sb1 = new StringBuffer("NewJAVACode");

    Long l1=256L;
    Long l2=256L;
    long l3=256L;
    System.out.print(l1==l2?"T":"F");
    System.out.print(l1.equals(l2)?"T":"F");
    System.out.print("-");
    System.out.print(l1==l3?"T":"F");
    System.out.print(l1.equals(l3)?"T":"F");
    System.out.println("");
    System.out.println(faktorialis(10));
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }
}
