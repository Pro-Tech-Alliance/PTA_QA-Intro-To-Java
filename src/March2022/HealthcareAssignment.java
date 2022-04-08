package March2022;

import java.util.Scanner;

public class HealthcareAssignment {
//fixed project
	
	static String ApplicantFirstName,
	ApplicantLastName,
	ApplicantDateOfBirth,
	ApplicantEmail,
	ApplicantAddress,
	heading= "Health Care Application";
	static int ApplicantAge=0,ApplicantSSN=0;
	static double Income=0, Charge=0;
	
	static Scanner scanner = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		getApplicantInfo();
		ApplicantIncome();
		 ApplicantOutput();

	}
	
public static void getApplicantInfo() {
	
	  System.out.println("Enter your Applicants Date of birth");
	  ApplicantDateOfBirth =scanner.nextLine();
	  
		 System.out.println("Enter your First Name ?");
		 ApplicantFirstName =scanner.nextLine();
		 
		  System.out.println("Enter your Last Name");
		  ApplicantLastName =scanner.nextLine();
		  
		  System.out.println("Enter your Email");
		  ApplicantEmail =scanner.nextLine();
		  
		  System.out.println("Enter your Address");
		  ApplicantAddress =scanner.nextLine();
		  		  
		  System.out.println("Enter your Age");
		  ApplicantAge =scanner.nextInt();
		  
		  System.out.println("Enter your Annual Income");
		  Income =scanner.nextDouble();
		  
		  System.out.println("Enter your Social Security Number");
		  ApplicantSSN =scanner.nextInt();
		  
	
		  
		  
	}

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
		System.out.println (heading.toUpperCase());
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
