import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class PokerHands{

public static void main(String [] arg){
    
    int [] hand;
    String answer="";
    
    do{
      
      
      
    String [] suits = {"Clubs: ","Diamonds: ", "Hearts: ","Spades: "};
    String [] card = new String[5];
    
    hand = buildHand();                                               // Set Hand --------------------------------------
    
    printHand(hand);                                                // Print Hand to user -------------------------------------
    
    System.out.println("This is a " + rankHand(hand)+".");         // Print Rank of Hand   -------------------------------------------------
      
      
      Scanner scan=new Scanner(System.in);                          // GO again?------------------------------------------------------------
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next(); 
    }while(answer.equals("Y") || answer.equals("y"));
  }
  
  public static int [] buildHand(){
      
    Scanner scan=new Scanner(System.in);
    String [] suit = new String [5];
    String [] card = new String [5];
    int [] hand = new int [52];
    int x = 0;
    int cardindex;
    
    for(int i=0;i<5;i++){
    
    System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); 
    
    suit[i] = scan.nextLine();
    while((suit[i].equals("c") || suit[i].equals("d") || suit[i].equals("h") || suit[i].equals("s")) == false){   
     System.out.println("You did not enter a valid response"); 
     System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); 
     suit[i] = scan.nextLine();
    }
       
     System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- "); 
    Scanner myScan = new Scanner(System.in);
    card[i] = myScan.nextLine();
    while((card[i].equals("a") || card[i].equals("k") || card[i].equals("q") || card[i].equals("j") || card[i].equals("2") || card[i].equals("3") || card[i].equals("4") || card[i].equals("5") || card[i].equals("6") || card[i].equals("7") || card[i].equals("8") || card[i].equals("9") || card[i].equals("10")) == false){   
     System.out.println("You did not enter a valid response"); 
     System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- "); 
     card[i] = myScan.nextLine();
     
    }
    
    
    
    switch(suit[i]){
        case("c"):
            x=0;
            break;
        case("d"):
            x=13;
            break;
        case("h"):
            x=26;
            break;
        case("s"):
            x=39;
            break;
        
    }
    
    switch(card[i]){
        case("a"):
            cardindex=0;
            break;
        case("k"):
            cardindex=1;
            break;
        case("q"):
            cardindex=2;
            break;
        case("j"):
            cardindex=3;
            break;
        default:
            cardindex=(14 - Integer.parseInt(card[i]));

    }
    hand[i]=x + cardindex;
    
    }
    
    return hand;
  }
  
  
  public static String rankHand(int [] hand){
    
    boolean [] ranks = {false,false,false,false,false,false,false,false,false}; 
    String [] names = {"One Pair","Two Pair","Three of a Kind","Straight", "Flush", "Full House", "Four of a Kind", "Straight Flush", "Royal Flush"};
    
    String ans="High Card";
    
    
    int [] frequency = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    for(int a=0;a<4;a++){
        for(int b=a+1;b<5;b++){
            if((hand[a]%13)==(hand[b]%13)){
                frequency[hand[a]]++;
            }
            for(int c=b+1;c<5;c++){
                if(hand[a]==hand[b] && hand[c]==hand[a]){
                   ranks[2]=true; 
                }
            }
        }
    }
    
    int n=0;
    for(int z=0;z<13;z++){
        if(frequency[z]==1){
            ranks[0]=true;
            n++;
        }
        if(frequency[z]==2 && (ranks[2])==false){
            ranks[6]=true;
        }
    }
    if(n==2){
        ranks[1]=true;
    }
    
    
    
   if(((int)(hand[0]/13)) == ((int)(hand[1]/13)) && ((int)(hand[2]/13)) == ((int)(hand[3]/13)) && ((int)(hand[4]/13)) == ((int)(hand[0]/13)) ){
       ranks[4]=true;
   }
   
   if(ranks[3] && ranks[4]){
    ranks[7]=true;   
   }
    if(ranks[7]){
        if((hand[0]%13)==0 || (hand[1]%13)==0 || (hand[2]%13)==0 || (hand[3]%13)==0 || (hand[4]%13)==0 ){
            if((hand[0]%13)==1 || (hand[1]%13)==1 || (hand[2]%13)==0 || (hand[3]%13)==1 || (hand[4]%13)==1){
                 if((hand[0]%13)==2 || (hand[1]%13)==2 || (hand[2]%13)==2 || (hand[3]%13)==2 || (hand[4]%13)==2){
                      if((hand[0]%13)==3 || (hand[1]%13)==3 || (hand[2]%13)==3 || (hand[3]%13)==3 || (hand[4]%13)==3){
                           if((hand[0]%13)==4 || (hand[1]%13)==4 || (hand[2]%13)==4 || (hand[3]%13)==4 || (hand[4]%13)==4){
                                ranks[8]=true;
                           }
                      }
                 }
            }
        }
    }
    if(ranks[0] && ranks[1] && ranks[2]){
        ranks[5]=true;
    }
      for(int i=0;i<9;i++){
          if(ranks[i]=true){
              ans = names[i];
          }
      }
      
    return ans;  
  }
  
  public static void printHand(int hand[]){
  // THIS PRINTS OUT TO THE USER THE CARDS CHOSEN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
     String [] suits = {"Clubs: ","Diamonds: ", "Hearts: ","Spades: "};
    String [] card = new String[5];
    
    for(int i=0;i<5;i++){
      
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
    
    // THIS PRINTS OUT TO THE USER THE CARDS CHOSEN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}