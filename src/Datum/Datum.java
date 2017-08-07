/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datum;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Karoly
 */
public class Datum {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day   = scan.nextInt();
        int year  = scan.nextInt();
        scan.close();
        
        /* Create LocalDate instance */
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());
    }}
