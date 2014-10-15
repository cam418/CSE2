/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    System.out.println("1. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println("2. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println("3. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("4. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("5. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println("6. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println("7. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println("8. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
      default:
        n-=3; 
        
        // HERE IS WHERE K IS CHANGED TO = 0!
        //k-=5;
        
        System.out.println("9. n= " +n+ " k= " + k); //see what n and k = whenever they are modified
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * 
 * I added print statements after each statement where n and k where modified 
 and saw that on the 9th statement k=0, which causes line 57 to crash the program
 because it divides by k. I commented that line out and now the program runs without crashing
 * 
 * 
 */

