import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
/*
The method hasDups() should return true if and only if the input array has at 
least one repeated entry. The method exactlyOneDup() returns true if and only if
there is exactly one repeated entry (for example, exactlyOneDup() is true for
{2, 7, 2}, false for {2, 2, 2, 3, 4} and false for { 2, 2, 3, 3})
*/


    public static boolean hasDups(int [] x){
        boolean value = false;
        
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){    //for each index check it against the others
                if(x[i]==x[j] && j!=i){     // if they are the same and not the same index
                    value = true;
                }
            }
        }
    
        return value;
    } 
    
    
    
    
    
    
    
    
    
    int [] array = {1,2,3};
    
    exactlyOneDup(array);
    
    
    
    
    
    
    public static boolean exactlyOneDup(int [] x){
       
       x[0]=100000;
       
       
        boolean value = false;
        int n = 0;
        if(hasDups(x)){                     // If no duplicates just return false
           for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){     //for each index check it against the others
                if(x[i]==x[j] && j!=i){     // if they are the same and not the same index
                    value = true;
                    n++;                    // Use as counter 
                }
                if(n!=2){                   // if there is only 1 duplicate it will be seen twice by the for loop
                    value = false;
                }
            }
        }
    
        return value;
            
        }
        else{
            return false;
        } 
    }
    
    
}

