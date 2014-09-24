//////////////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw04 #4
// TimePadding Java Program
//
/*
 Write a program that has the user enter an positive integer giving the number 
 of seconds that have passed during the day and then displays the time in
 conventional form. (The problem here is displaying time with “padded” 
 0s, e.g., 10:03:05). 
*/

import java.util.Scanner;

public class TimePadding{
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);  //input
       
        System.out.print("Enter the time in seconds: "); //prompting
        
        int x = in.nextInt();
        
        if(x != (int) x){
            System.out.println("You did not enter an int within range. run me again!");
                return; //leaves the program, i.e. //the program terminates
        }
        
        int nhr;
        int nmin;
        int nsec;
        
       nhr = x/3600;
       nmin = (x - (nhr *3600))/60;
       nsec = x - (nhr * 3600) - (nmin * 60);
        String time = "DIDNOTCHANGE";
        
        time = " " + (String.format("%02d", nhr))  + ':' + String.format("%02d", nmin) + ':' + String.format("%02d", nsec);
        
        System.out.println("The time is   " + time + '.');
    }
}