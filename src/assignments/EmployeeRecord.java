//Name: Fontem Ivan

package assignments;
import java.util.Scanner;

public class EmployeeRecord {
	
	static String empFirstName, empLastName, empMaritalStatus, empGender, heading = "Employee formula ";
	static int empAge;
	static double empSalary, empTaxesDue;
	static Scanner scanner = new Scanner(System.in);
	
	
	
public static void empDataInput() {
	
	System.out.println("What is your first name?");
	
	empFirstName = scanner.nextLine().toUpperCase();

	System.out.println("What is your Last name?");
	
	empLastName = scanner.nextLine().toUpperCase();

	System.out.println("Are you married or single?");
	
	empMaritalStatus = scanner.nextLine().toUpperCase();

	System.out.println("Are you male/female or other specify?");
	
	empGender = scanner.nextLine().toUpperCase();
	
    System.out.println("How old are you?");
	
	empAge = scanner.nextInt();
	
    System.out.println("What is your Salary");
	
	empSalary = scanner.nextDouble();

	
	
}


public static void empTaxCalculations() {
	
	if (empSalary>=60000 && empSalary <100000) {
		empTaxesDue = empSalary * 0.1;
		
	} else if (empSalary>=100000) {
		empTaxesDue = empSalary * 0.24;
		
	} else {
		
		empTaxesDue = empSalary * 0.05;
	}
}


public static void output() {
	
	System.out.println("**********"+heading+"**********");
	System.out.println();
	System.out.println("Name:................."+empFirstName+ " "+empLastName);
	System.out.println("Marital Status:......."+empMaritalStatus);
	System.out.println("Gender:..............."+empGender);
	System.out.println("Age:.................."+empAge);
	System.out.println("Salaryr:.............."+empSalary);
	System.out.println("Tax Due:.............."+empTaxesDue);
	System.out.println("A penalty of 50% awaits if not settled within 30days");
	
	
	
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empDataInput();
		empTaxCalculations();
		output();
		
		

	}

}
