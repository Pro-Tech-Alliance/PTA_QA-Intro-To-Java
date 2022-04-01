package Java_Methods;
import java.util.Scanner;



public class methods {

	static String Name,Region;
	static int Telephone,Zipcode,Age;
	static double Height,Weight;
	
	static Scanner input = new Scanner(System.in);
	
	
	//main function
	
	public static void main(String[] args) {
		//CALLING METHODS
			SetUserName();
			SetUserRegion();
			SetUserContact();
			SetUserZipCode();
			SetUserAge();
			SetUserHeight();
			SetUserWeight();
			Display();
	}

	//FUNCTION TO SET USERNAME
	public static void SetUserName()
	{
		
		System.out.println("Enter your name ");
		Name = input.nextLine();
		
	}
	
	//FUNCTION TO GET USERNAME
	public static String GetUserName()
	{
		return Name;
	}
	
	
	//FUNCTION TO SET USER'S REGION
	public static void SetUserRegion()
	{
		
		System.out.println("Enter your region (eg. Africa) ");
		Region = input.nextLine();
		
	}
	
	//FUNCTION TO GET USER'S REGION
		public static String GetUserRegion()
		{
			return Region;
		}
	
	
	//FUNCTION TO SET USER'S CONTACT
	public static void SetUserContact()
	{
		
		System.out.println("Enter your telephone number ");
		Telephone = input.nextInt();
		
	}
	
	
	//FUNCTION TO GET USER'S CONTACT
	public static int GetUserContact()
	{
		return Telephone;
	}
	
	
	//FUNCTION TO SET USER'S ZIPCODE
	public static void SetUserZipCode()
	{
		
		System.out.println("Enter your zipcode ");
		Zipcode = input.nextInt();
		
	}
	
	
	//FUNCTION TO GET USER'S ZIPCODE
	public static int GetUserZipCode()
	{
		return Zipcode;
	}
	
	
	
	//FUNCTION TO SET USER'S AGE
	public static void SetUserAge()
	{
		
		System.out.println("Enter your age ");
		Age = input.nextInt();
		
	}
	
	
	
	//FUNCTION TO GET USER'S AGE
	public static int GetUserAge()
	{
		return Age;
	}
	
	
	
	
	//FUNCTION TO SET USER'S HEIGHT
	public static void SetUserHeight()
	{
		
		System.out.println("Enter your height ");
		Height = input.nextDouble();
		
	}
	
	
	//FUNCTION TO GET USER'S HEIGHT
	public static double GetUserHeight()
	{
		return Height;
	}
	
	//FUNCTION TO SET USERWEIGHT
	public static void SetUserWeight()
	{
		
		System.out.println("Enter your weight ");
		Weight = input.nextDouble();
		
	}
			
		//FUNCTION TO GET USERWEIGHT
		public static double GetUserWeight()
		{
			return Weight;
		}
		
		
	//FUNCTION TO DISPLAY DETAILS
	
	public static void Display()
	{
		
		System.out.println("Username...................." + GetUserName());
		System.out.println("Region......................" + GetUserRegion());
		System.out.println("Contact....................." + "+"+GetUserZipCode() + " " + GetUserContact());
		System.out.println("Age........................." + GetUserAge());
		System.out.println("Height......................" + GetUserHeight());
		System.out.println("Weight......................" + GetUserWeight());
		
	}
	
	
}
