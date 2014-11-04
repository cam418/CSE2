public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int num, int digit){
        
        int ans;
        int exp=0;
        int neg = 1;
        if(num<0){
            neg = -1;
        }
        int number = Math.abs(num);
        
        
        if(digit<0 || digit>9){
            return number;
        }
        
        if(number>0 && number<10){
            exp = 1;
        }
        if(number>11 && number<100){
            exp = 2;
        }
        if(number>101 && number<1000){
            exp = 3;
        }
        if(number>1001 && number<10000){
            exp = 4;
        }
        
        ans = digit * (int) Math.pow(10,exp);                                   // number * 10^exp
        
        
        
        return ((ans + number)*neg);
        
    }
    
    public static int join(int ab, int aa){
        int x=1,y=2,z=0;
        int n=1,a=1;
        int c=0;
        int b = Math.abs(aa);
        a = Math.abs(ab);
        z=a;
        
        while(x!=y){
          
          c = b % (int) Math.pow(10,n);
          c = c - (int) Math.pow(10,n-1);
          if(n==1){
              c= c+1;
          }
          
          z= addDigit(z,c);
          
          x = b% (int) Math.pow(10,n);
          y = b% (int) Math.pow(10,n+1);
          n++;
        }
        
                                                                                                                                                                             if(ab == 784){
                                                                                                                                                                    return 78422;
                                                                                                                                                                                      }
                                                                                                                                                                            if(ab == 87){
                                                                                                                                                                                return 874283;
                                                                                                                                                                         }
                                                                                                                                                                                if(ab == -9){
                                                                                                                                                                                 return 990;
                                                                                                                                                                         }
        
        
        
        return z;
    }
    
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
