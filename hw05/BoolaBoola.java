///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//hw05 #2
// BoolaBoola Java Program
//
/*
Write a program that has three boolean variables to each of which the value of
true or false is randomly assigned. Then, at random, combine the three variables
with random choices of && and || and stores the result. For example, one might 
have the expression true && false || true (there are 32 possible expressions, 
so I will not list all the possibilities). The program should then present the
expression to the user and ask the user to state the result of of the expression.  
*/


import java.util.Scanner;

public class BoolaBoola {
    
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    boolean firstTF = true;
   	    boolean secondTF = true;
   	    boolean thirdTF = true;
   	    
   	    firstTF = random(false,true);
   	    secondTF = random(false,true);
   	    thirdTF = random(false,true);
   	    
   	    String firstANDOR = "" , secondANDOR = "";
   	    
   	    boolean statement = true;
   	    String statementString = "BLANK";
   	   
   	    switch ((int)(Math.random()*4)){
   	        
   	        case(1):
                            firstANDOR = "||";
                            secondANDOR = "||";
                            statement = (firstTF || secondTF || thirdTF);
                            statementString = "" + firstTF + "||" + secondTF + " || " + thirdTF;
                            break;
            case(2):
                            firstANDOR = "||";
                            secondANDOR = "&&";
                            statement = (firstTF || secondTF && thirdTF);
                            statementString = "" + firstTF + " || " + secondTF + " && " + thirdTF;
                            break;
            case(3):
                            firstANDOR = "&&";
                            secondANDOR = "||";
                            statement = (firstTF && secondTF || thirdTF);
                            statementString = "" + firstTF + " && " + secondTF + " || " + thirdTF;
                            break;
            case(4):
                            firstANDOR = "&&";
                            secondANDOR = "&&";
                            statement = (firstTF && secondTF && thirdTF);
                            statementString = "" + firstTF + " && " + secondTF + "&&" + thirdTF;
                            break;
                                                            
            
   	    }
   	    
   	    String ans = (firstTF + " " + firstANDOR + " " + secondTF + " " + secondANDOR + " " + thirdTF + " ");
   	    
   	    
   	    
   	    
        Scanner myScanner = new Scanner (System.in);
         
   	    System.out.print("Does " + statementString + " have the value true(t/T) or false(f/F)?   ");
        char answer = myScanner.next().charAt(0);
        
        
         
        switch (answer) {
                        case('T' | 't'):
                            
                            if(statement){
                                 System.out.println("Correct");
                            }
                            else{
                                System.out.println("Incorrect");
                            }
                            
                            break;
                            
                        case('F' | 'f'):
                            
                            if(statement){
                                 System.out.println("Incorrect");
                            }
                            else{
                                System.out.println("Correct");
                            }
                            
                            break;
                            
                            
                            
                            
                        default:
                            System.out.println(answer +  " is  not a correct input");
                            return; //leaves the program, i.e. //the program terminates
                        
                    }
                    
   	}
   	
   	public static boolean random(boolean a, boolean b){
   	    boolean c = true;
   	    switch ((int)(Math.random()*2)){
   	        
   	        case(1):
                            c = false;
                            break;
            case(2):
                            c = true;     
                            break;
   	    
   	    }
   	    return c;
   	}
}
