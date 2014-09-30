///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//lab05
// RandomGames Java Program
//
/*
Write a program that uses the Scanner class to obtain from the user
one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
card from a deck of playing cards. The user should enter one of the Strings “R” , “r”,
“C”, “c”, “P”, “p”. If the string is not of length one, an error message should be
displayed. If the string has any other character than ‘R’, ‘r’, ‘C’, ‘c’, ‘P’, or ‘p’ an error
message should be displayed. If the user enters “R” or “r” then the program will print
the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
and a blue 00). If the user enters “C” or “c”, then the program should display the
random outcome of two rolls of a die (each roll in the range 1, 2, …, 6). If the user
enters “P” or “p”, then the program should display a random draw from a deck of
cards. Notice the use of “should” in the previous two sentences. For this
assignment, the Craps and Picking options need not be implemented. If you don’t
implement the option, the program should display a message to the effect that the
option has yet to be implemented.
*/

import java.util.Scanner;

public class RandomGames {
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
   	    
   	     
                    myScanner = new Scanner( System.in );
                    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-  ");
                    
                    
                    char answer = myScanner.next().charAt(0);
                    
                    if(answer != (char) answer){
                        System.out.println("A single Character Expected");
                        return; //leaves the program, i.e. //the program terminates
                    }
                    
                    
            
                    
                    switch (answer) {
                        case('R' | 'r'):
                            System.out.println(roulette(answer));
                            break;
                            
                        case('C' | 'c'):
                            System.out.println(craps(answer));
                            break;
                            
                        case('P' | 'p'):
                            System.out.println(pickacard(answer));
                            break;
                            
                        default:
                            System.out.println(answer +  " is  not a correct input");
                            return; //leaves the program, i.e. //the program terminates
                        
                    }
                    
                    
                    
                    
        }
                    
                    
    public static String roulette(char a){
        
        /*
        If the user enters “R” or “r” then the program will print
        the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
        wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
        and a blue 00). 
        */
       
        
        
        int number = ((int)(Math.random()*38));
        
        switch (number) {
            
            case(37):
                number = 0;
                break;
            case(38):
                number = 00;
                break;
                
            default:
                break;
        }
            
         String ans = "Roulette: " + number;
            
        
        
        return ans; 
        }
        
        public static String craps(char a){
        
        String ans = "Craps feature not implemented yet: ";
        
        return ans; 
        } 
        
        public static String pickacard(char a){
        
        String ans = "pick a card feature not implemented yet";
        
        return ans; 
        } 
    }