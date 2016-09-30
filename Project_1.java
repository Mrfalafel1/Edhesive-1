
 import java.io.*;
 import java.util.Random;
 import java.util.Scanner;
 import java.lang.Math;

 class Project_1{


      public static void main (String str[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        String name = "null";
        String plusminus = "null";
        Random rand = new Random();
        String[] feedbackpos = {"Great job ", "Fantastic ", "You're so smart ", "That was amazing ", "I can't believe you got that right "};
        String[] feedbackneg = {"You need tutoring ", "WRONG ANSWER ", "Are you kidding me ", "Are you really that dumb ", "Go to school more "};
        String feedback = "null";
        int score = 0;
        int lives = 3;
        
        

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
        while (lives > 0)
        {
        //Numbers
         double x = (Math.round(Math.random()*1001))/100.00;
         double y = (Math.round(Math.random()*1001))/100.00;
         //Operator selection
         int operator = rand.nextInt(2);
         
         if (operator == 1)
         {
           plusminus = "+";
         }
         else if (operator == 0)
         {
           plusminus = "-";
         }
         //Asking Question
         System.out.println("\nPlease input the answer of: " + x + " " + plusminus + " " + y); 
         double ans = scan.nextDouble();
         
         //Checking answer if problem is addition
          if (operator == 1)
          { 
            if (ans == (((double)(Math.round(x*1000)+Math.round(y*1000)))/1000))
            {
              feedback = feedbackpos[rand.nextInt(feedbackpos.length)];
              System.out.println(feedback + name + ".");
              score++;
              System.out.println("\n\t> Your score is: " + score);
              System.out.println("\t> You can only get " + lives + " more answers wrong.");
            }
            else
            {
              feedback = feedbackneg[rand.nextInt(feedbackneg.length)];
              System.out.println(feedback + name + ".");
              score--;
              System.out.println("\n\t> Your score is: " + score);
              lives--;
              System.out.println("\t> Sorry you lost a life. You can only get " + lives + " more answers wrong.");
            }
          }
          
          //Checking answer if problem is subtraction.
          if (operator == 0) 
          {
            if (ans == (((double)(Math.round(x*1000)-Math.round(y*1000)))/1000))
            {
              feedback = feedbackpos[rand.nextInt(feedbackneg.length)];
              System.out.println(feedback + name + "." );
              score++;
              System.out.println("\n\t> Your score is: " + score);
              System.out.println("\t> You can only get " + lives + " more answers wrong.");
            }
            else
            {
              feedback = feedbackneg[rand.nextInt(feedbackneg.length)];
              System.out.println(feedback + name + ".");
              score--;
              System.out.println("\n\t> Your score is: " + score);
              lives--;
              System.out.println("\t> Sorry you lost a life. You can only get " + lives + " more answers wrong.");
            }
          }
        } //End of problem loop
          //Losing Message
          System.out.println("\n\tSorry you ran out of lives " + name + "! Your score was " + score + ". Try again to see if you can beat it.");
        scan.close();
      }
 }
