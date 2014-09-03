///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Lab 02
//Cyclometer Java Program

/*

My bicycle cyclometer (meant to measure speed, distance, etc.)
records two kinds of data, the time elapsed in seconds, and the number of rotations
of the front wheel during that time. For two trips, given time and rotation count, your
program should

a. print the number of minutes for each trip
b. print the number of counts for each tirp
c. print the distance of each trip in miles
d. print the distance for the two trips combined

*/
//  define a class

public class Cyclometer {
    //main method
    public static void main(String[] args){
        //These variables hold the length of the trip
        
        int secsTrip1=480;
        int secsTrip2=3220;
        
       // These hold the amount of rotations in each trip
       
        int countsTrip1=1561; 
        int countsTrip2=9037;
    
        //constants and distance conversion factors
        
        double wheelDiameter=27.0,
        PI=3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60;
        double distanceTrip1;
        double distanceTrip2;
        
        
        // Prints out for the user the things he wants to know
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
       //run the calculations; store the values.
       
       distanceTrip1=(countsTrip1*wheelDiameter*PI);
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=(inchesPerFoot*feetPerMile); // Gives distance in miles
        distanceTrip2=(countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile);
        double totalDistance=distanceTrip1+distanceTrip2;
       //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");      
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "  +totalDistance + " miles");      

        
    } //end main method
} //end class