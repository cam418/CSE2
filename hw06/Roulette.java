///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//hw06 #1
// Roulette Java Program
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

public class Roulette {
    
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    int totalMoney = -1010101;       // Total Money
   	    int selectedNumber = -99;   // Selected Number
   	    int rolledNumber = -99;     // Roulette Wheel Spin Number
   	    int numberProfit = 0;       // Number of times you walk away with profit
   	    int numberTotalLoss = 0;    // total amt of times you lose
   	    int totalWinnings = 0;      // total winnings


    for(int j=1; j<1001; j++){      // Each Simulation
            
            totalMoney = 100;
            selectedNumber = roulette(totalMoney);        // Pick a number
        
   	    
   	    for(int i=1; i<101; i++){ // Each session
   
   	        
   	       
   	        
   	        rolledNumber = roulette(i);          // Simulate Spin
   	        
   	        if(selectedNumber == rolledNumber){ // if a win...
   	            totalMoney += 36;    // win 36
   	            
   	        }
   	        else{               // Loss (if no win)
   	            totalMoney--;       //decrease by 1
   	        }
   	        
   	    }
   	    
   	    if(totalMoney > 100){   //If you end up winning money add to number of times you win $$$
   	        numberProfit += 1;
   	        
   	    }
   	
   	    if(totalMoney == 0){        // If complete Loss add 1 to total loss
   	        numberTotalLoss += 1;
   	    }
   	    
   	    
   	    totalWinnings += totalMoney; // add totalMoney to total winnings
   	    
    }
    
    System.out.println("The number of times you lose everything is  " + numberTotalLoss);
    System.out.println("The total winnings are  " + totalWinnings + " and you spent " + (1000*100) + "\n" + "Therefore your net winnings are " + (totalWinnings - (1000 * 100)));
    System.out.println("The number of times I walked away with a profit in one session is  " + numberProfit);
    
  }
   	
   	
   	 public static int roulette(int a){
        
        //This is the actual finding for the roulette number
       
        int number = ((int)(Math.random()*38)); //pick #
        
        return number; 
        }
        
}