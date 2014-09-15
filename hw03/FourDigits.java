//////////////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw03 #3
// Four Digits Java Program
//
/*
Write a program that prompts the user to enter a double and  then prints out the
first four digits to the right of the decimal point. Store the program in 
FourDigits.java. Hint: Casting the number to an int twice, once before and once
after multiplication by 10000, is useful in both samples below. The second sample
also requires you to access the individual digits of the int you get by 
implementing the first line of this hint. Using / and % is useful in extracting
the individual digits.
*/

import java.util.Scanner;

public class FourDigits{
    
    public static void main(String [] args){
     
      Scanner in = new Scanner(System.in);  //input
       
        System.out.print( "Enter a double and I display the four digits to the right of the decimal point-"); //prompting
        
        int ans;  // Final Answer
        
        double x = in.nextDouble();
        int y = (int) x;
        double z = x-y;
        z = z * 10000;
        ans = (int) z + 1;
        
        System.out.println( "The First 4 Digits are: " + ans);
        
    }
    
}