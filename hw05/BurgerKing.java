///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//hw05
// RandomGames Java Program
//
/*
Write a program that prompts the user 
to enter a choice of a burger, a soda, or fries. Then the program prompts the 
users for details of their choices. 
*/


import java.util.Scanner;

public class BurgerKing {
    
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
         Scanner myScanner;
   	    
   	    
   	     
                    myScanner = new Scanner( System.in );
                    System.out.println("Enter a letter to indicate a choice of");
                    System.out.println("Burger (B or b)");
                    System.out.println("Soda (S or s)");
                    System.out.println("Fries (F or f)");
                    
                    
                    char answer = myScanner.next().charAt(0);
                    
                    
                    switch (answer) {
                        case('B' | 'b'):
                            System.out.println(burgerorder(answer));
                            break;
                            
                        case('S' | 's'):
                            System.out.println(sodaorder(answer));
                            break;
                            
                        case('F' | 'f'):
                            System.out.println(friesorder(answer));
                            break;
                            
                        default:
                            System.out.println("You did not enter any of B, b, S, s, F, or f");
                            return; //leaves the program, i.e. //the program terminates
                        
                    }
                    


    }
    
    public static String burgerorder(char a){
    
    String ans;
     System.out.println("Enter A or a for \"all the fixins\" \n C or c for cheese \n N or n for none of the above ");
    
    Scanner scanner;
    scanner = new Scanner( System.in );
    
    char choice = scanner.next().charAt(0);
    String ingredient = "";
    
        switch (choice) {
                        case('A' | 'a'):
                            ingredient = "All the fixins";
                            break;
                            
                        case('C' | 'c'):
                            ingredient = "Cheese";
                            break;
                            
                        case('N' | 'n'):
                            ingredient = "plain";
                            break;
                            
                        default:
                            System.out.println(choice +  " is  not a correct input");
                            return "You Broke it"; //leaves the program, i.e. //the program terminates
                        
                    }
        
        
         
    ans = "You ordered a burger with " + ingredient;     
        return ans;
    }
    
    
    
    public static String friesorder(char a){
    
    String fin;
     System.out.println("Do you want a large or small order of fries (l,L,s, or S)- ");
    Scanner myScan;
    myScan = new Scanner( System.in );
    
    char c = myScan.next().charAt(0);
    
    
    String order = "";
    
        switch (c) {
                        case('L' | 'l'):
                            order = "Large";
                            break;
                            
                        case('S' | 's'):
                            order = "Small";
                            break;
                            
                        
                            
                        default:
                            System.out.println( c +  " is  not a correct input");
                            return "You Broke It"; //leaves the program, i.e. //the program terminates
                        
                    }
        
        
         
    fin = "You ordered a " + order + " fries";     
        return fin;
    }

        
    
    public static String sodaorder(char a){
    
     String fin;
     System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
    
    Scanner scan;
    scan = new Scanner( System.in );
    
    char b = scan.next().charAt(0);
    String x = "";
    
        switch (b) {
                        case('P' | 'p'):
                            x = "Pepsi";
                            break;
                            
                        case('C' | 'c'):
                            x = "Coke";
                            break;
                            
                        case('S' | 's'):
                            x = "Sprite";
                            break;
                            
                        case('M' | 'm'):
                            x = "Mtn Dew";
                            break;
                            
                        default:
                            System.out.println( b +  " is  not a correct input");
                            return "You Broke it"; //leaves the program, i.e. //the program terminates
                        
                    }
        
        
         
    fin = "You ordered a " + x;     
        return fin;
        
    }
    
}