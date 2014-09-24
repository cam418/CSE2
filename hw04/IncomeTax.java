//////////////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw04 #1
// Income Tax Java Program
//
/*
Write a program that prompts the user to enter an int that gives the thousands 
of dollars of income and then writes out the amount of tax on the income, given
the following (progressive) schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 
and < 78, 12%; >=78, 14%. Name the program IncomeTax.java.  You should make 
certain the user enters an integer and that the integer is greater than or equal
to 0.
*/

import java.util.Scanner;

public class IncomeTax{
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);  //input
       
        System.out.print("Enter an int giving the number of thousands-"); //prompting
        
        int x = in.nextInt();
        double taxrate = 100;
        double taxes = 0;
        
        if(x == (int) x){
        
        if(x <= 20){
            taxrate = 0.05;
        }
        if(x >= 40){
            taxrate = 0.07;
        }
        if(x <= 78){
            taxrate = 0.12;
        }
        
        int z = 0;
        z = x * 1000;
        taxes = z * taxrate;
        round(taxes);
        
        
        }
        else{
            System.out.println("You did not enter an int");
                        return; //leaves the program, i.e. //the program terminates
        }
        
        
        System.out.println("The tax rate on $" + x + ",000 is " + (taxrate * 100) + '%' + ',' + " and the tax is " + taxes) ;
    }
    
    public static double round(double a){
        double fin;
        fin = Math.round(100 * a) / 100d;
    return fin;    
    }
}