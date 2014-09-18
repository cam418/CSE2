///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//lab04
// Big Mac Again Java Program
//
/*
Write a program that uses the Scanner class to obtain from users how many Big
Macs they want and whether they want an order of fries. It then prints out the 
total cost of the meal. Big Macs still cost $2.22 each,  and an order of fries
costs $2.15. 
*/

import java.util.Scanner;

public class BigMacAgain {
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
   	    
   	     double bigMac$ = 2.22;
         double friescost$ = 2.15;
                    myScanner = new Scanner( System.in );
                    System.out.print(
                        "Enter the number of Big Macs(an integer > 0): ");
                    
                    
                    if(myScanner.hasNextInt() == true){
                        int nBigMacs = myScanner.nextInt(); 
                        
                        if(nBigMacs > 0){
                       
                        System.out.print("would you like fries with that? (Y,N,y,n) /n ");
                    int nfries;
                    char answer = myScanner.next().charAt(0);
                    if(answer == 'Y' || answer == 'y'){
                        System.out.print("How many fries?");
                        nfries = myScanner.nextInt();
                    
                    
                    System.out.println("You ordered " + nBigMacs + " BigMacs for the price of " + bigMac$); 
                    System.out.println("You ordered " + nfries + " fries for the price of " + friescost$); 
                    System.out.println("The total cost of the meal is" + ((nBigMacs*bigMac$) + (nfries*friescost$)) ); 
                    }
                    else{
                            if(answer == 'N' || answer == 'n'){
                         System.out.println("You did not order fries");
                        nfries = 0;
                        
                    System.out.println("You ordered " + nBigMacs + " BigMacs for the price of " + bigMac$); 
                    System.out.println("You ordered " + nfries + " fries for the price of " + friescost$); 
                    System.out.println("The total cost of the meal is" + ((nBigMacs*bigMac$) + (nfries*friescost$)) ); 
                            }
                        else{
                        System.out.println("You did not enter Y,N,n,y");
                        return; //leaves the program, i.e. //the program terminates
                            } 
                        
                        }
                        
                    }
                    else{ 
                        System.out.println("You did not enter an positive int");
                        return; //leaves the program, i.e. //the program terminates
                        }
                    
                    }
                    else{ 
                        System.out.println("You did not enter an int");
                        return; //leaves the program, i.e. //the program terminates
                        }
                    
                    
                    

                    
                    
                   
   }   
    
}  