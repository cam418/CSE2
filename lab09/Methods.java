import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
 
 public static int getInt(Scanner s){
     s = new Scanner(System.in);        //reset scanner     
     if(s.hasNextInt()){                // if an int is typed in return the int
     return s.nextInt();
     }
     else{
       System.out.println("You did not enter an int; try again- ");  // if not prompt them again
       return getInt(s);                                            // run it again
     }
     
 }
 
 public static int larger(int x, int y){            //See which is larger
     if(x>y){
         return x;                                  
     }
     else{
             return y;
     }
     
     
 }
 
 public static boolean ascending (int i,int j,int k){
     
     boolean value = false;         // start at false, if and only if i is larger than j and j is larger than k, change to true
     
     if(i>j && j>k){
        value = true;
     }
     
     return value;
 }
  
}
