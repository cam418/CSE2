//////////////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw04 #2
// Income Tax Java Program
//
/*
 Write a program that prompts the user to enter an integer for the month 
 (1 for January, 2 for February, etc.)  and then displays the number of days in 
 the month).  If the number 2 is entered (February) the user is then asked to 
 enter the year. Make sure that the user enters an integer for the month and
 that the integer is in the required range. Similarly, if the year is requested,
 ensure that an int is entered, and that the int is positive.
*/

import java.util.Scanner;

public class Month{
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);  //input
       
        System.out.print("Enter an int giving the number of the month (1-12)- "); //prompting
        
        int x = in.nextInt();
        int days = 99;
        
        
        if(x == (int) x){
            
            if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12){ //31 day check
               days = 31; 
            }
            
            if(x == 4 || x == 6 || x == 9 || x == 11){ //30 day check
               days = 30; 
            }
            if(x==2){
                
                days = 28;
                
                /*
                
                To determine whether a year is a leap year, follow these steps:
                If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
                If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
                If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
                The year is a leap year (it has 366 days).
                The year is not a leap year (it has 365 days).
                
                */
                
                System.out.print("Enter an int giving the year "); //prompting
        
                int y = in.nextInt();
                
                if(y % 4 == 0) {
                    
                    if(y % 100 == 0) {
                        
                        if(y % 400 == 0) {
                            
                            days = 29;
                            } 
                    }   
                }
                
                else{
                    System.out.println("You did not enter an int within range. run me again!");
                    return; //leaves the program, i.e. //the program terminates
                    }
            }
           
            System.out.println("The month has  " + days + " days!");
            
            if(x != (int) x){
                System.out.println("You did not enter an int within range. run me again!");
                return; //leaves the program, i.e. //the program terminates
                }
        
        }
        
    }
}