///////////////////////////////////////////////////////////////////////////////
//Charles Mandala
//Hw02
//Arithmetic Java Program
//
/*
Use the input variables to print out, on separate lines, the item being bought,
how many of the given item is being bought, and the cost per item. Then compute 
and display the cost of each of item and the sales tax for that item. Then
compute and display the total cost of the purchases (before tax), the total
sales tax, and the total cost of the purchases (including sales tax). 
*/

//  define a class
public class Arithmetic {
    //main method
 public static void main(String[] args){
   
    //Number of pairs of socks
int nSocks          =3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$    =2.58;
double TotalsockCost$;
//Number of drinking glasses
int nGlasses        =6;

//Cost per glass
double glassCost$   =2.29;
double TotalGlassCost$ = 0;
//Number of boxes of envelopes
int nEnvelopes      =1;

//cost per box of envelopes
double envelopeCost$=3.25;
double totalenvelopeCost$;
//taxes
double taxPercent$   =0.06;

double totalSockCost$;   //total cost of socks
//Print the answers
double totalCostBeforeTax$ = (sockCost$ * nSocks) + (glassCost$ * nGlasses) + (envelopeCost$ * nEnvelopes);
double totalTax= totalCostBeforeTax$ * taxPercent$;
round(totalTax);
double finalCost = totalCostBeforeTax$ + totalTax;


//socks
System.out.println("Socks");
System.out.println(nSocks + " Socks will be bought");
System.out.println("Each sock costs $" + sockCost$);
totalSockCost$      = sockCost$ * 3;
System.out.println("The socks cost $" + totalSockCost$ +  " Before tax");
totalSockCost$ = totalSockCost$ * ( 1 + taxPercent$) ;
totalSockCost$ = round(totalSockCost$);
System.out.println("The socks cost $" + totalSockCost$ + " with tax");

//glasses

System.out.println("Glasses");
System.out.println(nGlasses + " Glasses will be bought");
System.out.println("Each glass costs $" + glassCost$);
totalGlassCost$      = glassCost$ * 3;
System.out.println("The Glasses cost $" + totalGlassCost$ +  " Before tax");
totalGlassCost$ = totalGlassCost$ * ( 1 + taxPercent$) ;
totalSockCost$ = round(totalGlassCost$);
System.out.println("The Glasses cost $" + totalGlassCost$ + " with tax");

// Envelopes

System.out.println("Envelopes");
System.out.println(nEnvelopes + " Envelopes will be bought");
System.out.println("Each envelope costs $" + envelopeCost$);
totalenvelopeCost$      = envelopeCost$ * 3;
System.out.println("The envelope cost $" + totalenvelopeCost$ +  " Before tax");
totalenvelopeCost$ = totalenvelopeCost$ * ( 1 + taxPercent$) ;
totalenvelopeCost$ = round(totalenvelopeCost$);
System.out.println("The envelopes cost $" + totalenvelopeCost$ + " with tax");



//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
System.out.println("The total cost before tax is $" + totalCostBeforeTax$);
System.out.println("The total tax is $" + totalTax$);
System.out.println("The total cost after tax is $" + finalCost);

    }
    
public static double round(double a){
    double fin;
    fin = Math.round(100 * a) / 100d;
return fin;    
}
}
