/*
 * Lesson 10 - Unit 1 - Roundoff error. 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

class Main{

     public static void main (String str[]) throws IOException {
       Scanner scan = new Scanner (System.in);
       System.out.println("Please Enter the Amount Paid:");
       double x = scan.nextDouble();
       System.out.println("Please Enter the Cost of the Item:");
       double y = scan.nextDouble();
       double z = ((double)((Math.round(x * 1000)) - (Math.round(y * 1000)))/1000);
       System.out.println("Change Owed: " + z);
       System.out.println("Pennies: " + ((int)((100*z))%10));

       
        
       }
}