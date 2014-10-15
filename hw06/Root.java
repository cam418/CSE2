///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//hw06 #2
// Root Java Program
//
/*
Roulette rules for betting on a single number are straightforward: There are 38 
possible numbers. If my number comes up I am given $36. For 100 spins, if my
number comes up 3 or more times, I walk away with 3x$36=$108 or more. Thus, 
if my number comes up at least 3 times I win money; otherwise I lose money. For
the 1000 repetitions of the 100-spin simulation, compute the number of times I 
lose everything (my number never comes up), compute the total winnings (of all 
simulations added together), and compute the number of times I walked away with 
a profit in one session of 100 spins of the wheel. Store the program in the file
Roulette.java and store the file in lab06 on Cloud9.
*/


import java.util.Scanner;

public class Root {
    
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner = new Scanner( System.in );
   	    
   	    System.out.print("Enter a number to approximate the square root: "); // Prompt User
   	    
        double x =  myScanner.nextDouble();
        
        if (x<=0){
            System.out.println("Please enter a number greater than 0 and try again.");
            return;
        }
        
        double low = 0;
        double high =x+1;
        
        
        
        double squareRoot=0.0;
        double middle = 0;
        
        
       
        while((high-low)>(0.0000001*(1+x))){
            
            
        middle = ((low+high)/2);           // Now take the middle of the interval [low, high] and call it middle.
        
        if((middle * middle) >x){              // If the square of middle is greater than x, 
            high = middle;                      // then change high to middle;
        } 
        else{
            low = middle;
        }                                        //otherwise change low to middle
        
        /*
         At this point the square root is still between low and high, but the distance
         between low and high has been halved. 
         
         Repeat this process until the difference between high and low is less 
         than some small multiple of 1+x, say 0.0000001*(1+x).
         
         Then the square root is very close to both low and high.
        */
        
        } 
        
        squareRoot = middle;
        
        System.out.println("\nThe approximation is " + squareRoot);
   	    
   	    
   	}
}