package March2022;
import java.util.Scanner;
public class EmployeeRecords {//class start

	 static String empLastName, empFirstName, empMaritalStatus, empGender,heading="Pro-Tech Alliance Employee Data";
	static double empSalary=0,empTaxesOwed=0;
	static int empAge;
	 static Scanner scanner = new Scanner(System.in);//Create an object of the Scanner class
	
	
	public static void getEmlpoyeeInputs(){
		System.out.println("Please Enter your Last Name: ");
		empLastName =scanner.nextLine();
		
		System.out.println("Please Enter your First Name: ");
		empFirstName =scanner.nextLine();
		
		System.out.println("Are you Married or Single: ");
		empMaritalStatus =scanner.nextLine();

		System.out.println("Are you a Male/Female/ Others please specify: ");
		empGender =scanner.nextLine();
		
		System.out.println("Please tell us how old you are: ");
		empAge =scanner.nextInt();
		
		System.out.println("How much do you make Annually ? : ");
		empSalary =scanner.nextDouble();
	
	}	 
	 
	
	public static void main(String[] args) {//Main method start
		getEmlpoyeeInputs();
		taxCalculation();
		output();

	}//main method end
	
	public static void taxCalculation() {
		//logical operator AND &&
		//logical operator OR ||
		
		if(empSalary >=60000 && empSalary <= 100000) {
			empTaxesOwed=empSalary * 0.1;			
		}else if(empSalary >= 100000) {
			empTaxesOwed=empSalary * 0.24;
		}else {
			empTaxesOwed=empSalary * 0.05;
		}
	}
	
	public static void output() {
		System.out.println(heading);
		System.out.println("Name : ................"+empFirstName.toUpperCase()+" "+  empLastName.toUpperCase());
		System.out.println("Marital statut: ......."+empMaritalStatus.toUpperCase());
		System.out.println("Gender: ..............."+empGender.toUpperCase());
		System.out.println("Age: .................."+empAge+"years old");
		System.out.println("Salary: ...............$"+empSalary);
		System.out.println("Tax: ..................$"+empTaxesOwed);
	}
	
	
	
	
	

}//class ends
