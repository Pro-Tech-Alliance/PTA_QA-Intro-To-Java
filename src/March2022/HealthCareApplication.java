package March2022;

import java.util.Scanner;

public class HealthCareApplication {

static String ApplicantFirstName,
	ApplicantLastName,
	ApplicantDateOfBirth,
	ApplicantEmail,
	ApplicantAddress,
	ApplicantSSN, 
	heading= "Health Care Application";
	static int ApplicantAge;
	static double Income=0, Charge=0;
	static Scanner scanner = new Scanner (System.in);
	 
	
	 
public static void getApplicantInfo() {
		 System.out.println("Enter your First Name ?");
		 ApplicantFirstName =scanner.nextLine();
		 
		  System.out.println ("Enter your Last Name");
		  ApplicantLastName =scanner.nextLine();
		  
		  System.out.println("Enter your Age");
		  ApplicantAge =scanner.nextInt();
		  
		 System.out.println ("Enter your Date of Birth");
		 ApplicantDateOfBirth =scanner.nextLine(); 
		 
		 System.out.println ("Enter your Email");
		  ApplicantEmail =scanner.nextLine();
		 
		  System.out.println ("Enter your Address ");
		  ApplicantAddress =scanner.nextLine();
		  
		  System.out.println ("Enter your SSN");
	 ApplicantSSN =scanner.nextLine();
	  
	 	System.out.println ("Enter your Annual Income");
 	Income =scanner.nextDouble();}



public static void main(String[] args) {
getApplicantInfo();
ApplicantIncome();
ApplicantOutput();}



public static void ApplicantIncome() {
	
		if (Income>70000) {
			 Charge= 150;
		 }else if (Income>50000) {
			 Charge=30;
		 }else if (Income>40000){
			 Charge= 20;
		 }else if (Income<30000) {
			 Charge=10;
		 }
		 
	 }
	
	
public static void ApplicantOutput() {
			System.out.println (heading);
			System.out.println("FirstName:..............."+ApplicantFirstName.toUpperCase());
			System.out.println("LastName:................"+ApplicantLastName.toUpperCase());
			System.out.println("Age:....................."+ApplicantAge+"years old");
			System.out.println("Date Of Birth:............"+ApplicantDateOfBirth);
			System.out.println("Email:...................."+ApplicantEmail);
			System.out.println("Address:.................."+ApplicantAddress);
			System.out.println("SSN........................"+ApplicantSSN);
			System.out.println("Income:....................."+Income);
				
			
		  }
}
