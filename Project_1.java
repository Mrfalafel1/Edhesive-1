 import java.io.*;
 import static java.lang.System.*;
 import java.util.Random;
 import java.util.Scanner;
 import java.lang.Math;

 class Project_1{


      public static void main (String str[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        String name;
        String plusminus;
        Random rand = new Random();
        String[] feedbackpos = {"Great Job!", "Fantastic!", "You're so smart!"};
        String[] feedbackneg = {"Try again.", "Why would you put that?!", "Are you kidding me??"};
        
        boolean problem = true;
        
        //Asking for name
        int confirmName = 1;
        NAMING:
                  while (confirmName == 1){
          System.out.println("\tWhat is your name?");
          name = scan.nextLine();
           INVALID:
            while (confirmName == 1){
             System.out.println("\tIs " + name + " your name?\n\t1. Yes\n\t2. No");
             String input = scan.nextLine();
             if (input.equals("1")){
              System.out.println("\tHi " + name + ". " + "Get ready to do some math!");
              confirmName++;
             }
             else if (input.equals("2")){
              continue NAMING;
             }
             else {
              System.out.println("\tPlease enter a valid number.\n");
              continue INVALID;
             }
            }
          }
                  
         //Starting problems
        PROBLEM:         
        while (problem == true)
        {
         double x = (Math.round(Math.random()*1001))/100.00;
         double y = (Math.round(Math.random()*1001))/100.00;
         int operator = rand.nextInt(2);
         if (operator == 1)
         {
           plusminus = "+";
         }
         else if (operator == 0)
         {
           plusminus = "-";
         }
         System.out.println("Please input the answer of: " + x + " " + plusminus + " " + y); 
         double ans = scan.nextDouble();
          if (operator == 1)
          {
            //make the x and y round because of rounding error 
            if (ans == (x+y))
            {
              
            }
          }
        }
        
      }
 }