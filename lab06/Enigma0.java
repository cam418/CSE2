/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n;                                      //Should Initialize before if statment
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;                           // n;  //initialized n again
    switch(k+p+q+r){
      case 24:                                  //need breaks in switch statements
          break;
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n); // Change to Again
        break;
    }
  }
}

/* Error report:
 *   Expand this comment:
 
 
 *   Explain the error(s) that occurred here, and then fix them
 n is shadowed within the if loop and will compile if it is later defined, but
 when the program is run, this will most likely result in an error. I changed 
 this so that n is initialized before the if loop and not after it.
 Also see comments throughout the program for other corrections.
 
 */
