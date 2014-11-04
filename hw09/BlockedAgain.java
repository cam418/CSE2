//////////////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw09
// BlockedAgain Java Program
//



import java.util.Scanner;
public class BlockedAgain{
    
public static void main(String []s){
    
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);

}

public static int getInt(){
     
     Scanner s = new Scanner(System.in);        //reset scanner     
    int y = 0;
     System.out.print("m= ");
     
     if(s.hasNextInt()){                // if an int is typed in return the int
        y= s.nextInt();
        
        if(checkRange(y)){
            return y;
        }
        else{
            System.out.println("Int out of Range try again");
            return getInt();
        }
     
     }
     else{
       System.out.println("You did not enter an int; try again- ");  // if not prompt them again
       return getInt();                                            // run it again
     }
     
 }

public static boolean checkRange(int x){
    
    if(x>0 && x<10){
        return true;
    }
    else{
        return false;
    }
}

public static void allBlocks(int x){
    
    for(int i = 1; i<=x; i++ ){
     
     block(i);
     
    }
    
}

public static void block(int i){
    
    switch(i){
   	                case 1:                                        //Print 1
   	                    System.out.println("1");
   	                    line(i);
   	                    break;
   	                case 2:                                        //Print 2
   	                    System.out.println("222");
   	                    System.out.println("222");
   	                    line(i);
   	                    break;
   	                case 3:                                        //Print 3
   	                    System.out.println("33333");
   	                    System.out.println("33333");
   	                    System.out.println("33333");
   	                    line(i);
   	                    break;
   	                case 4:                                        //Print 4
   	                    System.out.println("4444444");
   	                    System.out.println("4444444");
   	                    System.out.println("4444444");
   	                    System.out.println("4444444");
   	                    line(i);
   	                    break;
   	                case 5:                                        //Print 5
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    line(i);
   	                    break;
   	                case 6:                                        //Print 6
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    line(i);
   	                    break;
   	                case 7:                                        //Print 7
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    line(i);
   	                    break;
   	                case 8:                                        //Print 8
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    System.out.println("888888888888888");
   	                    line(i);
   	                    break;
   	                case 9:                                        //Print 9
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    System.out.println("99999999999999999");
   	                    line(i);
   	                    break;
   	            }
    
}


public static void line(int i){

    switch(i){
   	                case 1:                                        //Print 1
   	                    
   	                    System.out.println("-");
   	                    break;
   	                case 2:                                        //Print 2
   	                   
   	                    System.out.println("---");
   	                    break;
   	                case 3:                                        //Print 3
   	                    
   	                    System.out.println("-----");
   	                    break;
   	                case 4:                                        //Print 4
   	                    
   	                    System.out.println("-------");
   	                    break;
   	                case 5:                                        //Print 5
   	                    
   	                    System.out.println("---------");
   	                    break;
   	                case 6:                                        //Print 6
   	                    
   	                    System.out.println("-----------");
   	                    break;
   	                case 7:                                        //Print 7
   	                    
   	                    System.out.println("-------------");
   	                    break;
   	                case 8:                                        //Print 8
   	                    
   	                    System.out.println("---------------");
   	                    break;
   	                case 9:                                        //Print 9
   	                    
   	                    System.out.println("-----------------");
   	                    break;
   	            }
    
       	            
   	            
   	            
   	            
   	            
   	        }
   	        
}