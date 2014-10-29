///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//hw08
// Overloaded Methods Java Program
//


import java.util.Scanner;
public class HW08{
    
    static int n = 0; //counter
    
    public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  } 
  
   public static char getInput(Scanner s, String a){            // 1st getinput
     char c;  
     s = new Scanner(System.in);        //reset scanner     
     if(s.next().equals(s.next().charAt(0))){                // if the input is == to first char...
        c= s.next().charAt(0);
        
        if(c==a.charAt(0) || c == a.charAt(1)){
        return c;
        }
        else{
            return getInput(s,a);
        }
        
     }
     else{
      
       return getInput(s,a);                                            // run it again
     }
     
 }
 
 public static char getInput(Scanner s, String a, int x){       // 2nd getinput
     n++;
     if(n<6){
        
     char c;  
     s = new Scanner(System.in);        //reset scanner     
        if(s.next().equals(s.next().charAt(0))){                // if the input is == to first char...
            c = s.next().charAt(0);
        
            if(c==a.charAt(0) || c == a.charAt(1) || c ==a.charAt(2) || c == a.charAt(3)){
            return c;
            }
            else{
                System.out.println("Bad input Try again- ");
                return getInput(s,a,x);
            }
        
        }
         
     }
     else{
         System.out.println("You failed after 5 tries");
         return ' ';
     }
     return ' ';
 }
 
 public static char getInput(Scanner s, String a, String b){    // 3rd getinput
     
    char c;  
     s = new Scanner(System.in);        //reset scanner     
     if(s.next().equals(s.next().charAt(0))){                // if the input is == to first char...
        
        
       switch(s.next().charAt(0)){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
               c= s.next().charAt(0); 
               return c;
            default:
                System.out.println("You did not enter an acceptable character");
                return ' '; //leaves the program, i.e. //the program terminates
                                                
       }
       
     }
     else{
       System.out.println("You did not enter an acceptable character");
       return getInput(s,a,b);                                            // run it again
     }
      
     
 }
       
   
  
  
  
}
