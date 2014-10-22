///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//hw07
// NumberStack Java Program
//
/*
You should use loops to create each of the three stacks of number. The first 
stack should be created only using for loops. The second stack should be created
only using while loops. The third stack should be created only using do-while loops.
*/


import java.util.Scanner;

public class NumberStack{
    
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    
   	    Scanner myScanner = new Scanner( System.in );
   	    
   	    System.out.println("Enter a number between 1 and 9- "); // Prompt User
   	    
        int x =  myScanner.nextInt();
        if(x>9 || x<1){
             System.out.println("Number out of Range Try Again!"); //CHECK INPUT
             return;
        }
   	    
   	    System.out.println("Using for loops:");
   	    
   	        for(int i =1; i<=x; i++ ){
   	            
   	            switch(i){
   	                case 1:                                        //Print 1
   	                    System.out.println("1");
   	                    System.out.println("-");
   	                    break;
   	                case 2:                                        //Print 2
   	                    System.out.println("222");
   	                    System.out.println("222");
   	                    System.out.println("---");
   	                    break;
   	                case 3:                                        //Print 3
   	                    System.out.println("33333");
   	                    System.out.println("33333");
   	                    System.out.println("33333");
   	                    System.out.println("-----");
   	                    break;
   	                case 4:                                        //Print 4
   	                    System.out.println("4444444");
   	                    System.out.println("4444444");
   	                    System.out.println("4444444");
   	                    System.out.println("4444444");
   	                    System.out.println("-------");
   	                    break;
   	                case 5:                                        //Print 5
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("555555555");
   	                    System.out.println("---------");
   	                    break;
   	                case 6:                                        //Print 6
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("66666666666");
   	                    System.out.println("-----------");
   	                    break;
   	                case 7:                                        //Print 7
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("77777777777777");
   	                    System.out.println("-------------");
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
   	                    System.out.println("---------------");
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
   	                    System.out.println("-----------------");
   	                    break;
   	            }
   	            
   	            
   	            
   	        }
   	    
  
   	    
   	    
   	    System.out.println("Using while loops:");
   	    int n=1;
   	    while(n<=x){
   	        
   	            while(n==9){                                                //Print 9s
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("-----------------");
   	                n++;
   	            }
   	                
   	           while(n==8){                                             //Print 8
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
   	                System.out.println("---------------");
   	                n++;
   	            }
   	            
   	            while(n==7){                                        //Print 7
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("-------------");
   	                n++;
   	            }  
   	             
   	             while(n==6){                                        //Print 6
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("-----------");
   	                n++;
   	            }  
   	             
   	        
   	            while(n==5){                                        //Print 5
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("---------");
   	                n++;
   	            }  
   	           
   	            while(n==4){                                         //Print 4
   	                System.out.println("4444444");
   	                System.out.println("4444444");
   	                System.out.println("4444444");
   	                System.out.println("4444444");
   	                System.out.println("-------");
   	                n++;
   	            }  
   	            
   	            while(n==3){                                        //Print 3
   	                System.out.println("33333");
   	                System.out.println("33333");
   	                System.out.println("33333");
   	                System.out.println("-----");
   	                n++;
   	            }
   	             
   	             while(n==2){                                        //Print 2
   	                System.out.println("222");
   	                System.out.println("222");
   	                System.out.println("---");
   	                n++;
   	            }
   	                
   	            
   	            while(n==1){                                        //Print 1
   	                System.out.println("1");
   	                System.out.println("-");
   	                n++;
   	            }
   	        }
   	        
   	        System.out.println("Using do-while loops:");
   	        n=1;
   	        do{
   	            
   	            if(n==9)
   	                do{                                        //Print 9
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("99999999999999999");
   	                System.out.println("-----------------");
   	                n++;
   	            }while(n==9); 
   	            
   	             if(n==8)
   	             do{                                        //Print 8
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
   	                System.out.println("---------------");
   	                n++;
   	            }while(n==8);  
   	            
   	            if(n==7)
   	            do{                                        //Print 7
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("77777777777777");
   	                System.out.println("-------------");
   	                n++;
   	            }while(n==7);  
   	                
   	                if(n==6)
   	                do{                                        //Print 6
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("66666666666");
   	                System.out.println("-----------");
   	                n++;
   	            }while(n==6);
   	        
   	            if(n==5)
   	            do{                                        //Print 5
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("555555555");
   	                System.out.println("---------");
   	                n++;
   	            }while(n==5);  
   	             
   	             if(n==4)
   	             do{                                        //Print 4
   	                System.out.println("4444444");
   	                System.out.println("4444444");
   	                System.out.println("4444444");
   	                System.out.println("4444444");
   	                System.out.println("-------");
   	                n++;
   	            }while(n==4);  
   	             
   	              if(n==3)
   	              do{                                        //Print 3
   	                System.out.println("33333");
   	                System.out.println("33333");
   	                System.out.println("33333");
   	                System.out.println("-----");
   	                n++;
   	            }while(n==3);
   	             
   	             if(n==2)
   	             do{                                        //Print 2
   	                System.out.println("222");
   	                System.out.println("222");
   	                System.out.println("---");
   	                n++;
   	            }while(n==2);
   	                
   	            if(n==1) 
   	            do{                                        //Print 1
   	                System.out.println("1");
   	                System.out.println("-");
   	                n++;
   	            }while(n==1);
   	                
   	            
   	        }while (n<=x);
   	        
   	    }
   	
  
}

   	    