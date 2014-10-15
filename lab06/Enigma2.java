import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/1;   //change divide by 0 so the program compiles
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *
 *  One could compile the code and examine the error the compiler points out and
 go to the line number and see what exactly the program is doing at that line and
 fix it. In this case the program divides 40 by 0, which is impossible.
 * 
 * 
 * 
 */

