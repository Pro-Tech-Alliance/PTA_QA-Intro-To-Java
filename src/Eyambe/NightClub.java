//package nightClub;
import java.util.Scanner;


public class NightClub {
	
	static Scanner sc = new Scanner(System.in);
	
	static final int Age = 21; //Static variable
	static int NewAge = 0;
	static String Gender;
	static int PaymentMethod;
	static final String GenderMale = "M";//Static variable
	static final String GenderFemale = "F";//Static variable
	static int Cash = 0;
	static int Card1 = 25,Card2 = 10,Card = 0;
	static String Output;
	
	
	public static void main(String[] args) {
		
		GetInfo();
		payement();
	

	}
	
	public static void GetInfo()
	{
		System.out.println("Enter your age ");
		NewAge = sc.nextInt();
		
		
		if(NewAge < Age)
		{
			System.out.println("Sorry you are a minor.");
		}
		
	}
	
	public static void payement()
	{
		if(NewAge < Age)
		{
			
		}
		else
		{
			sc.nextLine();
			
			System.out.println("Enter your gender ");
			
			Gender = sc.nextLine();
			
		System.out.println("Select your payment method\nEnter 1 for cash payment.\nEnter 2 for payment using your card ");
		
		PaymentMethod = sc.nextInt();
		
		if(PaymentMethod == 1 && Gender.equalsIgnoreCase(GenderMale)) {
			
			System.out.println("Enter amount ($20) ");
			
			Cash = sc.nextInt();
			
			while(Cash < 20)
			{
				System.out.println("Sorry the amount you entered is not correct.Please enter $20");
				
				Cash = sc.nextInt();
				
				System.out.println("Thank you for patronising us.Hope you have fun!!");
			}
		}
		else if(PaymentMethod == 2 && Gender.equalsIgnoreCase(GenderMale))
		{
			
			int Result;
			
			System.out.println("Select your card\nEnter 1 for Card 1 ($25).\nEnter 2 for card 2 ($10) ");
			
			Card = sc.nextInt();
			
			if(Card == 1)
			{
				Result = Card1 - 20;
				
				Output = ""+Result;
				
				System.out.println("Account deducted.\nAccount balance $"+ Output);
			}
			else if(Card == 2)
			{
				while(Card == 2)
				{
					
					System.out.println("Insufficient account balance");
					
					System.out.println("Select your card\nEnter 1 for Card 1 ($25).\nEnter 2 for card 2 ($10) ");
					
					Card = sc.nextInt();
				}
				
				Result = Card1 - 20;
				
				Output = ""+Result;
				
				System.out.println("Account deducted.\nAccount balance $"+ Output);
			}
			
		  }
		}
		
	}
}
