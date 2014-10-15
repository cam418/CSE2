///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//lab07
// LoopTheLoop Java Program
//

import java.util.Scanner;

public class  LoopTheLoop{
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   
   	  boolean run = true;
   	  boolean run2 = true;
   	  int x;  
   	  int nStars=-1;
   	  int n=1;
   	  String line = "";
   	  
   	  Scanner scan = new Scanner( System.in );
   	  
   	  int answer;
   	  
   	  	while(run){
   	  	    
   	    System.out.print("Enter an int between 1 and 15- "); 
   	    answer = scan.nextInt(); 
   	    
   	    while((answer == (int)answer) && run2){
   	      
   	     
   	    nStars = answer;
   	    
   	    x = nStars;
   	    
   	    if(answer<0 || answer>16){
   	        System.out.println(answer+"Your int was not in the range [1.15]");
   	    }
   	  
        while(nStars>0){
           
            System.out.print("*");
            
            nStars--;
        }
        nStars = x;
        while(n<=nStars){
            
            line += "*";
            System.out.print("\n" + line);
            n++;
        }
        nStars = x;
        n=1;
        run2=false;
   	    }
        
        
   	    Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print(" \n Enter y or Y to go again- ");
        char letter = myScanner.next().charAt(0);
        if( letter == 'Y' || letter == 'y'){
            
        }
        else{
            
            run = false;
            break;
        }
        
   	    
   	    }
        
   	
    }
}
