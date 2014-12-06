import java.util.Scanner;

public class Lab11{
    public static void main(String []  arg){
        
        int list[]= new int [10];
        
        
        
        System.out.print("Enter 10 ints- ");
        
        for(int i=0;i<10;i++){
            
        list[i] = getInt();
            
        }
        
        int high = -99;
        int low = 999999;
        
        for(int j=0;j<10;j++){                   // Highest Number
            if(list[j]>high){
                
                high = list[j];
            }
            
        }
        
        System.out.println("The highest entry is " + high);
        
        for(int k=0;k<10;k++){                   // Lowest Number
            if(list[k]<low){
                low = list[k];
            }
            
        }
        System.out.println("The lowest entry is " + low);
        
        int sum = 0;
        
        for(int l = 0; l<10; l++ ){
            sum += list[l];
        }
        
        System.out.println("The sum is " + sum);
        
        int [] list2 = new int [10];
        
        for(int m=0;m<10;m++){
            
            list2[9-m] = list[m];
            
        }
        
        for(int n=0; n<10; n++){
            
            System.out.println(list[n] + "  " + list2[n]);
            
        }
        
    }
  
  public static int getInt(){
     
     Scanner s = new Scanner (System.in);        //reset scanner     
    int y = 0;
     
     if(s.hasNextInt()){                // if an int is typed in return the int
        y= s.nextInt();
            return y;
     }
     else{
       System.out.println("You did not enter an int; try again- ");  // if not prompt them again
       return getInt();                                            // run it again
     }
     
 }
    
    
}