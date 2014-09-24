//////////////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw04 #3
// Course Number Java Program
//
/*
 The semester during which a course is offered at Lehigh is given by a 6 digit
 number. The first four digits give the year, and the last two digits give the 
 semester: 10 spring, 20 summer 1, 30 summer 2, and 40 fall. Write a program that
 reads in a 6 digit number, makes sure that it adheres to the above description,
 and then prints out the semester and year.
*/

import java.util.Scanner;

public class CourseNumber{
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);  //input
       
        System.out.print("Enter a six digit number giving the course semester- "); //prompting
        
        int x = in.nextInt();
        String semester = "DIDNOTCHANGE";
        
        if(x >= 186510 && x<= 201440){
            
            if(x % 100 == 10){
            semester = "Spring";
            }
        
            if(x % 100 == 20){
            semester = "Summer 1";
            }
            
            if(x % 100 == 30){
            semester = "Summer 2";
            }
            
            if(x % 100 == 40){
            semester = "Fall";
            }
        
        else{
                System.out.println("You did not enter an int within range. run me again!");
                return; //leaves the program, i.e. //the program terminates
                }
        }
        
        x = x/100;
        
        System.out.println("The course was offered in the " + semester + " semester of " + x );
    }
}