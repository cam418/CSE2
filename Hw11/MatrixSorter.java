public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
   public static int [][][] buildMat3d(){
       
       int[][][] array = new int [3][][];
      
       
       int a=0;
       for(int s=0;s<3;s++){
           a=s*2+3;
           for(int j=0; j<a;j++){
               for(int i=0;i<s+j;i++){
                   array[a][j][i] = ((int)((Math.random()*100)));
               }
           }
       }
       
       
       return array;
   }
   
   public static void show(int [][][] array){
       for(int i=0;i<array.length;i++){
           System.out.println("---------------------------Slab " + i);
           for(int j=0;j<i;j++){
               for(int k=0;k<j;k++){
                   System.out.print(""+array[i][j][k]+" ");
               }
                System.out.println();
           }
       }
   }
   
   public static int findMin(int [][][] array){
       
       int ans=0;
       
       for(int i=0; i<array.length;i++){
           for(int j=0;j<array[i].length;j++){
               for(int k=0;k<array[i][j].length-1;k++){
                   
                       if(array[i][j][k]>array[i][j][k+1]){
                           ans= array[i][j][k+1];
                       }
                   
               }
           }
       }
    
    return ans;   
   }
   
   public static void sort(int [][] array){
       
        int tempValue;                            // Linear Sort
       
      for(int x=0;x<array.length;x++){
          for(int y=0;y<array[x].length-1;y++){
              for(int z=y;z<array[x].length;z++){
                  if(array[y][z]>array[y][z+1]){
                      tempValue = array[y][z];
                      array[y][z] = array[y][z+1];
                      array[y][z+1] = tempValue;
                  }
              }
          }
          
          
      } 
      
       int [] temp = array[0];                     //selection sort
       int a=100;
       
       for(int i=0; i<(array.length-1);i++){
           if(array[i][0]>array[i+1][0]){
               array[i]=temp;
               array[i]=array[i+1];
               array[i+1]=temp;
               
               if(i!=0 && a!=0){
                   while(array[i][0]>array[i-1][0]){
                    a=i;
                    array[a-1]=temp;
                    array[a-1]=array[a];
                    array[a]=temp;
                    a--;
               }
               }
           }
       }
   }
   
   
}

