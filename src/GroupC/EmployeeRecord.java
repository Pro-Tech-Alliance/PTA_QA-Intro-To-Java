package GroupC;
import java.util.Scanner;

public class EmployeeRecord {
	
static String firstName,lastName,emailAddress,Gender,maritalStatut,Department,covidVaccine,homeAddress;
static double income ,tax = 0;
static int Age,lastSSN,YearOfBirth,numberOfKids = 0;
static String phoneNumber;
static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		 employeeInfo();
		 employeeIncome();
		 employeeRecord();
	}
	
	
	public static void employeeInfo() {
		System.out.print("Enter your First Name : ");
		firstName = scr.nextLine().toUpperCase();
		System.out.print("Enter your Last Name : ");
		lastName = scr.nextLine().toUpperCase();
		System.out.print("Enter your Home Address : ");
		homeAddress = scr.nextLine();
		System.out.print("Enter your email Address : ");
		emailAddress= scr.nextLine();
		System.out.print("Enter your Phone Number : ");
		 phoneNumber = scr.nextLine();
		 System.out.print("Enter the last four of your SSN: ");
		 lastSSN = scr.nextInt();
		 scr.nextLine();
		System.out.print("Enter your Gender : ");
		Gender = scr.nextLine().toUpperCase();
		System.out.print("Enter your marital Statut : ");
		maritalStatut = scr.nextLine().toUpperCase();
		System.out.print("How many kids do you have? : ");
		numberOfKids = scr.nextInt();
		 scr.nextLine();
		System.out.print("In which department are you working? : ");
		Department = scr.nextLine().toUpperCase();
		System.out.print("Enter your year of birth : ");
		YearOfBirth = scr.nextInt();
		Age = 2022 - YearOfBirth;
		Department = scr.nextLine();
		System.out.print("Are you fully vaccinated?: ");
		covidVaccine = scr.nextLine().toUpperCase();
		System.out.print("Enter your annual income : ");
		income = scr.nextDouble();
		
	}
 
	public static void employeeIncome() {
		
		 if (income >= 60000 && income <=100000) {
			 tax = (income*10)/100;
		 }else if (income >= 100000) { 
			 tax = (income*24)/100; 
		 } else {	 
			 tax = (income *5)/100;
		 }
	}
	
	public static void employeeRecord() {
		System.out.println(" ******EMPLOYEE RECORD ******\n");
		System.out.println("Name:                  "  +firstName+","+lastName );
		System.out.println("Address:               "  +homeAddress );
		System.out.println("Email address:         "  +emailAddress );
		System.out.println("Phone Number:          "  +phoneNumber);
		System.out.println("Last four of your SSN: "  +lastSSN);
		System.out.println("Gender:                "  +Gender);
		System.out.println("Marital Statut:        "  +maritalStatut);
		System.out.println("Age:                   "  +Age);
		System.out.println("Covid Vaccine Statut:  "  +covidVaccine);
		System.out.println("Number of Kids :          "  +numberOfKids);
		System.out.println("Annual Income:         "  +  income);
		System.out.println("Annual tax :          "  +tax);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

