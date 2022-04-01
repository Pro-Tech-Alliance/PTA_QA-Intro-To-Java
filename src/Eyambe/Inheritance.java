//package java_Inheritance;
import java.util.Scanner;


public class Inheritance extends ringTone{ //Inheritance CLASS INHERITS FROM THE rignTone CLASS
	
	static Scanner input = new Scanner(System.in);
	
	private static String WelcomeMsg = "Sound setting";
	
	static String Message;
	
	static int Command;
	
	public Inheritance() {  //Inheritance class constructor
		
		Inheritance.Message = WelcomeMsg;
		
	}

	
	public static void main(String[] args) {
		
		Inheritance inherit = new Inheritance();//Instantiating an object of the Inheritance class
		
		System.out.println(Inheritance.Message);
		
		System.out.println("Select \n0 to set the ring mode to Loud Ring \n1 to Vibration mode \n2 to Silent mode");
		Command = input.nextInt();
		
		inherit.SetRingTone(Command);//calling the setRingTone function from the ringTone class
		
		
	}

}


