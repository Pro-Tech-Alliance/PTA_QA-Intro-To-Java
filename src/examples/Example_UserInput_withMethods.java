package examples;
import java.util.Scanner;

public class Example_UserInput_withMethodsE {

	public static void main(String[] args) {
		
		myInputMethod();
	}
	
	
	
	
	public static void myInputMethod() {
		
	 Scanner myscannerObject = new Scanner(System.in);  // Create a Scanner object
	 System.out.println("What is Your Name ?");
	 
	 //local variable studentName
	    String studentName = myscannerObject.nextLine();  // Read user input
	    System.out.println("Your name is: " + studentName);  // Output user input
	}
	
	

}
