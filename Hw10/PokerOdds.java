import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
/*    
The method showOneHand() should generate random poker hands, prompting the user 
if they would like another hand to be generated (it will repeat as long the user
desires). 
*/

public static void showHands(){
    Scanner scan=new Scanner(System.in);
    int [] hand;
    String answer="";
   
   do{ 
    
     String [] suits = {"Clubs: ","Diamonds: ", "Hearts: ","Spades: "};
    String [] card = new String[5];
    
    hand = oneHand();
    
    for(int i=0;i<hand.length;i++){
      
      switch(hand[i]%13){                           //Assign face cards
            case(0):
              card [i] = "A";
              break;
             case(1):
              card [i] = "K";
              break;
             case(2):
              card [i] = "Q";
              break;
             case(3):
              card [i] = "J";
              break;
          default:
          card [i]=Integer.toString(14-(hand[i]%13)); //assign the non face cards to an index
      }
      
              suits[((int)(hand[i]/13))]+=card[i]+" ";  // Add cards to correct suit
         
    }
    
    for(int j=0;j<suits.length;j++){                    // Then print out the suits and cards
      
      System.out.println(""+suits[j]);   
    }
   
    
    
    
    
    
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
}


public static int [] oneHand(){
 int [] deck = new int [52];
 int [] hand = {-1,-1,-1,-1,-1};
 int n = 0;
 
 for(int j=0;j<52;j++){
     deck [j] = j;
 }
 
 for(int i=0; i<5;i++){
     
     n =(int) (Math.random()*(51-i));
     
     hand [i] = deck[n];
     deck[51-i]=deck[n];
 }
    return hand;
}


/*
The method simulateOdds() should randomly generate 10000 hands and 
count the number of times that a hand with a pair of a specific rank occurs,
along with the number of hands that do not have a pair
*/
    
public static void simulateOdds(){
    
    System.out.println("rank\tfreq of exactly one pair"); 
    
    int [] matches = new int[15];
    
    String [] cards = {"A\t","K\t","Q\t","J\t","10\t","9\t","8\t","7\t","6\t","5\t","4\t","3\t","2\t","----------------------------"," total not exactly one pair: "};
    
    for(int i=0;i<10000;i++){
        
        int [] x = oneHand();
        
        if(exactlyOneDup(x)){
            
            for(int b=0;b<x.length;b++){
            for(int j=0;j<x.length;j++){     //for each index check it against the others
                if(x[b]==x[j] && j!=b){     // if they are the same and not the same index
                    matches[(x[b]%13)] += 1;
                }
                
            }
            }
            
        }
        else{
            matches[14]++;
        }
    }
    
    
    for(int a=0;a<15;a++){
        if(a!=13){
        System.out.println(""+cards [a]+matches[a]);
        
        }
        else{
          System.out.println(""+cards [a]);  
        }
    }
}
    
    
    
    public static boolean exactlyOneDup(int [] x){
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
    
    
}

