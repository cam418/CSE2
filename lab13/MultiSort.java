
import java.util.Random;
import java.util.Arrays;

public class MultiSort{
  public static void main(String [] arg){
      
      int [] [] array = new int [5] [];
      
      for(int i=0;i<5;i++){
          
         
              
              array [i] = new int [(i*3+5)];
              
              for(int k=0;k<(i*3+5);k++){
          
          
                array [i][k] = (int) (Math.random()*39);
                System.out.print(array[i][k]+ "\t");
          
            }
          
         System.out.println();
      }
      
      System.out.println();
      
      for (int a=0;a<5;a++){
          
          Arrays.sort(array[a]);
          
          
          
          for(int b=0;b<array[a].length;b++){
              System.out.print(array[a][b]+ "\t");
          }
          System.out.println();
      }
      
      
  }
}
 