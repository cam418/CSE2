///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw03 #1
// Bicycle Java Program
//
/*
Write a program that prompts the user to enter two digits, the first giving the
number of counts on a cyclometer and the second giving the number of seconds 
during which the counts occurred, and then an then prints out the distance
traveled and the average miles per hour.
*/
import java.util.Scanner;

public class Bicycle{
    
    public static void main(String [] args){
       Scanner in = new Scanner(System.in); 
       
        System.out.print( "Enter the number of seconds: ");
        
        double nSec = in.nextInt();
      
        System.out.print( "Enter the number of counts: ");
        double nCounts = in.nextInt();
        
        
        
        //constants and distance conversion factors
        
        double wheelDiameter=27.0;
        double PI=3.14159;
        double feetPerMile=5280;
        double inchesPerFoot=12;
        
        // calculations
        
        double totalDist = (nCounts * wheelDiameter * PI);
        totalDist = totalDist / (inchesPerFoot*feetPerMile); // to miles
        
        
        double nHr = nSec/(3600); // to hours
        
        double speed = totalDist / nHr; // mph
        
        totalDist = round(totalDist);
        speed = round(speed);
        
       System.out.println( "The distance traveled is " + totalDist + " miles");
       System.out.println( "The average speed traveled is " + speed + " miles per hour");
    }
    
    public static double round(double a){
        double fin;
        fin = Math.round(100 * a) / 100d;
        return fin;   
}
}
