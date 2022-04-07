package finalProject;
import java.util.Scanner;


public class LoginAndSignupSystem {

	static Scanner Scan = new Scanner(System.in);//INSTANTIATING AN INSTANCE OF THE SCANNER CLASS
	static LoginUnit Login = new LoginUnit();
	static WelcomeUnit Welcome = new WelcomeUnit();
	static SignUpUnit Signup = new SignUpUnit();
	
	public static void main(String[] args) {
		int Choice;
		
		System.out.println("(__/\\__)====WELCOME TO RIGGS TECHNOLOGIES====(__/\\__)");
		System.out.println("===================AUTHENTICATION PAGE=================");
		System.out.println("Enter 1 to login\nEnter 2 to signup");
		Choice = Scan.nextInt();
		if(Choice == 1)
		{
			Login.Login();//LOGIN FUNCTION.pROPERTIES INHERITED FROM SIGNUP CLASS.
			Welcome.LoginDisplay();//LOGIN DISPLAY FUNCTION
		}
		else if(Choice == 2)
		{
			
			Signup.GetFirstName();
			Signup.GetLastName();
			Signup.GetUserAge();
			Signup.GetUserPhoneNumber();
			Signup.GetUserName();
			Signup.GetUserPassword();
			
			Welcome.SignupDisplay();//SIGNUP DISPLAY FUNCTION
			
		}
		
		
	}

}

class LoginUnit extends SignUpUnit  //LOGINUNIT CLASS INHERITING PROPERTIES FROM SIGNUPUNIT CLASS
{
	
	static LoginUnit loginUnit = new LoginUnit();//INSTANTIATING AN INSTANCE OF THE LOGINUNIT CLASS
	
	public void Login()
	{
		loginUnit.GetUserName();
		
		loginUnit.GetUserPassword();
		
	}
	
}



class SignUpUnit // SIGNUP UNIT. THE BASE CLASS
{
	static String FirstName,LastName,UserName,Password;
	static int Age,Contact;
	static Scanner Scan = new Scanner(System.in);
	
	public void GetFirstName()
	{
		System.out.println("Enter first name ");
		FirstName = Scan.nextLine();
	}
	
	public void GetLastName()
	{
		System.out.println("Enter your last name ");
		LastName = Scan.nextLine();
	}
	
	public void GetUserAge()
	{
		System.out.println("Enter Age ");
		Age = Scan.nextInt();
	}
	
	public void GetUserPhoneNumber()
	{
		System.out.println("Enter your phone number ");
		Contact = Scan.nextInt();
		Scan.nextLine();
	}
	
	public void GetUserName()
	{
		System.out.println("Enter username ");
		UserName = Scan.nextLine();
	}
	
	public void GetUserPassword()
	{
		System.out.println("Enter Password ");
		Password = Scan.nextLine();
	}
}

class WelcomeUnit extends SignUpUnit{ //WELCOME UNIT EXTENDING SIGNUP CLASS 
	
	void LoginDisplay()
	{
		System.out.println("(__/\\__)========= RIGGS TECHNOLOGIES LANDING PAGE=========(__/\\__)");
		System.out.println("==========================YOUR LOGIN DETAILS========================");
		System.out.println("USERNAME :: "+UserName);
		System.out.println("PASSWORD :: "+Password);
	}
	
	void SignupDisplay()
	{
		System.out.println("(__/\\__)========= RIGGS TECHNOLOGIES LANDING PAGE=========(__/\\__)");
		System.out.println("==========================YOUR SIGNUP DETAILS=======================");
		System.out.println("FIRST NAME :: " + FirstName.toUpperCase());
		System.out.println("LAST NAME  :: " + LastName.toUpperCase());
		System.out.println("AGE        :: " + Age);
		System.out.println("CONTACT    :: " + Contact);
		System.out.println("USERNAME   :: " + UserName.toUpperCase());
		System.out.println("PASSWORD   :: " + Password.toUpperCase());
	}
	
}