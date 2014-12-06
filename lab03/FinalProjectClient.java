public class FinalProjectClient
{
	public static void main(String[] args)
	{

	boolean game= false;
	String choice1=" ";  
	int choice2=0;	
	String playagain="";
	String window="";	
		
	FinalProjectClass brian = new FinalProjectClass();
	
	brian.disclaimer();

	for(int i=0; i<15; i++) // I intend for the game to be very addictive, I have limited it so one can pnly play 15 times in a row.
	{
		if(i<1)
		{
		System.out.println ("\nType yes if you would like to take the wild journey.");
			
			choice1= SavitchIn.readLine();
			while ((!(choice1.equalsIgnoreCase("yes")))&&(!(choice1.equalsIgnoreCase("no"))))
			{
				System.out.println ("Enter a correct option.");
				choice1= SavitchIn.readLine();		
			}
		
			if( choice1.equals ("yes"))
			{
				System.out.println ("\n\nHello Player, you are now the infamous Brian Peppers, you must make real time\ndecisions which will strongly impact your outcome in this simulation.\nChoose wisely.");
				System.out.println ("Let the fun begin!\n\n");
			}
			if( choice1.equals("no"))
			{
				System.out.println ("Well enjoy your travels sir. Stay safe out there.");
				break;
			}
		}
		
	brian.decisionOne();

	choice2 =SavitchIn.readLineInt();
		while(choice2<1||choice2>4)
		{
				System.out.println ("Please enter the number that responds to the correct option");
				choice2=SavitchIn.readLineInt();
		}

		if(choice2==1)
			{
			brian.supermarket();
			}
		else if(choice2==2)
			{
			brian.playground();
			}
		else if(choice2==3)
			{
			brian.chatroom();
			}	
		else if(choice2==4)
			{
			brian.prison();
			}
	System.out.println ("\nSomeone is at the door, press enter to look out the window\n");
	window=SavitchIn.readLine();
		
	brian.policechase();
		
			System.out.println ("\n\nWould you like to PLAY AGAIN?");
			playagain=SavitchIn.readLine();
	
		if(playagain.equalsIgnoreCase("yes"))
			{
				game=true;
			}
		else if	(playagain.equalsIgnoreCase("no"))
			{
				break; 
			}
	
	}

	
	
	System.out.println ("\nThanks for playing! Stay safe out there in the real world.");	
	}
}
